package com.yy.service;

import com.yy.pojo.Admin;

/**
 * Created by Administrator on 2018/2/13.
 */
public interface AdminService  {

    Admin verifyName(String adminName);

    Admin verifyAdminNameAndPassword(String adminname, String password);
}
