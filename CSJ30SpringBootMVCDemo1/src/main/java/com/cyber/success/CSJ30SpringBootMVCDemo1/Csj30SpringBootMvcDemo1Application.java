package com.cyber.success.CSJ30SpringBootMVCDemo1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
/*
 * Indicates a configuration class that declares
 *  one or more @Bean methods and also triggers
 *   auto-configuration and component scanning. 
 *   This is a convenience annotation 
 *   that is equivalent to declaring @SpringBootConfiguration, 
 *   @EnableAutoConfiguration and @ComponentScan.
 * 
 * 
 * 
 * 
 */
@SpringBootApplication
//@ComponentScan(basePackages = {"model","controller","dao"})

public class Csj30SpringBootMvcDemo1Application {

	public static void main(String[] args) {
		SpringApplication.run(Csj30SpringBootMvcDemo1Application.class, args);
	}

}
