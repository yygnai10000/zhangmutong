package com.yy.pojo;

public class Driver {
    private Integer driverid;

    private String drivername;

    private String wechat;

    private String phone;

    private String exigencyphone;

    private String address;

    private Integer driverstatus;

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
        this.drivername = drivername == null ? null : drivername.trim();
    }

    public String getWechat() {
        return wechat;
    }

    public void setWechat(String wechat) {
        this.wechat = wechat == null ? null : wechat.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getExigencyphone() {
        return exigencyphone;
    }

    public void setExigencyphone(String exigencyphone) {
        this.exigencyphone = exigencyphone == null ? null : exigencyphone.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public Integer getDriverstatus() {
        return driverstatus;
    }

    public void setDriverstatus(Integer driverstatus) {
        this.driverstatus = driverstatus;
    }
}