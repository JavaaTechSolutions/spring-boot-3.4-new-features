package com.jts.validation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import com.jts.validation.config.AppConfig;

@SpringBootApplication
@EnableConfigurationProperties(AppConfig.class)
public class BeanValidationApplication {

	public static void main(String[] args) {
		SpringApplication.run(BeanValidationApplication.class, args);
	}

}
