package com.yy.mapper;

import com.yy.pojo.Carnumber;
import com.yy.pojo.CarnumberExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CarnumberMapper {
    int countByExample(CarnumberExample example);

    int deleteByExample(CarnumberExample example);

    int deleteByPrimaryKey(Integer number);

    int insert(Carnumber record);

    int insertSelective(Carnumber record);

    List<Carnumber> selectByExample(CarnumberExample example);

    Carnumber selectByPrimaryKey(Integer number);

    int updateByExampleSelective(@Param("record") Carnumber record, @Param("example") CarnumberExample example);

    int updateByExample(@Param("record") Carnumber record, @Param("example") CarnumberExample example);

    int updateByPrimaryKeySelective(Carnumber record);

    int updateByPrimaryKey(Carnumber record);
}