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
 * 角色表(T_ROLE)
 * 
 * @author bianj
 * @version 1.0.0 2017-06-24
 */
public class TRole implements java.io.Serializable {
    /** 版本号 */
    private static final long serialVersionUID = -4344044990002614479L;

    /**  */
    private String roleId;

    /** 角色名称 */
    private String roleName;

    /**  */
    private String describe;

    /**
     * 获取
     * 
     * @return 
     */
    public String getRoleId() {
        return this.roleId;
    }

    /**
     * 设置
     * 
     * @param roleId
     */
    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    /**
     * 获取角色名称
     * 
     * @return 角色名称
     */
    public String getRoleName() {
        return this.roleName;
    }

    /**
     * 设置角色名称
     * 
     * @param roleName
     *          角色名称
     */
    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    /**
     * 获取
     * 
     * @return 
     */
    public String getDescribe() {
        return this.describe;
    }

    /**
     * 设置
     * 
     * @param describe
     */
    public void setDescribe(String describe) {
        this.describe = describe;
    }
}