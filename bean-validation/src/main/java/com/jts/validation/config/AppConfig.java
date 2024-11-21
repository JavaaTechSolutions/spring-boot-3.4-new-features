package com.jts.validation.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.validation.annotation.Validated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@ConfigurationProperties(prefix = "app")
@Validated
@Getter
@Setter
public class AppConfig {

    @NotNull(message = "App name must not be null")
    private String name;

    @Valid
    private NestedConfig nestedConfig = new NestedConfig();

    @Getter
    @Setter
    public static class NestedConfig {

        @NotNull(message = "Nested property must not be null")
        private String nestedProperty;
    }
}