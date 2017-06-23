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

/**
 * ACT_RU_IDENTITYLINK
 * 
 * @author bianj
 * @version 1.0.0 2017-06-24
 */
public class ActRuIdentitylink implements java.io.Serializable {
    /** 版本号 */
    private static final long serialVersionUID = 411382663455452066L;

    /**  */
    private String id;

    /**  */
    private Integer rev;

    /**  */
    private String groupId;

    /**  */
    private String type;

    /**  */
    private String userId;

    /**  */
    private String taskId;

    /**  */
    private String procInstId;

    /**  */
    private String procDefId;

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
    public String getGroupId() {
        return this.groupId;
    }

    /**
     * 设置
     * 
     * @param groupId
     */
    public void setGroupId(String groupId) {
        this.groupId = groupId;
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
}