package com.yy.utils;

import ch.qos.logback.core.db.dialect.MsSQLDialect;
import freemarker.core.ReturnInstruction;

/**
 * @Author: 595703420@qq.com
 * @Date: 2018/2/14.
 */
public class ResultUtils {
    /**
     * 返回成功方法
     * 返回结果中没有具体内容，只有成功标识信息
     * @return  结果对象resultlClass
     */
    public static ResultClass ok(){
        ResultClass resultClass=new ResultClass();
        resultClass.setStatus(200);
        return resultClass;
    }
    /**
     * 带内容返回
     */
    public static ResultClass ok(Object object){
        ResultClass resultClass=new ResultClass();
        resultClass.setStatus(200);
        resultClass.setContent(object);
        return  resultClass;
    }

    /**
     * 静态返回错误方法
     * 返回结果中没有具体内容，只有错误标识信息
     * @return  结果对象resultlClass
     */
    public static ResultClass error(String msg){
        ResultClass resultClass=new ResultClass();
        resultClass.setStatus(400);
        resultClass.setMsg(msg);
        return resultClass;
    }

}
