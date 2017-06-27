package com.activiti.service.activiti.handler;

import java.util.Map;

import org.activiti.engine.delegate.DelegateTask;
import org.activiti.engine.delegate.TaskListener;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.gson.Gson;

public class MyAssignmentHandler implements TaskListener{
	private static final long serialVersionUID = 1L;
	public static Logger log = LoggerFactory.getLogger(MyAssignmentHandler.class);
	
	@Override
	public void notify(DelegateTask delegateTask) {
		log.info("usertask1-----------");
		String eventName = delegateTask.getEventName();
		String assignee = delegateTask.getAssignee();
		
		Map<String, Object> map = delegateTask.getVariables();
		log.info("gsonMap: --> " + new Gson().toJson(map));
		
		log.info(assignee + "<--eventName:-->" + eventName);
	}


}
