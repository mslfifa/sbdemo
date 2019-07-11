package com.springboot.msl.sbdemo.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class SimpleFilter implements Filter {

	private static Logger log = LoggerFactory.getLogger(SimpleFilter.class);
	
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		log.debug("@@@@@@@@@ destroy &&&&&&&&&");
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		log.debug("###### doFilter ^^^^^^^^^");
		chain.doFilter(request, response);
	}

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		// TODO Auto-generated method stub
		log.debug("%%%%%%%% destroy ^^^^^^^^^^");
	}
	
	

}
