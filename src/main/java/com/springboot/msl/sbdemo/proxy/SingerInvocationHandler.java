package com.springboot.msl.sbdemo.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

import com.springboot.msl.sbdemo.service.Singer;

public class SingerInvocationHandler implements InvocationHandler {
	
	private Singer target;
	
	public SingerInvocationHandler(Singer target) {
		super();
		this.target = target;
	}


	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("##### 调用前的动作............");
		
		Object result = method.invoke(target, args);
		
		System.out.println("@@@@@ 调用后的动作............");
		return result;
	}

}
