package com.eric.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @author: Eric
 * @Date: 2019/11/19 8:43
 * @Description:
 */
@Aspect
@Component
public class MyAspect {
	@Pointcut("execution(* com.eric.service.UserServiceImpl.service(..))")
	public void pointcut(){}

	@Before("pointcut()")
	public void doSomething(){
		System.out.println("MyAspect doSomething....");
	}
}
