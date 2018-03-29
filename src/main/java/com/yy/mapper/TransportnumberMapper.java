package com.yy.mapper;

import com.yy.pojo.Transportnumber;
import com.yy.pojo.TransportnumberExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TransportnumberMapper {
    int countByExample(TransportnumberExample example);

    int deleteByExample(TransportnumberExample example);

    int deleteByPrimaryKey(String transportid);

    int insert(Transportnumber record);

    int insertSelective(Transportnumber record);

    List<Transportnumber> selectByExample(TransportnumberExample example);

    Transportnumber selectByPrimaryKey(String transportid);

    int updateByExampleSelective(@Param("record") Transportnumber record, @Param("example") TransportnumberExample example);

    int updateByExample(@Param("record") Transportnumber record, @Param("example") TransportnumberExample example);

    int updateByPrimaryKeySelective(Transportnumber record);

    int updateByPrimaryKey(Transportnumber record);
}