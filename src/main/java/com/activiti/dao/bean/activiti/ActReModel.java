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
 * ACT_RE_MODEL
 * 
 * @author bianj
 * @version 1.0.0 2017-06-24
 */
public class ActReModel implements java.io.Serializable {
    /** 版本号 */
    private static final long serialVersionUID = 3963579081207910325L;

    /**  */
    private String id;

    /**  */
    private Integer rev;

    /**  */
    private String name;

    /**  */
    private String key;

    /**  */
    private String category;

    /**  */
    private Timestamp createTime;

    /**  */
    private Timestamp lastUpdateTime;

    /**  */
    private Integer version;

    /**  */
    private String metaInfo;

    /**  */
    private String deploymentId;

    /**  */
    private String editorSourceValueId;

    /**  */
    private String editorSourceExtraValueId;

    /**  */
    private String tenantId;

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
    public Integer getRev() {
        return this.rev;
    }

    /**
     * 设置
     * 
     * @param rev
     */
    public void setRev(Integer rev) {
        this.rev = rev;
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
    public String getKey() {
        return this.key;
    }

    /**
     * 设置
     * 
     * @param key
     */
    public void setKey(String key) {
        this.key = key;
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
    public Timestamp getCreateTime() {
        return this.createTime;
    }

    /**
     * 设置
     * 
     * @param createTime
     */
    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取
     * 
     * @return 
     */
    public Timestamp getLastUpdateTime() {
        return this.lastUpdateTime;
    }

    /**
     * 设置
     * 
     * @param lastUpdateTime
     */
    public void setLastUpdateTime(Timestamp lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    /**
     * 获取
     * 
     * @return 
     */
    public Integer getVersion() {
        return this.version;
    }

    /**
     * 设置
     * 
     * @param version
     */
    public void setVersion(Integer version) {
        this.version = version;
    }

    /**
     * 获取
     * 
     * @return 
     */
    public String getMetaInfo() {
        return this.metaInfo;
    }

    /**
     * 设置
     * 
     * @param metaInfo
     */
    public void setMetaInfo(String metaInfo) {
        this.metaInfo = metaInfo;
    }

    /**
     * 获取
     * 
     * @return 
     */
    public String getDeploymentId() {
        return this.deploymentId;
    }

    /**
     * 设置
     * 
     * @param deploymentId
     */
    public void setDeploymentId(String deploymentId) {
        this.deploymentId = deploymentId;
    }

    /**
     * 获取
     * 
     * @return 
     */
    public String getEditorSourceValueId() {
        return this.editorSourceValueId;
    }

    /**
     * 设置
     * 
     * @param editorSourceValueId
     */
    public void setEditorSourceValueId(String editorSourceValueId) {
        this.editorSourceValueId = editorSourceValueId;
    }

    /**
     * 获取
     * 
     * @return 
     */
    public String getEditorSourceExtraValueId() {
        return this.editorSourceExtraValueId;
    }

    /**
     * 设置
     * 
     * @param editorSourceExtraValueId
     */
    public void setEditorSourceExtraValueId(String editorSourceExtraValueId) {
        this.editorSourceExtraValueId = editorSourceExtraValueId;
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
}