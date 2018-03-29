package com.yy.controller;

import com.github.pagehelper.PageInfo;
import com.yy.pojo.Driver;
import com.yy.service.DriverService;
import com.yy.utils.LayuiPageResult;
import com.yy.utils.ResultClass;
import com.yy.utils.ViewAndDataSwitchUtils;
import com.yy.viewpojo.ViewDriver;
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
 * 司机controller类
 * @Author: 595703420@qq.com
 * @Date: 2018/3/1.
 */
@Controller
public class DriverController {

    @Autowired
    private DriverService driverService;

    /**
     *  司机信息分页查询
     * @param page 第几页
     * @param limit 每页显示数据条数
     * @param content 模糊查询条件内容
     * @param findignore 否是忽略作废信息
     * @return
     */
    @RequestMapping(value = "/driver/pagequery",method = RequestMethod.GET)
    @ResponseBody
    public LayuiPageResult<ViewDriver> pagequery(int page, int limit,String content,String findignore){
        // 初始状态或者刷新时 findignore为null
        if (findignore ==null || findignore==""){
            findignore="0";
        }
        PageInfo<Driver> pageInfo =driverService.pagequery(page,limit,content,findignore);
        //将数据层Driver装换为视图层VDriver
        List<ViewDriver> drivers=new ArrayList<>();
        for(Driver driver:pageInfo.getList()){
            drivers.add(ViewAndDataSwitchUtils.DriverToVDriver(driver));
        }
        //创建返回结果对象
        LayuiPageResult<ViewDriver> result = new LayuiPageResult<ViewDriver>();
        result.setData(drivers);
        result.setCount((int) pageInfo.getTotal());
        result.setCode(0);
        return  result;
    }

    /**
     *
     * @param driver 参数接收
     * @return
     * @throws ParseException
     */
    @RequestMapping(value = "/driver/updata",method = RequestMethod.GET)
    @ResponseBody
    public ResultClass updata(ViewDriver driver) throws ParseException {
        return driverService.updata(driver);
    }

    /**
     *  作废司机信息
     * @param driverid 作废司机id
     * @return
     */
    @RequestMapping(value = "/driver/delete",method = RequestMethod.GET)
    @ResponseBody
    public ResultClass delete(Integer driverid){
        ViewDriver viewDriver=new ViewDriver();
        viewDriver.setDriverid(driverid);
        viewDriver.setDriverstatus("离职");
        return driverService.updata(viewDriver);
    }

    /**
     * 新增司机
     * @param viewDriver
     * @return
     */
    @RequestMapping(value = "/driver/add",method =RequestMethod.POST)
    @ResponseBody
    public ResultClass add(@RequestBody ViewDriver viewDriver){
        //传递的参数 进行合法判断
        return driverService.add(viewDriver);
    }
}
