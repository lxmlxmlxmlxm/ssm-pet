package com.nf147.pet.entity;

public class Category {
    private Integer c_id;

    private String c_name;

    public Integer getC_id() {
        return c_id;
    }

    public void setC_id(Integer c_id) {
        this.c_id = c_id;
    }

    public String getC_name() {
        return c_name;
    }

    public void setC_name(String c_name) {
        this.c_name = c_name == null ? null : c_name.trim();
    }
}