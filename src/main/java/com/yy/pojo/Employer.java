package com.yy.pojo;

public class Employer {
    private Integer employerid;

    private String companyname;

    private String principal;

    private String wechat;

    private String phone;

    private String taolu1;

    private String exigencephone;

    private String taolu2;

    private String taolu3;

    private String companyaddress;

    private String annotation;

    private String customerprincipal;

    public Integer getEmployerid() {
        return employerid;
    }

    public void setEmployerid(Integer employerid) {
        this.employerid = employerid;
    }

    public String getCompanyname() {
        return companyname;
    }

    public void setCompanyname(String companyname) {
        this.companyname = companyname == null ? null : companyname.trim();
    }

    public String getPrincipal() {
        return principal;
    }

    public void setPrincipal(String principal) {
        this.principal = principal == null ? null : principal.trim();
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

    public String getTaolu1() {
        return taolu1;
    }

    public void setTaolu1(String taolu1) {
        this.taolu1 = taolu1 == null ? null : taolu1.trim();
    }

    public String getExigencephone() {
        return exigencephone;
    }

    public void setExigencephone(String exigencephone) {
        this.exigencephone = exigencephone == null ? null : exigencephone.trim();
    }

    public String getTaolu2() {
        return taolu2;
    }

    public void setTaolu2(String taolu2) {
        this.taolu2 = taolu2 == null ? null : taolu2.trim();
    }

    public String getTaolu3() {
        return taolu3;
    }

    public void setTaolu3(String taolu3) {
        this.taolu3 = taolu3 == null ? null : taolu3.trim();
    }

    public String getCompanyaddress() {
        return companyaddress;
    }

    public void setCompanyaddress(String companyaddress) {
        this.companyaddress = companyaddress == null ? null : companyaddress.trim();
    }

    public String getAnnotation() {
        return annotation;
    }

    public void setAnnotation(String annotation) {
        this.annotation = annotation == null ? null : annotation.trim();
    }

    public String getCustomerprincipal() {
        return customerprincipal;
    }

    public void setCustomerprincipal(String customerprincipal) {
        this.customerprincipal = customerprincipal == null ? null : customerprincipal.trim();
    }
}