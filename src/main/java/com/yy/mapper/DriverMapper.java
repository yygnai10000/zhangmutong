package com.yy.mapper;

import com.yy.pojo.Driver;
import com.yy.pojo.DriverExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DriverMapper {
    int countByExample(DriverExample example);

    int deleteByExample(DriverExample example);

    int deleteByPrimaryKey(Integer driverid);

    int insert(Driver record);

    int insertSelective(Driver record);

    List<Driver> selectByExample(DriverExample example);

    Driver selectByPrimaryKey(Integer driverid);

    int updateByExampleSelective(@Param("record") Driver record, @Param("example") DriverExample example);

    int updateByExample(@Param("record") Driver record, @Param("example") DriverExample example);

    int updateByPrimaryKeySelective(Driver record);

    int updateByPrimaryKey(Driver record);
}