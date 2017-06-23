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
 * 用户角色表(T_USER_ROLE)
 * 
 * @author bianj
 * @version 1.0.0 2017-06-24
 */
public class TUserRole implements java.io.Serializable {
    /** 版本号 */
    private static final long serialVersionUID = 7516172994473791286L;

    /** 主键 */
    private String id;

    /** 用户编号 */
    private Integer userId;

    /** 角色编号 */
    private Integer roleId;

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
     * 获取角色编号
     * 
     * @return 角色编号
     */
    public Integer getRoleId() {
        return this.roleId;
    }

    /**
     * 设置角色编号
     * 
     * @param roleId
     *          角色编号
     */
    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }
}