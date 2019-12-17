package es.codeurjc.test.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class RestApp {

	private static ConfigurableApplicationContext app;

	public static void main(String[] args) throws Exception {
		SpringApplication.run(RestApp.class, args);
	}
	
}
