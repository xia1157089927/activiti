/*
 * Welcome to use the TableGo Tools.
 * 
 * http://vipbooks.iteye.com
 * http://blog.csdn.net/vipbooks
 * http://www.cnblogs.com/vipbooks
 * 
 * Author:bianj
 * Email:edinsker@163.com
 * Version:5.0.0
 */

package com.activiti.dao.bean.activiti;

import java.sql.Timestamp;

/**
 * ACT_RE_DEPLOYMENT
 * 
 * @author bianj
 * @version 1.0.0 2017-06-24
 */
public class ActReDeployment implements java.io.Serializable {
    /** 版本号 */
    private static final long serialVersionUID = -2918782163813614036L;

    /**  */
    private String id;

    /**  */
    private String name;

    /**  */
    private String category;

    /**  */
    private String tenantId;

    /**  */
    private Timestamp deployTime;

    /**
     * 获取
     * 
     * @return 
     */
    public String getId() {
        return this.id;
    }

    /**
     * 设置
     * 
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获取
     * 
     * @return 
     */
    public String getName() {
        return this.name;
    }

    /**
     * 设置
     * 
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * 
     * @return 
     */
    public String getCategory() {
        return this.category;
    }

    /**
     * 设置
     * 
     * @param category
     */
    public void setCategory(String category) {
        this.category = category;
    }

    /**
     * 获取
     * 
     * @return 
     */
    public String getTenantId() {
        return this.tenantId;
    }

    /**
     * 设置
     * 
     * @param tenantId
     */
    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    /**
     * 获取
     * 
     * @return 
     */
    public Timestamp getDeployTime() {
        return this.deployTime;
    }

    /**
     * 设置
     * 
     * @param deployTime
     */
    public void setDeployTime(Timestamp deployTime) {
        this.deployTime = deployTime;
    }
}