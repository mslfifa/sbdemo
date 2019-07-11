package com.springboot.msl.sbdemo.service.impl;

import com.springboot.msl.sbdemo.service.Singer;

public class Agent implements Singer {
	private Star star;
	
	public Agent(Star star) {
		super();
		this.star = star;
	}

	@Override
	public void sing() {
		System.out.println("agent get the money before star play!");
		star.sing();
	}

}
