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
 * ACT_RU_EVENT_SUBSCR
 * 
 * @author bianj
 * @version 1.0.0 2017-06-24
 */
public class ActRuEventSubscr implements java.io.Serializable {
    /** 版本号 */
    private static final long serialVersionUID = -3790442335251050942L;

    /**  */
    private String id;

    /**  */
    private Integer rev;

    /**  */
    private String eventType;

    /**  */
    private String eventName;

    /**  */
    private String executionId;

    /**  */
    private String procInstId;

    /**  */
    private String activityId;

    /**  */
    private String configuration;

    /**  */
    private Timestamp created;

    /**  */
    private String procDefId;

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
    public String getEventType() {
        return this.eventType;
    }

    /**
     * 设置
     * 
     * @param eventType
     */
    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    /**
     * 获取
     * 
     * @return 
     */
    public String getEventName() {
        return this.eventName;
    }

    /**
     * 设置
     * 
     * @param eventName
     */
    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    /**
     * 获取
     * 
     * @return 
     */
    public String getExecutionId() {
        return this.executionId;
    }

    /**
     * 设置
     * 
     * @param executionId
     */
    public void setExecutionId(String executionId) {
        this.executionId = executionId;
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
    public String getActivityId() {
        return this.activityId;
    }

    /**
     * 设置
     * 
     * @param activityId
     */
    public void setActivityId(String activityId) {
        this.activityId = activityId;
    }

    /**
     * 获取
     * 
     * @return 
     */
    public String getConfiguration() {
        return this.configuration;
    }

    /**
     * 设置
     * 
     * @param configuration
     */
    public void setConfiguration(String configuration) {
        this.configuration = configuration;
    }

    /**
     * 获取
     * 
     * @return 
     */
    public Timestamp getCreated() {
        return this.created;
    }

    /**
     * 设置
     * 
     * @param created
     */
    public void setCreated(Timestamp created) {
        this.created = created;
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