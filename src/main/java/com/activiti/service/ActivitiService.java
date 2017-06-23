package com.activiti.service;

import java.util.List;

import org.activiti.engine.HistoryService;
import org.activiti.engine.RepositoryService;
import org.activiti.engine.RuntimeService;
import org.activiti.engine.TaskService;
import org.activiti.engine.history.HistoricProcessInstance;
import org.activiti.engine.task.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ActivitiService {
	@Autowired
	private RepositoryService repositoryService;
	@Autowired
	private RuntimeService runtimeService;
	@Autowired
	private TaskService taskService;
	@Autowired
	private HistoryService historyService;
	
	/**
	 * 部署流程
	 * @param resource 流程文件 (eg:FinancialReportProcess.bpmn20.xml)
	 */
	public void deployFlow(String resource){
		// 使用 RepositoryService 部署流程定义
		repositoryService.createDeployment().addClasspathResource(resource).deploy();
	}
	
	/**
	 * 使用 RuntimeService 创建一个流程的实例
	 * @param processDefinitionKey 流程名称
	 * @return
	 */
	public String startFlow(String processDefinitionKey){
		String procId = runtimeService.startProcessInstanceByKey(processDefinitionKey).getId();
		return procId;
	}
	
	/**
	 * 使用 TaskService 获取指定用户组的 Task 列表并使用指定用户领取这些任务
	 */
	public void getTasksAndClaim(String candidateGroup, String userId){
		List<Task> tasks = taskService.createTaskQuery().taskCandidateGroup(candidateGroup).list(); 
		for (Task task : tasks) { 
		    System.out.println("Following task is available for accountancy group: " + task.getName());      
		     // claim it 
		     taskService.claim(task.getId(), userId); 
		} 
	}
	
	/**
	 * 使用 TaskService 获取指定用户的工作 Task 列表，并完成这些任务
	 * @param assignee
	 */
	public void getTasksAndComplete(String assignee){
		List<Task> tasks = taskService.createTaskQuery().taskAssignee(assignee).list(); 
		for (Task task : tasks) { 
		     System.out.println("Task for fozzie: " + task.getName()); 
		     // Complete the task 
		     taskService.complete(task.getId()); 
		} 
	}
	
	/**
	 * 获取用户任务列表
	 * @param userId
	 * @return
	 */
	public Long getTaskNumByUserId(String userId){
		return taskService.createTaskQuery().taskAssignee(userId).count();
	}
	
	/**
	 * 使用 HistoryService 来查询指定流程实例的状态
	 * @param procId
	 */
	public void getFlowStatus(String procId){
		HistoricProcessInstance historicProcessInstance = historyService.createHistoricProcessInstanceQuery().processInstanceId(procId).singleResult(); 
		System.out.println("Process instance end time: " + historicProcessInstance.getEndTime());
	}
	
}
