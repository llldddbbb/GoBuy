package com.gobuy.pojo;

import java.util.Date;

public class ItemParamItem {
    private Long id;

    private Long item_id;

    private Date created;

    private Date updated;

    private String param_data;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getItem_id() {
        return item_id;
    }

    public void setItem_id(Long item_id) {
        this.item_id = item_id;
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