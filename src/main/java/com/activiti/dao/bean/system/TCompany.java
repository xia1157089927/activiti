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
 * 公司表(T_COMPANY)
 * 
 * @author bianj
 * @version 1.0.0 2017-06-24
 */
public class TCompany implements java.io.Serializable {
    /** 版本号 */
    private static final long serialVersionUID = 6206271185020726836L;

    /** 主键 */
    private String companyId;

    /** 公司名称 */
    private String cpmpanyName;

    /** 上级公司名称 */
    private Integer parentCompanyId;

    /**
     * 获取主键
     * 
     * @return 主键
     */
    public String getCompanyId() {
        return this.companyId;
    }

    /**
     * 设置主键
     * 
     * @param companyId
     *          主键
     */
    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }

    /**
     * 获取公司名称
     * 
     * @return 公司名称
     */
    public String getCpmpanyName() {
        return this.cpmpanyName;
    }

    /**
     * 设置公司名称
     * 
     * @param cpmpanyName
     *          公司名称
     */
    public void setCpmpanyName(String cpmpanyName) {
        this.cpmpanyName = cpmpanyName;
    }

    /**
     * 获取上级公司名称
     * 
     * @return 上级公司名称
     */
    public Integer getParentCompanyId() {
        return this.parentCompanyId;
    }

    /**
     * 设置上级公司名称
     * 
     * @param parentCompanyId
     *          上级公司名称
     */
    public void setParentCompanyId(Integer parentCompanyId) {
        this.parentCompanyId = parentCompanyId;
    }
}