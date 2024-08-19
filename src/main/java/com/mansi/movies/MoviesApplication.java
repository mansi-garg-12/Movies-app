package com.mansi.movies;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
public class MoviesApplication {
	private MongoTemplate mongoTemplate;


	public static void main(String[] args) {
		SpringApplication.run(MoviesApplication.class, args);
	}
	@Bean
	CommandLineRunner runner() {
		return args -> {
			System.out.println("MongoTemplate bean: " + mongoTemplate);
			//System.out.println(mongoTemplate.getDb().getName());
		};
	}
}
