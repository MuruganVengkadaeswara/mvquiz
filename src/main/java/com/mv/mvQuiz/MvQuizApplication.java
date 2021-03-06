package com.mv.mvQuiz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})
@EnableJpaRepositories(basePackages = "com.mv.mvQuiz.Repository")
@EntityScan(basePackages = "com.mv.mvQuiz.DomainEntities")
public class MvQuizApplication {

	public static void main(String[] args) {
		SpringApplication.run(MvQuizApplication.class, args);
	}

}
