package com.jts.validation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jts.validation.config.AppConfig;

@RestController
@RequestMapping("/app")
public class AppController {

	@Autowired
	private AppConfig appConfig;

	@GetMapping("/config")
	public AppConfig getConfig() {
		return appConfig;
	}
}