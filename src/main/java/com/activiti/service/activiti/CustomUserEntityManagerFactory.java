package com.activiti.service.activiti;

import org.activiti.engine.impl.interceptor.Session;
import org.activiti.engine.impl.interceptor.SessionFactory;
import org.activiti.engine.impl.persistence.entity.UserIdentityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CustomUserEntityManagerFactory implements SessionFactory{
	@Autowired
	private CustomUserEntityManager customUserEntityManager;
 
    @Override
    public Class<?> getSessionType() { // 返回引擎的实体管理器接口
        return UserIdentityManager.class;
    }
 
    @Override
    public Session openSession() {
        return customUserEntityManager;
    }
	
}
