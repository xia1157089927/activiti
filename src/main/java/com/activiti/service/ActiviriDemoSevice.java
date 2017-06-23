package com.activiti.service;

import java.util.List;

import org.activiti.engine.HistoryService;
import org.activiti.engine.IdentityService;
import org.activiti.engine.RuntimeService;
import org.activiti.engine.TaskService;
import org.activiti.engine.history.HistoricProcessInstanceQuery;
import org.activiti.engine.identity.Group;
import org.activiti.engine.runtime.ProcessInstanceQuery;
import org.activiti.engine.task.TaskQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * 我们目前分为4中状态：未签收、办理中、运行中、已完成。
 * @author xiams
 * @version 1.0
 * @date 2017-06-22 16:00:12
 */
@Service
public class ActiviriDemoSevice {
	@Autowired
	private TaskService taskService;
	@Autowired
	private RuntimeService runtimeService;
	@Autowired
	private HistoryService historyService;
	@Autowired
	private IdentityService identityService;
	
	/**
	 * 未签收(Task)
	 * 
	 * 获取未签收的任务查询对象
	 * 此类任务针对于把Task分配给一个角色时，例如部门领导，因为部门领导角色可以指定多个人所以需要先签收再办理，术语：抢占式
	 * @param userId    用户ID
	 */
	@Transactional(readOnly = true)
	public TaskQuery createUnsignedTaskQuery(String processDefKey, String userId) {
	    TaskQuery taskCandidateUserQuery = taskService.createTaskQuery().processDefinitionKey(processDefKey).taskCandidateUser(userId);
	    return taskCandidateUserQuery;
	}
	
	/**
	 * 办理中(Task)
	 * 
	 * 获取正在处理的任务查询对象
	 * 此类任务数据类源有两种:
	 *   签收后的，5.1中签收后就应该为办理中状态
	 *   节点指定的是具体到一个人，而不是角色
	 * @param userId    用户ID
	 */
	@Transactional(readOnly = true)
	public TaskQuery createTodoTaskQuery(String processDefKey, String userId) {
	    TaskQuery taskAssigneeQuery = taskService.createTaskQuery().processDefinitionKey(processDefKey).taskAssignee(userId);
	    return taskAssigneeQuery;
	}
	
	/**
	 * 运行中(ProcessInstance)
	 * 
	 * 获取未经完成的流程实例查询对象
	 * 说白了就是没有结束的流程，所有参与过的人都应该可以看到这个实例，但是Activiti的API没有可以通过用户查询的方法，这个只能自己用hack的方式处理了，我目前还没有处理。
	 * 从表ACT_RU_EXECUTION中查询数据。
	 * @param userId    用户ID
	 */
	@Transactional(readOnly = true)
	public ProcessInstanceQuery createUnFinishedProcessInstanceQuery(String processDefKey, String userId) {
	    ProcessInstanceQuery unfinishedQuery = runtimeService.createProcessInstanceQuery().processDefinitionKey(processDefKey).active();
	    return unfinishedQuery;
	}
	
	/**
	 * 已完成(HistoricProcessInstance)
	 * 
	 * 已经结束的流程实例。
	 * 从表ACT_HI_PROCINST中查询数据。
	 * 获取已经完成的流程实例查询对象
	 * @param userId    用户ID
	 */
	@Transactional(readOnly = true)
	public HistoricProcessInstanceQuery createFinishedProcessInstanceQuery(String processDefKey, String userId) {
	    HistoricProcessInstanceQuery finishedQuery = historyService.createHistoricProcessInstanceQuery().processDefinitionKey(processDefKey).finished();
	    return finishedQuery;
	}
	
	/**
	 * 同步用户数据
	 * 保存用户信息 并且同步用户信息到activiti的identity.User，同时设置角色
	 * 这个问题也是比较多的人询问过，Activiti支持对任务分配到：指定人、指定组、两者组合，而这些人和组的信息都保存在ACT_ID..表中，有自己的用户和组(角色)管理让很多人不知所措了；
	 * 原因是因为每个系统都会存在一个权限管理模块（维护：用户、部门、角色、授权），不知道该怎么和Activiti同步。
	 *
	 * 2.4.1 建议处理方式
	 * Activiti有一个IdentityService接口，通过这个接口可以操控Activiti的ACT_ID_*表的数据，一般的做法是用业务系统的权限管理模块维护用户数据，
	 * 当进行CRUD操作的时候在原有业务逻辑后面添加同步到Activiti的代码；例如添加一个用户时同步Activiti User的代码片段：
	 * @param user
	 * @param roleIds
	 */
	public void saveUser(/*User user,*/ List<Long> roleIds, boolean synToActiviti) {
		//accountManager.saveEntity(user);
		//String userId = user.getId().toString();
		String userId = "";
		if (synToActiviti) {
			List<org.activiti.engine.identity.User> activitiUsers = identityService.createUserQuery().userId(userId).list();
			if (activitiUsers.size() == 1) {
				//更新信息
				org.activiti.engine.identity.User activitiUser = activitiUsers.get(0);
				activitiUser.setFirstName("userName");
				activitiUser.setLastName("");
				activitiUser.setPassword("setPassword");
				activitiUser.setEmail("emnail");
				identityService.saveUser(activitiUser);

				// 删除用户的membership
				List<Group> activitiGroups = identityService.createGroupQuery().groupMember(userId).list();
				for (Group group : activitiGroups) {
					identityService.deleteMembership(userId, group.getId());
				}

				// 添加membership
				for (Long roleId : roleIds) {
					//Role role = roleManager.getEntity(roleId);
					identityService.createMembership(userId, "roleName");
				}

			} else {
				org.activiti.engine.identity.User newUser = identityService.newUser(userId);
				newUser.setFirstName("userName");
				newUser.setLastName("");
				newUser.setPassword("setPassword");
				newUser.setEmail("setEmail");
				identityService.saveUser(newUser);

				// 添加membership
				for (Long roleId : roleIds) {
					//Role role = roleManager.getEntity(roleId);
					identityService.createMembership(userId, "roleName");
				}
			}
		}

	}
	
	
}
