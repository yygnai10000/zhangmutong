package com.yy.service;

import com.github.pagehelper.PageInfo;
import com.yy.pojo.Log;

/**
 * @Author: 595703420@qq.com
 * @Date: 2018/3/3.
 */
public interface LogService {
    PageInfo<Log> queryday(int page, int limit,int day);
}
