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
 * ACT_HI_PROCINST
 * 
 * @author bianj
 * @version 1.0.0 2017-06-24
 */
public class ActHiProcinst implements java.io.Serializable {
    /** 版本号 */
    private static final long serialVersionUID = 6802818817415653159L;

    /**  */
    private String id;

    /**  */
    private String procInstId;

    /**  */
    private String businessKey;

    /**  */
    private String procDefId;

    /**  */
    private Date startTime;

    /**  */
    private Date endTime;

    /**  */
    private Long duration;

    /**  */
    private String startUserId;

    /**  */
    private String startActId;

    /**  */
    private String endActId;

    /**  */
    private String superProcessInstanceId;

    /**  */
    private String deleteReason;

    /**  */
    private String tenantId;

    /**  */
    private String name;

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
    public String getStartUserId() {
        return this.startUserId;
    }

    /**
     * 设置
     * 
     * @param startUserId
     */
    public void setStartUserId(String startUserId) {
        this.startUserId = startUserId;
    }

    /**
     * 获取
     * 
     * @return 
     */
    public String getStartActId() {
        return this.startActId;
    }

    /**
     * 设置
     * 
     * @param startActId
     */
    public void setStartActId(String startActId) {
        this.startActId = startActId;
    }

    /**
     * 获取
     * 
     * @return 
     */
    public String getEndActId() {
        return this.endActId;
    }

    /**
     * 设置
     * 
     * @param endActId
     */
    public void setEndActId(String endActId) {
        this.endActId = endActId;
    }

    /**
     * 获取
     * 
     * @return 
     */
    public String getSuperProcessInstanceId() {
        return this.superProcessInstanceId;
    }

    /**
     * 设置
     * 
     * @param superProcessInstanceId
     */
    public void setSuperProcessInstanceId(String superProcessInstanceId) {
        this.superProcessInstanceId = superProcessInstanceId;
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
}