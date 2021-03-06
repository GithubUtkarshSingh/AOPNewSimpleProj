package com.nt.aspect;

import java.util.Arrays;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class PerformanceMonitoringAdvice implements MethodInterceptor {

	private long start,end;
	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		Object retVal=null;
		System.out.println("before calling b.method");
		start=System.currentTimeMillis();
		//invoke b.method
		retVal =invocation.proceed();
		end=System.currentTimeMillis();
		System.out.println("After the calling b.method");
		System.out.println(invocation.getMethod().getName()+"with args"+Arrays.toString(invocation.getArguments())+"has taken"+(end-start)+"ms");
		
		return retVal;
	}

}
