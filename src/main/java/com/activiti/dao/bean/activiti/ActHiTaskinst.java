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

import java.util.Date;

/**
 * ACT_HI_TASKINST
 * 
 * @author bianj
 * @version 1.0.0 2017-06-24
 */
public class ActHiTaskinst implements java.io.Serializable {
    /** 版本号 */
    private static final long serialVersionUID = 5593097527463736295L;

    /**  */
    private String id;

    /**  */
    private String procDefId;

    /**  */
    private String taskDefKey;

    /**  */
    private String procInstId;

    /**  */
    private String executionId;

    /**  */
    private String name;

    /**  */
    private String parentTaskId;

    /**  */
    private String description;

    /**  */
    private String owner;

    /**  */
    private String assignee;

    /**  */
    private Date startTime;

    /**  */
    private Date claimTime;

    /**  */
    private Date endTime;

    /**  */
    private Long duration;

    /**  */
    private String deleteReason;

    /**  */
    private Integer priority;

    /**  */
    private Date dueDate;

    /**  */
    private String formKey;

    /**  */
    private String category;

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
    public String getTaskDefKey() {
        return this.taskDefKey;
    }

    /**
     * 设置
     * 
     * @param taskDefKey
     */
    public void setTaskDefKey(String taskDefKey) {
        this.taskDefKey = taskDefKey;
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
    public String getParentTaskId() {
        return this.parentTaskId;
    }

    /**
     * 设置
     * 
     * @param parentTaskId
     */
    public void setParentTaskId(String parentTaskId) {
        this.parentTaskId = parentTaskId;
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
    public String getOwner() {
        return this.owner;
    }

    /**
     * 设置
     * 
     * @param owner
     */
    public void setOwner(String owner) {
        this.owner = owner;
    }

    /**
     * 获取
     * 
     * @return 
     */
    public String getAssignee() {
        return this.assignee;
    }

    /**
     * 设置
     * 
     * @param assignee
     */
    public void setAssignee(String assignee) {
        this.assignee = assignee;
    }

    /**
     * 获取
     * 
     * @return 
     */
    public Date getStartTime() {
        return this.startTime;
    }

    /**
     * 设置
     * 
     * @param startTime
     */
    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    /**
     * 获取
     * 
     * @return 
     */
    public Date getClaimTime() {
        return this.claimTime;
    }

    /**
     * 设置
     * 
     * @param claimTime
     */
    public void setClaimTime(Date claimTime) {
        this.claimTime = claimTime;
    }

    /**
     * 获取
     * 
     * @return 
     */
    public Date getEndTime() {
        return this.endTime;
    }

    /**
     * 设置
     * 
     * @param endTime
     */
    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    /**
     * 获取
     * 
     * @return 
     */
    public Long getDuration() {
        return this.duration;
    }

    /**
     * 设置
     * 
     * @param duration
     */
    public void setDuration(Long duration) {
        this.duration = duration;
    }

    /**
     * 获取
     * 
     * @return 
     */
    public String getDeleteReason() {
        return this.deleteReason;
    }

    /**
     * 设置
     * 
     * @param deleteReason
     */
    public void setDeleteReason(String deleteReason) {
        this.deleteReason = deleteReason;
    }

    /**
     * 获取
     * 
     * @return 
     */
    public Integer getPriority() {
        return this.priority;
    }

    /**
     * 设置
     * 
     * @param priority
     */
    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    /**
     * 获取
     * 
     * @return 
     */
    public Date getDueDate() {
        return this.dueDate;
    }

    /**
     * 设置
     * 
     * @param dueDate
     */
    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    /**
     * 获取
     * 
     * @return 
     */
    public String getFormKey() {
        return this.formKey;
    }

    /**
     * 设置
     * 
     * @param formKey
     */
    public void setFormKey(String formKey) {
        this.formKey = formKey;
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
}