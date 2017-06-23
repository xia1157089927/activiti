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
 * ACT_ID_USER
 * 
 * @author bianj
 * @version 1.0.0 2017-06-24
 */
public class ActIdUser implements java.io.Serializable {
    /** 版本号 */
    private static final long serialVersionUID = -1641171203352913897L;

    /**  */
    private String id;

    /**  */
    private Integer rev;

    /**  */
    private String first;

    /**  */
    private String last;

    /**  */
    private String email;

    /**  */
    private String pwd;

    /**  */
    private String pictureId;

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
    public String getFirst() {
        return this.first;
    }

    /**
     * 设置
     * 
     * @param first
     */
    public void setFirst(String first) {
        this.first = first;
    }

    /**
     * 获取
     * 
     * @return 
     */
    public String getLast() {
        return this.last;
    }

    /**
     * 设置
     * 
     * @param last
     */
    public void setLast(String last) {
        this.last = last;
    }

    /**
     * 获取
     * 
     * @return 
     */
    public String getEmail() {
        return this.email;
    }

    /**
     * 设置
     * 
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * 获取
     * 
     * @return 
     */
    public String getPwd() {
        return this.pwd;
    }

    /**
     * 设置
     * 
     * @param pwd
     */
    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    /**
     * 获取
     * 
     * @return 
     */
    public String getPictureId() {
        return this.pictureId;
    }

    /**
     * 设置
     * 
     * @param pictureId
     */
    public void setPictureId(String pictureId) {
        this.pictureId = pictureId;
    }
}