package com.jts.rest_template;

import java.time.Duration;

import org.springframework.boot.http.client.ClientHttpRequestFactoryBuilder;
import org.springframework.boot.http.client.ClientHttpRequestFactorySettings;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.http.client.JdkClientHttpRequestFactory;
import org.springframework.http.client.ReactorClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

@Configuration
public class HttpClientConfig {
	
	@Bean
	public RestTemplate jdkRestTemplate(RestTemplateBuilder builder) {
		return builder.requestFactory(this::jdkClientHttpRequestFactoryBuilder).build();
	}
	
	@Bean
	public RestTemplate httpComponentRestTemplate(RestTemplateBuilder builder) {
		return builder.requestFactory(this::httpClientHttpRequestFactoryBuilder).build();
	}
	
	@Bean
	public RestTemplate reactComponentRestTemplate(RestTemplateBuilder builder) {
		return builder.requestFactory(this::reacterClientHttpRequestFactoryBuilder).build();
	}
	
	public JdkClientHttpRequestFactory jdkClientHttpRequestFactoryBuilder() {
		return ClientHttpRequestFactoryBuilder.jdk().build(settings());
	}
	
	public HttpComponentsClientHttpRequestFactory httpClientHttpRequestFactoryBuilder() {
		return ClientHttpRequestFactoryBuilder.httpComponents().build(settings());
	}
	
	public ReactorClientHttpRequestFactory reacterClientHttpRequestFactoryBuilder() {
		return ClientHttpRequestFactoryBuilder.reactor().build(settings());
	}
	
	private ClientHttpRequestFactorySettings settings() {
		return ClientHttpRequestFactorySettings.defaults()
				.withConnectTimeout(Duration.ofSeconds(3))
				.withReadTimeout(Duration.ofSeconds(5));
	}

}
