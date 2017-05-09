package com.gobuy.pojo;

import javax.persistence.*;
import java.util.Date;

@Table(name = "tb_item_param")
public class ItemParam {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long item_cat_id;

    private Date created;

    private Date updated;

    private String param_data;

    @Transient
    private String item_cat_name;

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

    public String getItem_cat_name() {
        return item_cat_name;
    }

    public void setItem_cat_name(String item_cat_name) {
        this.item_cat_name = item_cat_name;
    }
}