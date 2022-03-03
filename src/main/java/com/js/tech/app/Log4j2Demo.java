package com.js.tech.app;

import org.apache.logging.log4j.*;

public class Log4j2Demo {
	private static final Logger log = LogManager.getLogger(Log4j2Demo.class);
    
	public static void main(String[]args){
	
		log.debug("This is Debug");
		log.info("This is info");
		log.warn("This is warn");
		log.error("This is error");
		log.fatal("This is fatal");
		
	}
}
