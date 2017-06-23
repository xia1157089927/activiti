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
 * ACT_EVT_LOG
 * 
 * @author bianj
 * @version 1.0.0 2017-06-24
 */
public class ActEvtLog implements java.io.Serializable {
    /** 版本号 */
    private static final long serialVersionUID = -7425210910264750266L;

    /**  */
    private Long logNr;

    /**  */
    private String type;

    /**  */
    private String procDefId;

    /**  */
    private String procInstId;

    /**  */
    private String executionId;

    /**  */
    private String taskId;

    /**  */
    private Timestamp timeStamp;

    /**  */
    private String userId;

    /**  */
    private Byte[] data;

    /**  */
    private String lockOwner;

    /**  */
    private Timestamp lockTime;

    /**  */
    private Integer isProcessed;

    /**
     * 获取
     * 
     * @return 
     */
    public Long getLogNr() {
        return this.logNr;
    }

    /**
     * 设置
     * 
     * @param logNr
     */
    public void setLogNr(Long logNr) {
        this.logNr = logNr;
    }

    /**
     * 获取
     * 
     * @return 
     */
    public String getType() {
        return this.type;
    }

    /**
     * 设置
     * 
     * @param type
     */
    public void setType(String type) {
        this.type = type;
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
    public Timestamp getTimeStamp() {
        return this.timeStamp;
    }

    /**
     * 设置
     * 
     * @param timeStamp
     */
    public void setTimeStamp(Timestamp timeStamp) {
        this.timeStamp = timeStamp;
    }

    /**
     * 获取
     * 
     * @return 
     */
    public String getUserId() {
        return this.userId;
    }

    /**
     * 设置
     * 
     * @param userId
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * 获取
     * 
     * @return 
     */
    public Byte[] getData() {
        return this.data;
    }

    /**
     * 设置
     * 
     * @param data
     */
    public void setData(Byte[] data) {
        this.data = data;
    }

    /**
     * 获取
     * 
     * @return 
     */
    public String getLockOwner() {
        return this.lockOwner;
    }

    /**
     * 设置
     * 
     * @param lockOwner
     */
    public void setLockOwner(String lockOwner) {
        this.lockOwner = lockOwner;
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

    /**
     * 获取
     * 
     * @return 
     */
    public Integer getIsProcessed() {
        return this.isProcessed;
    }

    /**
     * 设置
     * 
     * @param isProcessed
     */
    public void setIsProcessed(Integer isProcessed) {
        this.isProcessed = isProcessed;
    }
}