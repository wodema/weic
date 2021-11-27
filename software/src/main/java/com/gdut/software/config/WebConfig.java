package com.gdut.software.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedOrigins("Http://192.168.1.102:8080", "null")
                .allowedMethods("GET", "POST", "PUT", "OPTION", "DELETE")
                .maxAge(3600);
    }
}
