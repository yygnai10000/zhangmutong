package com.yy.service;

import com.yy.mapper.AdminMapper;
import com.yy.pojo.Admin;
import com.yy.pojo.AdminExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2018/2/13.
 */
@Service
public class AdminServiceImpl implements AdminService {

    @Autowired
    private AdminMapper adminMapper;
    @Override
    public Admin verifyName(String adminName) {
        AdminExample adminExample=new AdminExample();
        AdminExample.Criteria criteria = adminExample.createCriteria();
        criteria.andAdminnameEqualTo(adminName);
        List<Admin> admins = adminMapper.selectByExample(adminExample);
        if( admins.size()>0){
            return admins.get(0);
        }
        return null;
    }

    @Override
    public Admin verifyAdminNameAndPassword(String adminname, String password) {
        AdminExample adminExample=new AdminExample();
        AdminExample.Criteria criteria = adminExample.createCriteria();
        criteria.andAdminnameEqualTo(adminname);
        criteria.andPasswordEqualTo(password);
        List<Admin> admins = adminMapper.selectByExample(adminExample);
        if(admins.size()>0){
            return admins.get(0);
        }
        return null;
    }
}
