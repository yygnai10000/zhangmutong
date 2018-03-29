package com.yy.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.yy.mapper.LogMapper;
import com.yy.pojo.Admin;
import com.yy.pojo.Log;
import com.yy.service.LogService;
import com.yy.utils.LayuiPageResult;
import com.yy.utils.LogUtils;
import com.yy.utils.ViewAndDataSwitchUtils;
import com.yy.viewpojo.ViewLog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * @Author: 595703420@qq.com
 * @Date: 2018/3/3.
 */
@Controller
public class LogController {
    @Autowired
    private LogMapper logMapper;
    @Autowired
    private LogService logService;

    /**
     * 操作记录天查询
     * @return
     */
    @RequestMapping(value = "/log/queryday/{day}",method = RequestMethod.GET)
    @ResponseBody
    public LayuiPageResult<ViewLog> queryday(int page, int limit, @PathVariable(name="day")int day, HttpServletRequest request){
        //查询天数做判断
        if(day==0){
            day=1;
        }
        HttpSession session = request.getSession();
        //调用服务出来请求
        PageInfo<Log> pageInfo = logService.queryday(page, limit,day);
        //创建返回结果
        LayuiPageResult<ViewLog> pageResult=new LayuiPageResult<>();

        pageResult.setCode(0);
        pageResult.setCount((int)pageInfo.getTotal());
        //视图pojo 数据pojo转换
        List<Log> list = pageInfo.getList();
       ;
        List<ViewLog> viewLogs = ViewAndDataSwitchUtils.LogsToViews(list);
        pageResult.setData(viewLogs);
        //请求日志写入
        Admin admin = (Admin) session.getAttribute("admin");
        Log log = LogUtils.getLog("管理员：" + admin.getAdminname() + "在ip:"+LogUtils.getIpAdrress(request)+"请求了查询最近一天操作记录并且成功返回一天操作数据记录的第："+page+"页");
        logMapper.insertSelective(log);
        return pageResult;
    }

    /**
     *  自定义时间段查询操作记录
     * @param page
     * @param limit
     * @param request
     * @return
     */
    @RequestMapping(value = "/log/querydefined")
    @ResponseBody
    public LayuiPageResult<ViewLog> querydefined(int page, int limit, HttpServletRequest request){
        LayuiPageResult<ViewLog> result=new LayuiPageResult<ViewLog>();




        return result;
    }

}
