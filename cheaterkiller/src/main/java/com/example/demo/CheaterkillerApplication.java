package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = {"com.service.member", "com.example.demo" })
@EnableJpaRepositories(basePackages = {"com.repository.member"})
@EntityScan(basePackages = {"com.dao.member"})
public class CheaterkillerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CheaterkillerApplication.class, args);
	}

}
