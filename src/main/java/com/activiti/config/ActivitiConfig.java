package com.activiti.config;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.activiti.engine.FormService;
import org.activiti.engine.HistoryService;
import org.activiti.engine.IdentityService;
import org.activiti.engine.ManagementService;
import org.activiti.engine.ProcessEngine;
import org.activiti.engine.ProcessEngineConfiguration;
import org.activiti.engine.RepositoryService;
import org.activiti.engine.RuntimeService;
import org.activiti.engine.TaskService;
import org.activiti.engine.impl.cfg.ProcessEngineConfigurationImpl;
import org.activiti.engine.impl.interceptor.SessionFactory;
import org.activiti.spring.ProcessEngineFactoryBean;
import org.activiti.spring.SpringProcessEngineConfiguration;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.PlatformTransactionManager;

import com.activiti.service.activiti.CustomGroupEntityManagerFactory;
import com.activiti.service.activiti.CustomUserEntityManagerFactory;

/**
 * activiti工作流配置
 * @author xiams
 * @version 1.0
 * @date 2017-06-20 17:36:09
 */
@Configuration
public class ActivitiConfig {
	@Autowired
	private CustomUserEntityManagerFactory customUserEntityManagerFactory;
	@Autowired
	private CustomGroupEntityManagerFactory customGroupEntityManagerFactory;
	
	/**
	 * 初始化 默认用户
	 * set  REST API users by default
	 * @param identityService
	 * @return
	 */
	@Bean
	public InitializingBean usersAndGroupsInitializer(final IdentityService identityService) {

	    return new InitializingBean() {
	        public void afterPropertiesSet() throws Exception {

	           /* Group group = identityService.newGroup("user");
	            group.setName("users");
	            group.setType("security-role");
	            identityService.saveGroup(group);

	            User admin = identityService.newUser("admin");
	            admin.setPassword("admin");
	            identityService.saveUser(admin);*/

	        }
	    };
	}
	
	/**
	 * 流程配置，与spring整合采用SpringProcessEngineConfiguration这个实现
	 * @param dataSource
	 * @param transactionManager
	 * @return
	 */
    @Bean
    public ProcessEngineConfiguration processEngineConfiguration(DataSource dataSource, PlatformTransactionManager transactionManager){
        SpringProcessEngineConfiguration processEngineConfiguration = new SpringProcessEngineConfiguration();
        processEngineConfiguration.setDataSource(dataSource);
        processEngineConfiguration.setDatabaseSchemaUpdate("true");
        processEngineConfiguration.setDatabaseType("mysql");
        
        /**
         * 整合自有的用户管理
         * 1.将数据整理同步到activiti 自带的用户表结构中
         * 2.自定义SessionFactory，非侵入式替换接口实现，对于公司内部有统一身份访问接口的推荐使用
         * 3.不需要编写Java代码，只需要创建同名视图即可
         */
        processEngineConfiguration.setDbIdentityUsed(false);
        List<SessionFactory> customSessionFactorys = new ArrayList<>();
        customSessionFactorys.add(customUserEntityManagerFactory);
        customSessionFactorys.add(customGroupEntityManagerFactory);
        processEngineConfiguration.setCustomSessionFactories(customSessionFactorys);
        processEngineConfiguration.setTransactionManager(transactionManager);

        return processEngineConfiguration;
    }

    /**
     * 流程引擎，与spring整合使用factoryBean
     * @param processEngineConfiguration
     * @return
     */
    @Bean
    public ProcessEngineFactoryBean processEngine(ProcessEngineConfiguration processEngineConfiguration){
        ProcessEngineFactoryBean processEngineFactoryBean = new ProcessEngineFactoryBean();
        processEngineFactoryBean.setProcessEngineConfiguration((ProcessEngineConfigurationImpl) processEngineConfiguration);
        return processEngineFactoryBean;
    }
    
