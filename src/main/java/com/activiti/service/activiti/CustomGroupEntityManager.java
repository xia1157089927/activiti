package com.activiti.service.activiti;

import org.activiti.engine.impl.persistence.entity.GroupEntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CustomGroupEntityManager extends GroupEntityManager{
	@Autowired
	private CustomGroupManager customGroupManager;
	
	public void temp(){
		customGroupManager.hashCode();
	}
	
}
