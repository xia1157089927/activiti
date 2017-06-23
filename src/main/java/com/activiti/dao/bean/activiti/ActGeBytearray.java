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
 * ACT_GE_BYTEARRAY
 * 
 * @author bianj
 * @version 1.0.0 2017-06-24
 */
public class ActGeBytearray implements java.io.Serializable {
    /** 版本号 */
    private static final long serialVersionUID = 1823527706631932841L;

    /**  */
    private String id;

    /**  */
    private Integer rev;

    /**  */
    private String name;

    /**  */
    private String deploymentId;

    /**  */
    private Byte[] bytes;

    /**  */
    private Integer generated;

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
    public String getName() {
        return this.name;
    }

    /**
     * 设置
     * 
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * 
     * @return 
     */
    public String getDeploymentId() {
        return this.deploymentId;
    }

    /**
     * 设置
     * 
     * @param deploymentId
     */
    public void setDeploymentId(String deploymentId) {
        this.deploymentId = deploymentId;
    }

    /**
     * 获取
     * 
     * @return 
     */
    public Byte[] getBytes() {
        return this.bytes;
    }

    /**
     * 设置
     * 
     * @param bytes
     */
    public void setBytes(Byte[] bytes) {
        this.bytes = bytes;
    }

    /**
     * 获取
     * 
     * @return 
     */
    public Integer getGenerated() {
        return this.generated;
    }

    /**
     * 设置
     * 
     * @param generated
     */
    public void setGenerated(Integer generated) {
        this.generated = generated;
    }
}