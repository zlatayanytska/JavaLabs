package com.tour.tour;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class AttractionApplication {

	public static void main(String[] args) {
		SpringApplication.run(AttractionApplication.class, args);
	}
}
