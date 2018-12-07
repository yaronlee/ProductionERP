package com.cskaoyan.domain;

import java.util.Arrays;
import java.util.List;

/**
 * Demo class
 *
 * @Author lyboy
 * @Date 2018/12/6 21:42
 **/
public class DeviceTypeListVO {
    int total;
    DeviceType[] rows;

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public DeviceType[] getRows() {
        return rows;
    }

    public void setRows(DeviceType[] rows) {
        this.rows = rows;
    }

    @Override
    public String toString() {
        return "DeviceTypeListVO{" +
                "total=" + total +
                ", rows=" + Arrays.toString(rows) +
                '}';
    }
}
