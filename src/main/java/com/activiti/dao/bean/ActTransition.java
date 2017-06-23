package com.activiti.dao.bean;

import java.util.List;

/**
 * 下一步处理信息，此类主要用于人员或路由选择页面
 * @author Ruoli
 * 2016/08/23
 */
public class ActTransition {
    private String id;//路由ID
    private String name;//路由名称
    private String description;//路由描述
    private String condition;//路由条件
    private String taskName;//下一步环节的名称
    private List<String> taskRoleList; //下一步审批角色集合
    //可根据业务需求新增更多字段
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getTaskName() {
        return taskName;
    }
    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }
    public List<String> getTaskRoleList() {
        return taskRoleList;
    }
    public void setTaskRoleList(List<String> taskRoleList) {
        this.taskRoleList = taskRoleList;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public String getCondition() {
        return condition;
    }
    public void setCondition(String condition) {
        this.condition = condition;
    }
}