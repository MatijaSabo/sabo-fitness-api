package com.sabo.fitness;

import com.sabo.fitness.config.AppProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(AppProperties.class)
public class SaboFitnessApplication {

	public static void main(String[] args) {
		SpringApplication.run(SaboFitnessApplication.class, args);
	}

}
