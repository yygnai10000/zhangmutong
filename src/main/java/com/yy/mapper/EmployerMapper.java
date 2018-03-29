package com.yy.mapper;

import com.yy.pojo.Employer;
import com.yy.pojo.EmployerExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface EmployerMapper {
    int countByExample(EmployerExample example);

    int deleteByExample(EmployerExample example);

    int deleteByPrimaryKey(Integer employerid);

    int insert(Employer record);

    int insertSelective(Employer record);

    List<Employer> selectByExample(EmployerExample example);

    Employer selectByPrimaryKey(Integer employerid);

    int updateByExampleSelective(@Param("record") Employer record, @Param("example") EmployerExample example);

    int updateByExample(@Param("record") Employer record, @Param("example") EmployerExample example);

    int updateByPrimaryKeySelective(Employer record);

    int updateByPrimaryKey(Employer record);
}