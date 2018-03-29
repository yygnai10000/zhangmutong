package com.yy.utils;


import java.util.List;

/**
 * @Author: 595703420@qq.com
 * @Date: 2018/2/25.
 */
public class LayuiPageResult<E> {
    private Integer code;
    private String msg;
    private Integer count;
    private List<E> data;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public List<E> getData() {
        return data;
    }

    public void setData(List<E> data) {
        this.data = data;
    }
}
