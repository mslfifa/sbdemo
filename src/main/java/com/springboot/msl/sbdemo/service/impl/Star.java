package com.springboot.msl.sbdemo.service.impl;

import com.springboot.msl.sbdemo.service.Singer;

public class Star implements Singer {

	@Override
	public void sing() {
		System.out.println("start sign.....");
	}

}
