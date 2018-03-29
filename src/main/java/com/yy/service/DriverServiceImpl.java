package com.yy.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.yy.mapper.DriverMapper;
import com.yy.pojo.Driver;
import com.yy.pojo.DriverExample;
import com.yy.utils.ResultClass;
import com.yy.utils.ResultUtils;
import com.yy.utils.ViewAndDataSwitchUtils;
import com.yy.viewpojo.ViewDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Driver服务实现类
 *
 * @Author: 595703420@qq.com
 * @Date: 2018/3/1.
 */
@Service
public class DriverServiceImpl implements DriverService {

    @Autowired
    private DriverMapper driverMapper;

    /**
     *
     * @param page
     * @param limit
     * @param content   模糊查询姓名 内容
     * @param findignore  是否忽略离职司机 0 忽略 1 不忽略
     * @return
     */
    @Override
    public PageInfo<Driver> pagequery(int page, int limit, String content, String findignore) {
        PageHelper.startPage(page, limit);
        DriverExample example = new DriverExample();
        DriverExample.Criteria criteria = example.createCriteria();
        if(findignore == "0"){
            criteria.andDriverstatusNotEqualTo(99);
        }
        if (findignore!=null && findignore!=""){
            criteria.andDrivernameLike(findignore);
        }
        List<Driver> drivers = driverMapper.selectByExample(example);
        PageInfo<Driver> pageInfo=new PageInfo<>(drivers);
        return pageInfo;
    }

    @Override
    public ResultClass updata(ViewDriver viewDriver) {
        Driver driver = ViewAndDataSwitchUtils.VDriverToDriver(viewDriver);
        driverMapper.updateByPrimaryKeySelective(driver);
        return ResultUtils.ok();
    }

    /**
     * 新增司机
     * @param viewDriver
     * @return
     */
    @Override
    public ResultClass add(ViewDriver viewDriver) {
        //视图层对象转化
        Driver driver;
        try {
            driver = ViewAndDataSwitchUtils.VDriverToDriver(viewDriver);
        } catch (Exception e) {
            e.printStackTrace();
            return ResultUtils.error("录入信息不合法");
        }
        //存入数据库
        driverMapper.insertSelective(driver);
        return ResultUtils.ok();
    }


}
