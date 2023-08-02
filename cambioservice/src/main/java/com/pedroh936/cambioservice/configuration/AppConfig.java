package com.pedroh936.cambioservice.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.pedroh936.cambioservice.mappers")
public class AppConfig {
}