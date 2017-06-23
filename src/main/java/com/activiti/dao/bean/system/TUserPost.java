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

package com.activiti.dao.bean.system;

/**
 * 用户岗位表(T_USER_POST)
 * 
 * @author bianj
 * @version 1.0.0 2017-06-24
 */
public class TUserPost implements java.io.Serializable {
    /** 版本号 */
    private static final long serialVersionUID = 2877868557846261924L;

    /** 主键 */
    private String id;

    /** 用户编号 */
    private Integer userId;

    /** 岗位编号 */
    private Integer postId;

    /**
     * 获取主键
     * 
     * @return 主键
     */
    public String getId() {
        return this.id;
    }

    /**
     * 设置主键
     * 
     * @param id
     *          主键
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获取用户编号
     * 
     * @return 用户编号
     */
    public Integer getUserId() {
        return this.userId;
    }

    /**
     * 设置用户编号
     * 
     * @param userId
     *          用户编号
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * 获取岗位编号
     * 
     * @return 岗位编号
     */
    public Integer getPostId() {
        return this.postId;
    }

    /**
     * 设置岗位编号
     * 
     * @param postId
     *          岗位编号
     */
    public void setPostId(Integer postId) {
        this.postId = postId;
    }
}