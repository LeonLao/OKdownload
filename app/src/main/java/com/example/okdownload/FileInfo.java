package com.example.okdownload;

/**
 * Created by jack on 2015/11/17.
 */
public class FileInfo {
    private String fileName;
    private String packageName;
    private String url;
    private String coverUrl;

    public FileInfo(String fileName,String packageName,String url,String coverUrl){
        this.fileName = fileName;
        this.packageName = packageName;
        this.url = url;
        this.coverUrl = coverUrl;
    }
    public String getFileName(){
        return fileName;
    }
    public void setFileName(String fileName){
        this.fileName = fileName;
    }

    public String getPackageName(){
        return packageName;
    }
    public void setPackageName(String packageName){
        this.packageName = packageName;
    }

    public String getUrl(){
        return url;
    }
    public void setUrl(String url){
        this.url = url;
    }

    public String getCoverUrl(){
        return coverUrl;
    }
    public void setCoverUrl(String coverUrl){
        this.coverUrl = coverUrl;
    }
}
