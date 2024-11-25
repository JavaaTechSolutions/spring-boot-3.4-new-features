package com.jts.assertj;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExampleController {

	@GetMapping("/api/example")
	public String getExample() {
		return "Hello, AssertJ!";
	}
}
