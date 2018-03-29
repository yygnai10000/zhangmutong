package com.yy.viewpojo;


/**
 *
 * 显示ca
 * @Author: 595703420@qq.com
 * @Date: 2018/2/25.
 */
public class ViewCar {
    private String carid;

    private String carname;

    private String buytime;

    private Integer boatload;

    private String location;

    private String status;
    private String msg;

    public String getCarid() {
        return carid;
    }

    public void setCarid(String carid) {
        this.carid = carid;
    }

    public String getCarname() {
        return carname;
    }

    public void setCarname(String carname) {
        this.carname = carname;
    }

    public String getBuytime() {
        return buytime;
    }

    public void setBuytime(String buytime) {
        this.buytime = buytime;
    }

    public Integer getBoatload() {
        return boatload;
    }

    public void setBoatload(Integer boatload) {
        this.boatload = boatload;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public ViewCar(String carid, String carname, String buytime, Integer boatload, String location, String status, String msg) {
        this.carid = carid;
        this.carname = carname;
        this.buytime = buytime;
        this.boatload = boatload;
        this.location = location;
        this.status = status;
        this.msg = msg;
    }

    public ViewCar() {
    }
}
