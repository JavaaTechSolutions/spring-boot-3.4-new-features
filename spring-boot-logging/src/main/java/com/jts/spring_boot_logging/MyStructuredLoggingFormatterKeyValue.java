package com.jts.spring_boot_logging;

import org.springframework.boot.logging.structured.StructuredLogFormatter;

import ch.qos.logback.classic.spi.ILoggingEvent;

class MyStructuredLoggingFormatterKeyValue implements StructuredLogFormatter<ILoggingEvent> {

	@Override
	public String format(ILoggingEvent event) {
		return "time=" + event.getTimeStamp() + " level=" + event.getLevel() + " message=" + event.getMessage() + "\n";
	}

}