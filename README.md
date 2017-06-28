# activiti

备注：
1. 以serviceTask为例，delegateExpression是引用一个JavaDelegate实现bean，具体的操作在这个bean中定义；而expression则可以写成#{loggerHandler.log()} 这样的，表达式本身就是要做的操作。

/** 
 * execute方法的参数DelegateExecution execution可以在流程中各个结点之间传递流程变量。  
 *上述流程定义中，4个任务结点对应的处理类 
 * <activiti:taskListener>元素的event属性，它一共包含三种事件："create"、"assignment"、"complete"，分别表示结点执行处理逻辑的时机为：在处理类实例化时、
 * 在结点处理逻辑被指派时、在结点处理逻辑执行完成时，可以根据自己的需要进行指定。  
 * <userTask id="servicetask2" name="产品经理同意"> 
       <extensionElements> 
          <activiti:taskListener event="complete" class="com.easyway.workflow.activiti.gateway.ProductManagerUserTaskListener"/> 
       </extensionElements> 
 * </userTask> 
 * 
 * 排他网关（ExclusiveGateWay）
 *
 **/

