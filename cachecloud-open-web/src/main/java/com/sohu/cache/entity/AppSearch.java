package com.sohu.cache.entity;

/**
 * 搜索实体
 * 
 * @author leifu
 * @Date 2014年11月14日
 * @Time 上午10:44:01
 */
public class AppSearch {
    /**
     * 应用id
     */
    private long appId;

    /**
     * 应用名
     */
    private String appName;

    /**
     * 应用类型
     */
    private Integer appType;

    /**
     * 申请状态
     */
    private Integer appStatus;
    
    /**
     * 命中率排序
     */
    private String orderBy;

    public long getAppId() {
        return appId;
    }

    public void setAppId(long appId) {
        this.appId = appId;
    }

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public Integer getAppType() {
        return appType;
    }

    public void setAppType(Integer appType) {
        this.appType = appType;
    }

    public Integer getAppStatus() {
        return appStatus;
    }

    public void setAppStatus(Integer appStatus) {
        this.appStatus = appStatus;
    }

    public String getOrderBy() {
        return orderBy;
    }

    public void setOrderBy(String orderBy) {
        this.orderBy = orderBy;
    }


}
