package com.free.xtg.domain;

import java.io.Serializable;

/**
 * Created by hanling.liu on 2016/3/31.
 */
public class InPutFileBean implements Serializable {

    private static final long serialVersionUID = 9206653150896462562L;

    /**
     * 包名加类名
     */
    private String fileName;

    private String filePath;

    private String fileType;

    private String tagPath;

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public String getFileType() {
        return fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    public String getTagPath() {
        return tagPath;
    }

    public void setTagPath(String tagPath) {
        this.tagPath = tagPath;
    }
}
