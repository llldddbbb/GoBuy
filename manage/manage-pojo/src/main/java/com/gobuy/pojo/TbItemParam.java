package com.gobuy.pojo;

import java.util.Date;

public class TbItemParam {
    private Long id;

    private Long item_cat_id;

    private Date created;

    private Date updated;

    private String param_data;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getItem_cat_id() {
        return item_cat_id;
    }

    public void setItem_cat_id(Long item_cat_id) {
        this.item_cat_id = item_cat_id;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getUpdated() {
        return updated;
    }

    public void setUpdated(Date updated) {
        this.updated = updated;
    }

    public String getParam_data() {
        return param_data;
    }

    public void setParam_data(String param_data) {
        this.param_data = param_data == null ? null : param_data.trim();
    }
}