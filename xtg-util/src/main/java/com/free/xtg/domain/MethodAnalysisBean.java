package com.free.xtg.domain;

import java.io.Serializable;
import java.util.List;

/**
 * Created by hanling.liu on 2016/3/31.
 */
public class MethodAnalysisBean implements Serializable {

    private static final long serialVersionUID = 1765709071010635123L;

    private String className;

    private String methodName;

    private String returnParamType;

    private List<String> paramTypeList;

    private List<CallMethodBean> dependMethodList;

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getMethodName() {
        return methodName;
    }

    public void setMethodName(String methodName) {
        this.methodName = methodName;
    }

    public List<CallMethodBean> getDependMethodList() {
        return dependMethodList;
    }

    public void setDependMethodList(List<CallMethodBean> dependMethodList) {
        this.dependMethodList = dependMethodList;
    }

    public String getReturnParamType() {
        return returnParamType;
    }

    public void setReturnParamType(String returnParamType) {
        this.returnParamType = returnParamType;
    }

    public List<String> getParamTypeList() {
        return paramTypeList;
    }

    public void setParamTypeList(List<String> paramTypeList) {
        this.paramTypeList = paramTypeList;
    }
}
