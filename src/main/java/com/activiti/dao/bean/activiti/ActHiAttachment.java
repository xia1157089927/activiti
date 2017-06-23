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
 * ACT_HI_ATTACHMENT
 * 
 * @author bianj
 * @version 1.0.0 2017-06-24
 */
public class ActHiAttachment implements java.io.Serializable {
    /** 版本号 */
    private static final long serialVersionUID = 4061183805577073852L;

    /**  */
    private String id;

    /**  */
    private Integer rev;

    /**  */
    private String userId;

    /**  */
    private String name;

    /**  */
    private String description;

    /**  */
    private String type;

    /**  */
    private String taskId;

    /**  */
    private String procInstId;

    /**  */
    private String url;

    /**  */
    private String contentId;

    /**  */
    private Date time;

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
    public String getUrl() {
        return this.url;
    }

    /**
     * 设置
     * 
     * @param url
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * 获取
     * 
     * @return 
     */
    public String getContentId() {
        return this.contentId;
    }

    /**
     * 设置
     * 
     * @param contentId
     */
    public void setContentId(String contentId) {
        this.contentId = contentId;
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
}