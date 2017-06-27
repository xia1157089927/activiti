package test.activiti.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.activiti.engine.RepositoryService;
import org.activiti.engine.RuntimeService;
import org.activiti.engine.TaskService;
import org.activiti.engine.runtime.ProcessInstance;
import org.activiti.engine.task.Task;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import test.activiti.AbstractTestBase;

/**
 * 测试发布工作流
 * @author xiams
 *
 */
public class DeployFlowTest extends AbstractTestBase{
	@Autowired
	private RepositoryService repositoryService;
	@Autowired
	private RuntimeService runtimeService;
	@Autowired
	private TaskService taskService;
	
	@Test
	public void delpoyFlow(){
		//repositoryService.createDeployment().addClasspathResource("processes/vacationRequest.bpmn").deploy();
		repositoryService.createDeployment().addClasspathResource("processes/apply.bpmn").deploy();
		log.info("Number of process definitions: " + repositoryService.createProcessDefinitionQuery().count());
	}
	
	@Test
	public void startFlow(){
		log.info("run----");
		Map<String, Object> variables = new HashMap<String, Object>();
		variables.put("employeeName", "user");
		variables.put("numberOfDays", new Integer(4));
		variables.put("vacationMotivation", "I'm really tired!");

		ProcessInstance processInstance = runtimeService.startProcessInstanceByKey("apply", variables);
		// Verify that we started a new process instance
		log.info(processInstance.getActivityId() + "<<<Number of process instances: " + runtimeService.createProcessInstanceQuery().count());
	}
	
	@Test
	public void findCompletingTasks(){
		// Fetch all tasks for the management group
		List<Task> tasks = taskService.createTaskQuery().taskCandidateGroup("management").list();
		for (Task task : tasks) {
		  log.info("Task available: " + task.getName());
		}
	}
	
	@Test
	public void completingTasks(){
		// Fetch all tasks for the management group
		List<Task> tasks = taskService.createTaskQuery().taskCandidateGroup("management").list();
		Task task = tasks.get(0);

		Map<String, Object> taskVariables = new HashMap<String, Object>();
		taskVariables.put("vacationApproved", "false");
		taskVariables.put("managerMotivation", "We have a tight deadline!");
		taskService.complete(task.getId(), taskVariables);
	}
	
	
}
