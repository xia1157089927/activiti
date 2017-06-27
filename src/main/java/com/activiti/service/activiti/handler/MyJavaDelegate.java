package com.activiti.service.activiti.handler;

import org.activiti.engine.delegate.DelegateExecution;
import org.activiti.engine.delegate.JavaDelegate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MyJavaDelegate implements JavaDelegate{
	public static Logger log = LoggerFactory.getLogger(MyJavaDelegate.class);

	@Override
	public void execute(DelegateExecution execution) throws Exception {
		log.info("-------------自定义哦-----------");
		String value = String.valueOf(execution.getVariable("vacationMotivation"));
		log.info("-------------自定义哦value----------->" + value);
	}

}
