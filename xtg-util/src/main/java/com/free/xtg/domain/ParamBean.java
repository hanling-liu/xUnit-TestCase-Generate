package com.free.xtg.domain;

import java.io.Serializable;

/**
 * Created by hanling.liu on 2016/3/31.
 */
public class ParamBean implements Serializable{

    private static final long serialVersionUID = 1543408541906964522L;

    public ParamBean() {}

    public ParamBean(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public ParamBean(String type) {
        this.type = type;
    }

    private String name;

    /**
     * this is deposit class name
     */
    private String type;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
