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
 * ACT_ID_MEMBERSHIP
 * 
 * @author bianj
 * @version 1.0.0 2017-06-24
 */
public class ActIdMembership implements java.io.Serializable {
    /** 版本号 */
    private static final long serialVersionUID = -363771395270953770L;

    /**  */
    private String userId;

    /**  */
    private String groupId;

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
}