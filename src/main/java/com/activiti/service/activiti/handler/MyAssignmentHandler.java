package com.activiti.service.activiti.handler;

import org.activiti.engine.delegate.DelegateTask;
import org.activiti.engine.delegate.TaskListener;

public class MyAssignmentHandler implements TaskListener{
	private static final long serialVersionUID = 1L;

	@Override
	public void notify(DelegateTask delegateTask) {
		System.out.println("usertask1-----------");
		String eventName = delegateTask.getEventName();
		String assignee = delegateTask.getAssignee();
		System.out.println(assignee + "<--eventName:-->" + eventName);
	}


}
