package com.bibhu.graphql;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.bibhu.graphql")
public class GraphqlWithSpringbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(GraphqlWithSpringbootApplication.class, args);
	}

}
