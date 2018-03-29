package com.yy.pojo;

import java.util.Date;

public class Carnumber {
    private Integer number;

    private String startsite;

    private String endsite;

    private Date starttime;

    private Date endtime;

    private Integer driverid;

    private String catid;

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getStartsite() {
        return startsite;
    }

    public void setStartsite(String startsite) {
        this.startsite = startsite == null ? null : startsite.trim();
    }

    public String getEndsite() {
        return endsite;
    }

    public void setEndsite(String endsite) {
        this.endsite = endsite == null ? null : endsite.trim();
    }

    public Date getStarttime() {
        return starttime;
    }

    public void setStarttime(Date starttime) {
        this.starttime = starttime;
    }

    public Date getEndtime() {
        return endtime;
    }

    public void setEndtime(Date endtime) {
        this.endtime = endtime;
    }

    public Integer getDriverid() {
        return driverid;
    }

    public void setDriverid(Integer driverid) {
        this.driverid = driverid;
    }

    public String getCatid() {
        return catid;
    }

    public void setCatid(String catid) {
        this.catid = catid == null ? null : catid.trim();
    }
}