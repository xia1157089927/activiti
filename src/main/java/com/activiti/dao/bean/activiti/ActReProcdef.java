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

/**
 * ACT_RE_PROCDEF
 * 
 * @author bianj
 * @version 1.0.0 2017-06-24
 */
public class ActReProcdef implements java.io.Serializable {
    /** 版本号 */
    private static final long serialVersionUID = -1092406861142188175L;

    /**  */
    private String id;

    /**  */
    private Integer rev;

    /**  */
    private String category;

    /**  */
    private String name;

    /**  */
    private String key;

    /**  */
    private Integer version;

    /**  */
    private String deploymentId;

    /**  */
    private String resourceName;

    /**  */
    private String dgrmResourceName;

    /**  */
    private String description;

    /**  */
    private Integer hasStartFormKey;

    /**  */
    private Integer hasGraphicalNotation;

    /**  */
    private Integer suspensionState;

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
    public String getResourceName() {
        return this.resourceName;
    }

    /**
     * 设置
     * 
     * @param resourceName
     */
    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

    /**
     * 获取
     * 
     * @return 
     */
    public String getDgrmResourceName() {
        return this.dgrmResourceName;
    }

    /**
     * 设置
     * 
     * @param dgrmResourceName
     */
    public void setDgrmResourceName(String dgrmResourceName) {
        this.dgrmResourceName = dgrmResourceName;
    }

    /**
     * 获取
     * 
     * @return 
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * 设置
     * 
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * 获取
     * 
     * @return 
     */
    public Integer getHasStartFormKey() {
        return this.hasStartFormKey;
    }

    /**
     * 设置
     * 
     * @param hasStartFormKey
     */
    public void setHasStartFormKey(Integer hasStartFormKey) {
        this.hasStartFormKey = hasStartFormKey;
    }

    /**
     * 获取
     * 
     * @return 
     */
    public Integer getHasGraphicalNotation() {
        return this.hasGraphicalNotation;
    }

    /**
     * 设置
     * 
     * @param hasGraphicalNotation
     */
    public void setHasGraphicalNotation(Integer hasGraphicalNotation) {
        this.hasGraphicalNotation = hasGraphicalNotation;
    }

    /**
     * 获取
     * 
     * @return 
     */
    public Integer getSuspensionState() {
        return this.suspensionState;
    }

    /**
     * 设置
     * 
     * @param suspensionState
     */
    public void setSuspensionState(Integer suspensionState) {
        this.suspensionState = suspensionState;
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