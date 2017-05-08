package com.gobuy.common.pojo;

import java.util.List;

/**
 * Created by ldb on 2017/5/8.
 */
public class EUDateGridResult {

    private long total;
    private List<?> rows;

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }

    public List<?> getRows() {
        return rows;
    }

    public void setRows(List<?> rows) {
        this.rows = rows;
    }
}
