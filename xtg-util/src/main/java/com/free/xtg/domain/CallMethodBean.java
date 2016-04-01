package com.free.xtg.domain;

import java.io.Serializable;
import java.util.List;

/**
 * Created by hanling.liu on 2016/3/31.
 */
public class CallMethodBean implements Serializable {

    private static final long serialVersionUID = 7800176255818034927L;

    private String className;

    private ParamBean returnVal;

    private List<ParamBean> paramList;

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public ParamBean getReturnVal() {
        return returnVal;
    }

    public void setReturnVal(ParamBean returnVal) {
        this.returnVal = returnVal;
    }

    public List<ParamBean> getParamList() {
        return paramList;
    }

    public void setParamList(List<ParamBean> paramList) {
        this.paramList = paramList;
    }
}
