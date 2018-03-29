package com.yy.viewpojo;

import java.util.Date;

/**
 *  车次信息视图pojo 用于显示信息
 * @Author: 595703420@qq.com
 * @Date: 2018/2/28.
 */
public class ViewCarNumber {
    //车次序号 用时间戳
    private Integer numberid;

    private String startsite;

    private String endsite;

    private String starttime;

    private String endtime;

    private Integer driverid;

    private String carid;

    public Integer getNumberid() {
        return numberid;
    }

    public void setNumberid(Integer numberid) {
        this.numberid = numberid;
    }

    public String getStartsite() {
        return startsite;
    }

    public void setStartsite(String startsite) {
        this.startsite = startsite;
    }

    public String getEndsite() {
        return endsite;
    }

    public void setEndsite(String endsite) {
        this.endsite = endsite;
    }

    public String getStarttime() {
        return starttime;
    }

    public void setStarttime(String starttime) {
        this.starttime = starttime;
    }

    public String getEndtime() {
        return endtime;
    }

    public void setEndtime(String endtime) {
        this.endtime = endtime;
    }

    public Integer getDriverid() {
        return driverid;
    }

    public void setDriverid(Integer driverid) {
        this.driverid = driverid;
    }

    public String getCatid() {
        return carid;
    }

    public void setCatid(String catid) {
        this.carid = carid;
    }

    public ViewCarNumber() {
    }

    public ViewCarNumber(Integer numberid, String startsite, String endsite, String starttime, String endtime, Integer driverid, String carid) {
        this.numberid = numberid;
        this.startsite = startsite;
        this.endsite = endsite;
        this.starttime = starttime;
        this.endtime = endtime;
        this.driverid = driverid;
        this.carid = carid;
    }
}
