package com.springboot.msl.sbdemo.proxy;

import java.lang.reflect.Proxy;

import com.springboot.msl.sbdemo.service.Singer;
import com.springboot.msl.sbdemo.service.impl.Agent;
import com.springboot.msl.sbdemo.service.impl.Star;

public class JavaProxyTest {

	public static void main(String[] args) {
		Singer zxy = new Agent(new Star());
		
		Singer other = (Singer) Proxy.newProxyInstance(zxy.getClass().getClassLoader(), new Class[]{Singer.class}, new SingerInvocationHandler(zxy));
		other.sing();
	}

}
