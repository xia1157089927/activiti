package com.activiti.service.activiti.handler;

import org.activiti.engine.delegate.DelegateExecution;
import org.activiti.engine.delegate.JavaDelegate;

public class MyJavaDelegate implements JavaDelegate{

	@Override
	public void execute(DelegateExecution execution) throws Exception {
		System.out.println("-------------自定义哦-----------");
		String value = String.valueOf(execution.getVariable("vacationMotivation"));
		System.out.println("-------------自定义哦value----------->" + value);
	}

}
