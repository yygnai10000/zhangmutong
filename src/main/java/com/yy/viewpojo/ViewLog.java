package com.yy.viewpojo;

/**
 * @Author: 595703420@qq.com
 * @Date: 2018/3/3.
 */
public class ViewLog {
    private String date;
    private String logcontent;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getLogcontent() {
        return logcontent;
    }

    public void setLogcontent(String logcontent) {
        this.logcontent = logcontent;
    }

    public ViewLog() {
    }

    public ViewLog(String date, String logcontent) {
        this.date = date;
        this.logcontent = logcontent;
    }
}
