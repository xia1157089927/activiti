package com.activiti.service.activiti;

import org.activiti.engine.impl.interceptor.Session;
import org.activiti.engine.impl.interceptor.SessionFactory;
import org.activiti.engine.impl.persistence.entity.GroupEntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 自定义用户组
 * @author xiams
 * @version 1.0
 * @date 2017-06-23 17:23:18
 */
@Component
public class CustomGroupEntityManagerFactory implements SessionFactory{
	@Autowired
	private CustomGroupEntityManager customGroupEntityManager;
	
	@Override
	public Class<?> getSessionType() {
		return GroupEntityManager.class;
	}

	@Override
	public Session openSession() {
		return customGroupEntityManager;
	}

}
