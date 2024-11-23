package com.jts.rest_template;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class MyService {

	@Autowired
	private RestTemplate reactComponentRestTemplate;

	public String fetchData(String url) {
		return reactComponentRestTemplate.getForObject(url, String.class);
	}
}
