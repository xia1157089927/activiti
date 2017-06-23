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
 * ACT_HI_COMMENT
 * 
 * @author bianj
 * @version 1.0.0 2017-06-24
 */
public class ActHiComment implements java.io.Serializable {
    /** 版本号 */
    private static final long serialVersionUID = 3092746228879398485L;

    /**  */
    private String id;

    /**  */
    private String type;

    /**  */
    private Date time;

    /**  */
    private String userId;

    /**  */
    private String taskId;

    /**  */
    private String procInstId;

    /**  */
    private String action;

    /**  */
    private String message;

    /**  */
    private Byte[] fullMsg;

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
    public Date getTime() {
        return this.time;
    }

    /**
     * 设置
     * 
     * @param time
     */
    public void setTime(Date time) {
        this.time = time;
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
    public String getAction() {
        return this.action;
    }

    /**
     * 设置
     * 
     * @param action
     */
    public void setAction(String action) {
        this.action = action;
    }

    /**
     * 获取
     * 
     * @return 
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * 设置
     * 
     * @param message
     */
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * 获取
     * 
     * @return 
     */
    public Byte[] getFullMsg() {
        return this.fullMsg;
    }

    /**
     * 设置
     * 
     * @param fullMsg
     */
    public void setFullMsg(Byte[] fullMsg) {
        this.fullMsg = fullMsg;
    }
}