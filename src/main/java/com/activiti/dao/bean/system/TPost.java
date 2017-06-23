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
 * 部门岗位表(T_POST)
 * 
 * @author bianj
 * @version 1.0.0 2017-06-24
 */
public class TPost implements java.io.Serializable {
    /** 版本号 */
    private static final long serialVersionUID = -4444739728813159793L;

    /** 主键 */
    private String postId;

    /** 部门ID */
    private Integer deptId;

    /** 岗位名称 */
    private String postName;

    /**
     * 获取主键
     * 
     * @return 主键
     */
    public String getPostId() {
        return this.postId;
    }

    /**
     * 设置主键
     * 
     * @param postId
     *          主键
     */
    public void setPostId(String postId) {
        this.postId = postId;
    }

    /**
     * 获取部门ID
     * 
     * @return 部门ID
     */
    public Integer getDeptId() {
        return this.deptId;
    }

    /**
     * 设置部门ID
     * 
     * @param deptId
     *          部门ID
     */
    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
    }

    /**
     * 获取岗位名称
     * 
     * @return 岗位名称
     */
    public String getPostName() {
        return this.postName;
    }

    /**
     * 设置岗位名称
     * 
     * @param postName
     *          岗位名称
     */
    public void setPostName(String postName) {
        this.postName = postName;
    }
}