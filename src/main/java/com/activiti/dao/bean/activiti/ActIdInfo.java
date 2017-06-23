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
 * ACT_ID_INFO
 * 
 * @author bianj
 * @version 1.0.0 2017-06-24
 */
public class ActIdInfo implements java.io.Serializable {
    /** 版本号 */
    private static final long serialVersionUID = 2120857723461046310L;

    /**  */
    private String id;

    /**  */
    private Integer rev;

    /**  */
    private String userId;

    /**  */
    private String type;

    /**  */
    private String key;

    /**  */
    private String value;

    /**  */
    private Byte[] password;

    /**  */
    private String parentId;

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
    public String getKey() {
        return this.key;
    }

    /**
     * 设置
     * 
     * @param key
     */
    public void setKey(String key) {
        this.key = key;
    }

    /**
     * 获取
     * 
     * @return 
     */
    public String getValue() {
        return this.value;
    }

    /**
     * 设置
     * 
     * @param value
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * 获取
     * 
     * @return 
     */
    public Byte[] getPassword() {
        return this.password;
    }

    /**
     * 设置
     * 
     * @param password
     */
    public void setPassword(Byte[] password) {
        this.password = password;
    }

    /**
     * 获取
     * 
     * @return 
     */
    public String getParentId() {
        return this.parentId;
    }

    /**
     * 设置
     * 
     * @param parentId
     */
    public void setParentId(String parentId) {
        this.parentId = parentId;
    }
}