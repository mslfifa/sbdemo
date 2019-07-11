package com.springboot.msl.sbdemo.scheduce;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class MyScheduler {
	private static Logger log = LoggerFactory.getLogger(MyScheduler.class);
	
	@Scheduled(cron = "0 11 11 * * ?")
	public void cronJobSch() throws Exception{
		log.debug("##### cronJobSch execute ..... &&&&&&");
	}
}
