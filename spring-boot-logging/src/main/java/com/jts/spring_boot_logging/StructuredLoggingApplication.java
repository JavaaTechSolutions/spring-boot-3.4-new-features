package com.jts.spring_boot_logging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class StructuredLoggingApplication implements CommandLineRunner {
	
	private static final Logger log = LoggerFactory.getLogger(StructuredLoggingApplication.class);

	@Override
	public void run(String... args) throws Exception {
		MDC.put("userId", "1");
		
		log.trace("Trace log");
		log.debug("Debug log");
		log.info("Info log");
		log.warn("Warning log");
		log.error("Error log");
		
		 MDC.remove("userId");
	}

}
