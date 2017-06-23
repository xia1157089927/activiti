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
 * ACT_RU_JOB
 * 
 * @author bianj
 * @version 1.0.0 2017-06-24
 */
public class ActRuJob implements java.io.Serializable {
    /** 版本号 */
    private static final long serialVersionUID = -7785553854214565731L;

    /**  */
    private String id;

    /**  */
    private Integer rev;

    /**  */
    private String type;

    /**  */
    private Timestamp lockExpTime;

    /**  */
    private String lockOwner;

    /**  */
    private Byte[] exclusive;

    /**  */
    private String executionId;

    /**  */
    private String processInstanceId;

    /**  */
    private String procDefId;

    /**  */
    private Integer retries;

    /**  */
    private String exceptionStackId;

    /**  */
    private String exceptionMsg;

    /**  */
    private Timestamp duedate;

    /**  */
    private String repeat;

    /**  */
    private String handlerType;

    /**  */
    private String handlerCfg;

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
    public Timestamp getLockExpTime() {
        return this.lockExpTime;
    }

    /**
     * 设置
     * 
     * @param lockExpTime
     */
    public void setLockExpTime(Timestamp lockExpTime) {
        this.lockExpTime = lockExpTime;
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
    public Byte[] getExclusive() {
        return this.exclusive;
    }

    /**
     * 设置
     * 
     * @param exclusive
     */
    public void setExclusive(Byte[] exclusive) {
        this.exclusive = exclusive;
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
    public String getProcessInstanceId() {
        return this.processInstanceId;
    }

    /**
     * 设置
     * 
     * @param processInstanceId
     */
    public void setProcessInstanceId(String processInstanceId) {
        this.processInstanceId = processInstanceId;
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
    public Integer getRetries() {
        return this.retries;
    }

    /**
     * 设置
     * 
     * @param retries
     */
    public void setRetries(Integer retries) {
        this.retries = retries;
    }

    /**
     * 获取
     * 
     * @return 
     */
    public String getExceptionStackId() {
        return this.exceptionStackId;
    }

    /**
     * 设置
     * 
     * @param exceptionStackId
     */
    public void setExceptionStackId(String exceptionStackId) {
        this.exceptionStackId = exceptionStackId;
    }

    /**
     * 获取
     * 
     * @return 
     */
    public String getExceptionMsg() {
        return this.exceptionMsg;
    }

    /**
     * 设置
     * 
     * @param exceptionMsg
     */
    public void setExceptionMsg(String exceptionMsg) {
        this.exceptionMsg = exceptionMsg;
    }

    /**
     * 获取
     * 
     * @return 
     */
    public Timestamp getDuedate() {
        return this.duedate;
    }

    /**
     * 设置
     * 
     * @param duedate
     */
    public void setDuedate(Timestamp duedate) {
        this.duedate = duedate;
    }

    /**
     * 获取
     * 
     * @return 
     */
    public String getRepeat() {
        return this.repeat;
    }

    /**
     * 设置
     * 
     * @param repeat
     */
    public void setRepeat(String repeat) {
        this.repeat = repeat;
    }

    /**
     * 获取
     * 
     * @return 
     */
    public String getHandlerType() {
        return this.handlerType;
    }

    /**
     * 设置
     * 
     * @param handlerType
     */
    public void setHandlerType(String handlerType) {
        this.handlerType = handlerType;
    }

    /**
     * 获取
     * 
     * @return 
     */
    public String getHandlerCfg() {
        return this.handlerCfg;
    }

    /**
     * 设置
     * 
     * @param handlerCfg
     */
    public void setHandlerCfg(String handlerCfg) {
        this.handlerCfg = handlerCfg;
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