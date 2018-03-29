package com.yy.pojo;

public class Transportnumber {
    private String transportid;

    private Integer catnumber;

    private Integer employerid;

    private String cargoname;

    private Integer cargosize;

    private String fetchcargoperson;

    private Integer fetchcargophone;

    private String receivecargoperson;

    private Integer receivecargophone;

    private String fetchcargoaddress;

    private String receivecargoaddress;

    private Integer status;

    private String statusmsg;

    private Integer clearingstatus;

    private String clearingmsg;

    public String getTransportid() {
        return transportid;
    }

    public void setTransportid(String transportid) {
        this.transportid = transportid == null ? null : transportid.trim();
    }

    public Integer getCatnumber() {
        return catnumber;
    }

    public void setCatnumber(Integer catnumber) {
        this.catnumber = catnumber;
    }

    public Integer getEmployerid() {
        return employerid;
    }

    public void setEmployerid(Integer employerid) {
        this.employerid = employerid;
    }

    public String getCargoname() {
        return cargoname;
    }

    public void setCargoname(String cargoname) {
        this.cargoname = cargoname == null ? null : cargoname.trim();
    }

    public Integer getCargosize() {
        return cargosize;
    }

    public void setCargosize(Integer cargosize) {
        this.cargosize = cargosize;
    }

    public String getFetchcargoperson() {
        return fetchcargoperson;
    }

    public void setFetchcargoperson(String fetchcargoperson) {
        this.fetchcargoperson = fetchcargoperson == null ? null : fetchcargoperson.trim();
    }

    public Integer getFetchcargophone() {
        return fetchcargophone;
    }

    public void setFetchcargophone(Integer fetchcargophone) {
        this.fetchcargophone = fetchcargophone;
    }

    public String getReceivecargoperson() {
        return receivecargoperson;
    }

    public void setReceivecargoperson(String receivecargoperson) {
        this.receivecargoperson = receivecargoperson == null ? null : receivecargoperson.trim();
    }

    public Integer getReceivecargophone() {
        return receivecargophone;
    }

    public void setReceivecargophone(Integer receivecargophone) {
        this.receivecargophone = receivecargophone;
    }

    public String getFetchcargoaddress() {
        return fetchcargoaddress;
    }

    public void setFetchcargoaddress(String fetchcargoaddress) {
        this.fetchcargoaddress = fetchcargoaddress == null ? null : fetchcargoaddress.trim();
    }

    public String getReceivecargoaddress() {
        return receivecargoaddress;
    }

    public void setReceivecargoaddress(String receivecargoaddress) {
        this.receivecargoaddress = receivecargoaddress == null ? null : receivecargoaddress.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getStatusmsg() {
        return statusmsg;
    }

    public void setStatusmsg(String statusmsg) {
        this.statusmsg = statusmsg == null ? null : statusmsg.trim();
    }

    public Integer getClearingstatus() {
        return clearingstatus;
    }

    public void setClearingstatus(Integer clearingstatus) {
        this.clearingstatus = clearingstatus;
    }

    public String getClearingmsg() {
        return clearingmsg;
    }

    public void setClearingmsg(String clearingmsg) {
        this.clearingmsg = clearingmsg == null ? null : clearingmsg.trim();
    }
}