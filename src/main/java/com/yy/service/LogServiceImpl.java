package com.yy.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sun.activation.registries.LogSupport;
import com.yy.mapper.LogMapper;
import com.yy.pojo.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.*;

/**
 * @Author: 595703420@qq.com
 * @Date: 2018/3/3.
 */
@Service
public class LogServiceImpl implements LogService{
    @Autowired
    private LogMapper logMapper;

    public  PageInfo<Log> queryday(int page,int limit,int day){
        Map<String, Object> map = new HashMap<>();
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        PageHelper.startPage(page,limit);

        Date endTime = new Date();
        map.put("endTime",sdf.format(endTime));
        Date startTime = new Date(endTime.getTime() - (24 * 60 * 60 * 1000)*day);
        map.put("startTime",sdf.format(startTime));
        List<Log> logs = logMapper.selectDay(map);

        //分页处理
        PageInfo<Log> pageInfo=new PageInfo<>(logs);
        return pageInfo;
    }

}
