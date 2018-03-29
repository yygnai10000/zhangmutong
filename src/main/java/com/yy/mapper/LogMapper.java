package com.yy.mapper;

import com.yy.pojo.Log;
import java.util.List;
import java.util.Map;

public interface LogMapper {

    int insertSelective(Log record);
    List<Log> selectDay(Map<String,Object> stringObjectMap);
}