    /**
     * RepositoryService:提供与流程定义相关的方法，可查询模型(model)、流程定义(process definition)、流程部署(deployment)。
     * Activiti 中每一个不同版本的业务流程的定义都需要使用一些定义文件，部署文件和支持数据 ( 例如 BPMN2.0 XML 文件，表单定义文件，流程定义图像文件等 )，
     * 这些文件都存储在 Activiti 内建的 Repository 中。Repository Service 提供了对 repository 的存取服务。
     * @param processEngine
     * @return
     */
    @Bean
    public RepositoryService repositoryService(ProcessEngine processEngine){
        return processEngine.getRepositoryService();
    }
    
    /**
     * RuntimeService:提供流程执行时相关的方法，可查询流程实例(process insatnce)、执行实例(execution)，可开启流程实例。
     * 在 Activiti 中，每当一个流程定义被启动一次之后，都会生成一个相应的流程对象实例。Runtime Service 提供了启动流程、查询流程实例、设置获取流程实例变量等功能。
     * 此外它还提供了对流程部署，流程定义和流程实例的存取服务。
     * @param processEngine
     * @return
     */
    @Bean
    public RuntimeService runtimeService(ProcessEngine processEngine){
        return processEngine.getRuntimeService();
    }
    
    /**
     * TaskService:提供任务相关的方法，可进行查询、指派、完成任务等操作。
     * 在 Activiti 中业务流程定义中的每一个执行节点被称为一个 Task，对流程中的数据存取，状态变更等操作均需要在 Task 中完成。
     * Task Service 提供了对用户 Task 和 Form 相关的操作。它提供了运行时任务查询、领取、完成、删除以及变量设置等功能。
     * @param processEngine
     * @return
     */
    @Bean
    public TaskService taskService(ProcessEngine processEngine){
        return processEngine.getTaskService();
    }
    
    /**
     * HistoriyService:提供历史记录相关的方法，可查询历史任务(historic task instance)，历史流程实例(historic process instance)等。
     * History Service 用于获取正在运行或已经完成的流程实例的信息，与 Runtime Service 中获取的流程信息不同，历史信息包含已经持久化存储的永久信息，并已经被针对查询优化。
     * @param processEngine
     * @return
     */
    @Bean
    public HistoryService historyService(ProcessEngine processEngine){
        return processEngine.getHistoryService();
    }
    
    /**
     * FormService:提供表单相关的方法，一个用户任务可对应一个formkey，可通过formkey查找表单，提供表单的获取等方法。
     * Activiti 中的流程和状态 Task 均可以关联业务相关的数据。通过使用 Form Service 可以存取启动和完成任务所需的表单数据并且根据需要来渲染表单。
     * @param processEngine
     * @return
     */
    @Bean
    public FormService formService(ProcessEngine processEngine){
        return processEngine.getFormService();
    }
    
    /**
     * IdentityService:提供用户权限认证相关的方法，可查询用户、组等信息，可设置当前用户。
     * Activiti 中内置了用户以及组管理的功能，必须使用这些用户和组的信息才能获取到相应的 Task。Identity Service 提供了对 Activiti 系统中的用户和组的管理功能。
     * @param processEngine
     * @return
     */
    @Bean
    public IdentityService identityService(ProcessEngine processEngine){
        return processEngine.getIdentityService();
    }
    
    /**
     * ManagementService:与引擎配置相关，可获取引擎数据库信息，并且可以执行自定义的命令(command)。
     * Management Service 提供了对 Activiti 流程引擎的管理和维护功能，这些功能不在工作流驱动的应用程序中使用，主要用于 Activiti 系统的日常维护。
     * @param processEngine
     * @return
     */
    @Bean
    public ManagementService managementService(ProcessEngine processEngine){
        return processEngine.getManagementService();
    }
	
    /**
     * 提供动态获取，以及动态修改流程定义的方法。
     * @param processEngine
     * @return
     */
    @Bean
    public ProcessEngineConfiguration processEngineConfiguration(ProcessEngine processEngine){
    	return processEngine.getProcessEngineConfiguration();
    }
    
}
