package com.yy.viewpojo;

/**
 * 司机视图层pojo 用于和前端交互数据
 * @Author: 595703420@qq.com
 * @Date: 2018/2/28.
 */

public class ViewDriver {
    private Integer driverid;

    private String drivername;

    private String wechat;

    private String phone;

    private String exigencyphone;

    private String address;
    // 司机状态  0 在职在位   1 事假   99离职
    private String driverstatus;

    public Integer getDriverid() {
        return driverid;
    }

    public void setDriverid(Integer driverid) {
        this.driverid = driverid;
    }

    public String getDrivername() {
        return drivername;
    }

    public void setDrivername(String drivername) {
        this.drivername = drivername;
    }

    public String getWechat() {
        return wechat;
    }

    public void setWechat(String wechat) {
        this.wechat = wechat;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getExigencyphone() {
        return exigencyphone;
    }

    public void setExigencyphone(String exigencyphone) {
        this.exigencyphone = exigencyphone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDriverstatus() {
        return driverstatus;
    }

    public void setDriverstatus(String driverstatus) {
        this.driverstatus = driverstatus;
    }

    public ViewDriver() {
    }

    public ViewDriver(Integer driverid, String drivername, String wechat, String phone, String exigencyphone, String address, String driverstatus) {
        this.driverid = driverid;
        this.drivername = drivername;
        this.wechat = wechat;
        this.phone = phone;
        this.exigencyphone = exigencyphone;
        this.address = address;
        this.driverstatus = driverstatus;
    }
}
