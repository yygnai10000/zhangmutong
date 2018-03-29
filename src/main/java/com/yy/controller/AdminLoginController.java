package com.yy.controller;

import com.yy.mapper.LogMapper;
import com.yy.pojo.Admin;
import com.yy.pojo.Log;
import com.yy.service.AdminService;
import com.yy.utils.LogUtils;
import com.yy.utils.ResultClass;
import com.yy.utils.ResultUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;


/**
 * Created by Administrator on 2018/2/13.
 */
@Controller
public class AdminLoginController {

    @Autowired
    private AdminService adminService;
    @Autowired
    private LogMapper logMapper;
    /**
     *  管理员登录页面请求
     * @return
     */
    @RequestMapping(value = "/login",method = RequestMethod.GET)
    public String loginPage(){
        return "login/login";
    }

    /**
     * 登录求成功跳转页面
     */
    @RequestMapping(value = "/admin/{url}",method = RequestMethod.GET)
    public String home(@PathVariable(name = "url") String url ){
        String lujing="home/"+url;
        //写入操作管理日志
        return lujing;
    }
    /**
     * 管理员登录
     */
    @RequestMapping(value ="/admin/login",method = RequestMethod.POST)
    @ResponseBody
    public ResultClass adminLogin(Admin admin, HttpServletRequest request){
        //非空校验
        if (StringUtils.isBlank(admin.getAdminname()) || StringUtils.isBlank(admin.getPassword())){
            Log log = LogUtils.getLog("id:" + LogUtils.getIpAdrress(request) + "使用空的账号或密码请求登录，登录失败！");
            logMapper.insertSelective(log);
            return ResultUtils.error("账号和密码不能为空");
        }
        //验证账户密码
        Admin admin1=adminService.verifyAdminNameAndPassword(admin.getAdminname(),admin.getPassword());
        if(admin1 ==null){
            Log log= LogUtils.getLog("id:"+ LogUtils.getIpAdrress(request)+"使用"+admin.getAdminname()+"账号请求登录，账号密码不对，登录失败！");
            logMapper.insertSelective(log);
            return ResultUtils.error("账户密码啊错误");
        }
        //将用户信息存入session
        HttpSession session = request.getSession();
        session.setAttribute("admin",admin1);
        //登录成功 写入日志
        Log log = LogUtils.getLog("管理员：" + admin1.getAdminname() + "成功登录！登录ip：" + LogUtils.getIpAdrress(request)+"并成功登录了管理页面");
        logMapper.insertSelective(log);
        //返回登录成功结果
        return ResultUtils.ok();
    }

    /**
     *  异步账号验证方法
     * @return 账号是否正确
     */
    @RequestMapping(value = "/admin/name")
    @ResponseBody
    public ResultClass verifyName(String adminName){
       Admin admin=adminService.verifyName(adminName);
       if(admin==null){
           return ResultUtils.error("账户不存在");
       }
       return ResultUtils.ok();
    }
}