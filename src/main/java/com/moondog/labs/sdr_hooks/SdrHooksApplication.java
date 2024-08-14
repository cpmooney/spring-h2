package com.moondog.labs.sdr_hooks;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.moondog.labs.sdr_hooks")
@EntityScan(basePackages = "com.moondog.labs.sdr_hooks")
public class SdrHooksApplication {

	public static void main(String[] args) {
		SpringApplication.run(SdrHooksApplication.class, args);
	}

}
