package com.free.xtg.domain;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 * Created by hanling.liu on 2016/3/31.
 */
public class AnalysisResultBean implements Serializable {
    private static final long serialVersionUID = -5455966942490239090L;

    private List<MethodAnalysisBean> methodList;

    public List<MethodAnalysisBean> getMethodList() {
        return methodList;
    }

    public void setMethodList(List<MethodAnalysisBean> methodList) {
        this.methodList = methodList;
    }
}
