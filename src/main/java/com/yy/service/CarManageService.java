package com.yy.service;

import com.github.pagehelper.PageInfo;
import com.yy.pojo.Car;
import com.yy.utils.ResultClass;
import com.yy.viewpojo.ViewCar;

import java.text.ParseException;

/**
 * @Author: 595703420@qq.com
 * @Date: 2018/2/24.
 */
public interface CarManageService {
    PageInfo<Car> pagequery(int page, int limiti);
    ResultClass delCat(String catid);
    ResultClass updata(ViewCar cat) throws ParseException;

    ResultClass addCat(ViewCar cat) throws ParseException;
}
