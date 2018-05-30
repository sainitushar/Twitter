package com.project.twitter.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

@SuppressWarnings("deprecation")
@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan("com.project.twitter.web")
public class SpringBootFirstWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootFirstWebApplication.class, args);
	}
}
