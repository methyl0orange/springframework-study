package com.wxc.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan
public class AnnotationConfig {
    @Bean
    public AnnotationTestBean annotationTestBean(){
        return new AnnotationTestBean("1998","nnn");
    }
}
