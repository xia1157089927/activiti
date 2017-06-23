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
 * ACT_RU_EXECUTION
 * 
 * @author bianj
 * @version 1.0.0 2017-06-24
 */
public class ActRuExecution implements java.io.Serializable {
    /** 版本号 */
    private static final long serialVersionUID = -8162097430675564031L;

    /**  */
    private String id;

    /**  */
    private Integer rev;

    /**  */
    private String procInstId;

    /**  */
    private String businessKey;

    /**  */
    private String parentId;

    /**  */
    private String procDefId;

    /**  */
    private String superExec;

    /**  */
    private String actId;

    /**  */
    private Integer isActive;

    /**  */
    private Integer isConcurrent;

    /**  */
    private Integer isScope;

    /**  */
    private Integer isEventScope;

    /**  */
    private Integer suspensionState;

    /**  */
    private Integer cachedEntState;

    /**  */
    private String tenantId;

    /**  */
    private String name;

    /**  */
    private Timestamp lockTime;

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
    public String getProcInstId() {
        return this.procInstId;
    }

    /**
     * 设置
     * 
     * @param procInstId
     */
    public void setProcInstId(String procInstId) {
        this.procInstId = procInstId;
    }

    /**
     * 获取
     * 
     * @return 
     */
    public String getBusinessKey() {
        return this.businessKey;
    }

    /**
     * 设置
     * 
     * @param businessKey
     */
    public void setBusinessKey(String businessKey) {
        this.businessKey = businessKey;
    }

    /**
     * 获取
     * 
     * @return 
     */
    public String getParentId() {
        return this.parentId;
    }

    /**
     * 设置
     * 
     * @param parentId
     */
    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    /**
     * 获取
     * 
     * @return 
     */
    public String getProcDefId() {
        return this.procDefId;
    }

    /**
     * 设置
     * 
     * @param procDefId
     */
    public void setProcDefId(String procDefId) {
        this.procDefId = procDefId;
    }

    /**
     * 获取
     * 
     * @return 
     */
    public String getSuperExec() {
        return this.superExec;
    }

    /**
     * 设置
     * 
     * @param superExec
     */
    public void setSuperExec(String superExec) {
        this.superExec = superExec;
    }

    /**
     * 获取
     * 
     * @return 
     */
    public String getActId() {
        return this.actId;
    }

    /**
     * 设置
     * 
     * @param actId
     */
    public void setActId(String actId) {
        this.actId = actId;
    }

    /**
     * 获取
     * 
     * @return 
     */
    public Integer getIsActive() {
        return this.isActive;
    }

    /**
     * 设置
     * 
     * @param isActive
     */
    public void setIsActive(Integer isActive) {
        this.isActive = isActive;
    }

    /**
     * 获取
     * 
     * @return 
     */
    public Integer getIsConcurrent() {
        return this.isConcurrent;
    }

    /**
     * 设置
     * 
     * @param isConcurrent
     */
    public void setIsConcurrent(Integer isConcurrent) {
        this.isConcurrent = isConcurrent;
    }

    /**
     * 获取
     * 
     * @return 
     */
    public Integer getIsScope() {
        return this.isScope;
    }

    /**
     * 设置
     * 
     * @param isScope
     */
    public void setIsScope(Integer isScope) {
        this.isScope = isScope;
    }

    /**
     * 获取
     * 
     * @return 
     */
    public Integer getIsEventScope() {
        return this.isEventScope;
    }

    /**
     * 设置
     * 
     * @param isEventScope
     */
    public void setIsEventScope(Integer isEventScope) {
        this.isEventScope = isEventScope;
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
    public Integer getCachedEntState() {
        return this.cachedEntState;
    }

    /**
     * 设置
     * 
     * @param cachedEntState
     */
    public void setCachedEntState(Integer cachedEntState) {
        this.cachedEntState = cachedEntState;
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
    public Timestamp getLockTime() {
        return this.lockTime;
    }

    /**
     * 设置
     * 
     * @param lockTime
     */
    public void setLockTime(Timestamp lockTime) {
        this.lockTime = lockTime;
    }
}