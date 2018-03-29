package com.yy.utils;

import java.io.Serializable;
import java.util.List;

/**
 * @Author: 595703420@qq.com
 * @Date: 2018/2/24.
 */
public class PageResult implements Serializable{
    private long total;
    private List rows;

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }

    public List getRows() {
        return rows;
    }

    public void setRows(List rows) {
        this.rows = rows;
    }
}
