/*
 * @author Ashwani K
 */
package com.example.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.SecurityAutoConfiguration;

/**
 * The Class SpringBoot3Application.
 */
@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })
public class SpringBoot3Application {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		SpringApplication.run(SpringBoot3Application.class, args);
	}
}
