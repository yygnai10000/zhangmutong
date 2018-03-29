package com.yy.service;

import com.github.pagehelper.PageInfo;
import com.yy.pojo.Driver;
import com.yy.utils.ResultClass;
import com.yy.viewpojo.ViewDriver;

/**
 * @Author: 595703420@qq.com
 * @Date: 2018/3/1.
 */
public interface DriverService {
    PageInfo<Driver> pagequery(int page, int limit, String content, String findignore);

    ResultClass updata(ViewDriver driver);

    ResultClass add(ViewDriver viewDriver);
}
