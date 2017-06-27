package com.activiti.service;

import org.springframework.stereotype.Component;

@Component
public class ApplyService {
	
	public String findManagerForEmployee(String emp){
		System.out.println("emp_value: " + emp);
		return "Xiams_";
	}
}
