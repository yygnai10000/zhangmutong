package com.yy.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.yy.mapper.CarMapper;
import com.yy.pojo.Car;
import com.yy.pojo.CarExample;
import com.yy.utils.ResultClass;
import com.yy.utils.ResultUtils;
import com.yy.utils.ViewAndDataSwitchUtils;
import com.yy.viewpojo.ViewCar;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.util.List;

/**
 * @Author: 595703420@qq.com
 * @Date: 2018/3/3.
 */
@Service
public class CarManageServiceImpl implements CarManageService{


    @Autowired
    private CarMapper carMapper;

    /**
     * 分页查询全部车辆信息
     *
     * @param page
     * @param limiti
     * @return
     */
    @Override
    public PageInfo<Car> pagequery(int page, int limiti) {
        PageHelper.startPage(page, limiti);
        CarExample carExample = new CarExample();
        carExample.setOrderByClause("buytime desc");

        List<Car> cats = carMapper.selectByExample(carExample);
        //取总数
        PageInfo<Car> pageInfo = new PageInfo<>(cats);
        return pageInfo;
    }

    /**
     * 删除车辆信息
     *
     * @param carid 车牌号
     * @return
     */
    @Override
    public ResultClass delCat(String carid) {
        carMapper.deleteByPrimaryKey(carid);
        return ResultUtils.ok();
    }

    /**
     * 更新车辆信息
     *
     * @param vcar 视图层cat对象
     * @return
     */
    @Override
    public ResultClass updata(ViewCar vcar) throws ParseException {
        Car car = ViewAndDataSwitchUtils.VcarToCar(vcar);
        //更改信息
        carMapper.updateByPrimaryKeySelective(car);
        return ResultUtils.ok();
    }

    /**
     * 新增cat
     *
     * @param vcar 视图cat
     * @return
     */
    @Override
    public ResultClass addCat(ViewCar vcar) throws ParseException {
        Car cat = ViewAndDataSwitchUtils.VcarToCar(vcar);
        Car car = carMapper.selectByPrimaryKey(vcar.getCarid());
        if(car !=null){
            return ResultUtils.error("车牌已经存在，请重新录入！");
        }
        carMapper.insertSelective(cat);
        return ResultUtils.ok();
    }


}
