package com.jts.rest_template;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

	@Autowired
	private MyService myService;

	@GetMapping("/fetch-data")
	public String fetchData() {
		return myService.fetchData("https://jsonplaceholder.typicode.com/posts/1");
	}
}
