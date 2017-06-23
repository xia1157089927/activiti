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
 * ACT_HI_ACTINST
 * 
 * @author bianj
 * @version 1.0.0 2017-06-24
 */
public class ActHiActinst implements java.io.Serializable {
    /** 版本号 */
    private static final long serialVersionUID = 613832519019989041L;

    /**  */
    private String id;

    /**  */
    private String procDefId;

    /**  */
    private String procInstId;

    /**  */
    private String executionId;

    /**  */
    private String actId;

    /**  */
    private String taskId;

    /**  */
    private String callProcInstId;

    /**  */
    private String actName;

    /**  */
    private String actType;

    /**  */
    private String assignee;

    /**  */
    private Date startTime;

    /**  */
    private Date endTime;

    /**  */
    private Long duration;

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
    public String getTaskId() {
        return this.taskId;
    }

    /**
     * 设置
     * 
     * @param taskId
     */
    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    /**
     * 获取
     * 
     * @return 
     */
    public String getCallProcInstId() {
        return this.callProcInstId;
    }

    /**
     * 设置
     * 
     * @param callProcInstId
     */
    public void setCallProcInstId(String callProcInstId) {
        this.callProcInstId = callProcInstId;
    }

    /**
     * 获取
     * 
     * @return 
     */
    public String getActName() {
        return this.actName;
    }

    /**
     * 设置
     * 
     * @param actName
     */
    public void setActName(String actName) {
        this.actName = actName;
    }

    /**
     * 获取
     * 
     * @return 
     */
    public String getActType() {
        return this.actType;
    }

    /**
     * 设置
     * 
     * @param actType
     */
    public void setActType(String actType) {
        this.actType = actType;
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