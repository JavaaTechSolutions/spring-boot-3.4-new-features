package com.jts.activemq;

import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Service;

@Service
public class MessageProducerService {

	private final JmsTemplate jmsTemplate;

	public MessageProducerService(JmsTemplate jmsTemplate) {
		this.jmsTemplate = jmsTemplate;
	}

	public void sendMessage(String destination, String message) {
		jmsTemplate.convertAndSend(destination, message);
		System.out.println("Message sent: " + message);
	}

}
