package com.yy.controller;

import com.github.pagehelper.PageInfo;
import com.yy.pojo.Car;
import com.yy.service.CarManageService;
import com.yy.utils.LayuiPageResult;
import com.yy.utils.ResultClass;
import com.yy.utils.ViewAndDataSwitchUtils;
import com.yy.viewpojo.ViewCar;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author: 595703420@qq.com
 * @Date: 2018/2/24.
 */
@Controller
public class CarManageController {

    @Autowired
    private CarManageService catManageService;

    /**
     * 分页查询cat全部信息
     * @param page
     * @param limit
     * @return
     */
    @RequestMapping(value = "/catmanage/pagequery",method = RequestMethod.GET)
    @ResponseBody
    public LayuiPageResult<ViewCar> pagequery(int page, int limit){
        PageInfo<Car> pageInfo =catManageService.pagequery(page,limit);
        //将数据层cat装换为视图层vcat
        List<ViewCar> vcats=new ArrayList<>();
        for(Car cat:pageInfo.getList()){
            vcats.add(ViewAndDataSwitchUtils.CarToVcar(cat));
        }
        //创建返回结果对象
        LayuiPageResult<ViewCar> result = new LayuiPageResult<ViewCar>();
        result.setData(vcats);
        result.setCount((int) pageInfo.getTotal());
        result.setCode(0);
        return  result;
    }

    /**
     * 删除cat信息
     * @return 删除成功
     */
    @RequestMapping(value = "/catmanage/delete",method = RequestMethod.GET)
    @ResponseBody
    public ResultClass delCat(String catid){
        return  catManageService.delCat(catid);
    }

    /**
     *  跟新车辆信息
     * @param cat  视图层cat
     * @return
     * @throws ParseException
     */
    @RequestMapping(value = "/catmanage/updata",method = RequestMethod.GET)
    @ResponseBody
    public ResultClass updata( ViewCar cat) throws ParseException {
        return catManageService.updata(cat);
    }

    /**
     *  新增cat
     * @param cat 视图层cat
     * @return
     */
    @RequestMapping(value = "/catmanage/addcat",method = RequestMethod.POST,produces ="application/json;charset=UTF-8")
    @ResponseBody
    public ResultClass addCat(@RequestBody ViewCar cat) throws ParseException {
        ResultClass resultClass = catManageService.addCat(cat);
        return resultClass ;
    }
}
