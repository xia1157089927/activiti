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
 * 公司部门表(T_DEPT)
 * 
 * @author bianj
 * @version 1.0.0 2017-06-24
 */
public class TDept implements java.io.Serializable {
    /** 版本号 */
    private static final long serialVersionUID = -1676793885303701340L;

    /** 主键 */
    private String deptId;

    /** 公司编号 */
    private Integer companyId;

    /** 部门名称 */
    private String deptName;

    /** 上级部门名称 */
    private Integer parentDeptId;

    /**
     * 获取主键
     * 
     * @return 主键
     */
    public String getDeptId() {
        return this.deptId;
    }

    /**
     * 设置主键
     * 
     * @param deptId
     *          主键
     */
    public void setDeptId(String deptId) {
        this.deptId = deptId;
    }

    /**
     * 获取公司编号
     * 
     * @return 公司编号
     */
    public Integer getCompanyId() {
        return this.companyId;
    }

    /**
     * 设置公司编号
     * 
     * @param companyId
     *          公司编号
     */
    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    /**
     * 获取部门名称
     * 
     * @return 部门名称
     */
    public String getDeptName() {
        return this.deptName;
    }

    /**
     * 设置部门名称
     * 
     * @param deptName
     *          部门名称
     */
    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    /**
     * 获取上级部门名称
     * 
     * @return 上级部门名称
     */
    public Integer getParentDeptId() {
        return this.parentDeptId;
    }

    /**
     * 设置上级部门名称
     * 
     * @param parentDeptId
     *          上级部门名称
     */
    public void setParentDeptId(Integer parentDeptId) {
        this.parentDeptId = parentDeptId;
    }
}