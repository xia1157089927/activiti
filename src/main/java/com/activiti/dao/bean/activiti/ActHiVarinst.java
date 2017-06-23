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
 * ACT_HI_VARINST
 * 
 * @author bianj
 * @version 1.0.0 2017-06-24
 */
public class ActHiVarinst implements java.io.Serializable {
    /** 版本号 */
    private static final long serialVersionUID = 4499131837431157966L;

    /**  */
    private String id;

    /**  */
    private String procInstId;

    /**  */
    private String executionId;

    /**  */
    private String taskId;

    /**  */
    private String name;

    /**  */
    private String varType;

    /**  */
    private Integer rev;

    /**  */
    private String bytearrayId;

    /**  */
    private Double double_;

    /**  */
    private Long long_;

    /**  */
    private String text;

    /**  */
    private String text2;

    /**  */
    private Date createTime;

    /**  */
    private Date lastUpdatedTime;

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
    public String getVarType() {
        return this.varType;
    }

    /**
     * 设置
     * 
     * @param varType
     */
    public void setVarType(String varType) {
        this.varType = varType;
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
    public String getBytearrayId() {
        return this.bytearrayId;
    }

    /**
     * 设置
     * 
     * @param bytearrayId
     */
    public void setBytearrayId(String bytearrayId) {
        this.bytearrayId = bytearrayId;
    }

    /**
     * 获取
     * 
     * @return 
     */
    public Double getDouble() {
        return this.double_;
    }

    /**
     * 设置
     * 
     * @param double
     */
    public void setDouble(Double double_) {
        this.double_ = double_;
    }

    /**
     * 获取
     * 
     * @return 
     */
    public Long getLong() {
        return this.long_;
    }

    /**
     * 设置
     * 
     * @param long
     */
    public void setLong(Long long_) {
        this.long_ = long_;
    }

    /**
     * 获取
     * 
     * @return 
     */
    public String getText() {
        return this.text;
    }

    /**
     * 设置
     * 
     * @param text
     */
    public void setText(String text) {
        this.text = text;
    }

    /**
     * 获取
     * 
     * @return 
     */
    public String getText2() {
        return this.text2;
    }

    /**
     * 设置
     * 
     * @param text2
     */
    public void setText2(String text2) {
        this.text2 = text2;
    }

    /**
     * 获取
     * 
     * @return 
     */
    public Date getCreateTime() {
        return this.createTime;
    }

    /**
     * 设置
     * 
     * @param createTime
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取
     * 
     * @return 
     */
    public Date getLastUpdatedTime() {
        return this.lastUpdatedTime;
    }

    /**
     * 设置
     * 
     * @param lastUpdatedTime
     */
    public void setLastUpdatedTime(Date lastUpdatedTime) {
        this.lastUpdatedTime = lastUpdatedTime;
    }
}