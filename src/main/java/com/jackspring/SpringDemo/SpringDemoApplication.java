package com.jackspring.SpringDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringDemoApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(SpringDemoApplication.class, args);

		// panggil class InjectViaContructorv //
		InjectViaContructor injectViaContructor = (InjectViaContructor) context.getBean("injectViaContructor");
		injectViaContructor.getMessage();

	}

}
