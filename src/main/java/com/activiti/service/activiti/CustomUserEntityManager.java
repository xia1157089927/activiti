package com.activiti.service.activiti;

import org.activiti.engine.impl.persistence.entity.UserEntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CustomUserEntityManager extends UserEntityManager{
	// 这个Bean就是公司提供的统一身份访问接口，可以覆盖UserEntityManager的任何方法用公司内部的统一接口提供服务
	@Autowired
	private CustomUserManager customUserManager;
	public void temp(){
		customUserManager.hashCode();
	}
	
    @Override
    public Boolean checkPassword(String userId, String password) {
//        CustomUser customUser = customUserManager.get(new Long(userId));
//        return CustomUser.getPassword().equals(password);
    	return true;
    }
 
    
}
