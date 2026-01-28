package com.example.springboot_4_features;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@ConfigurationPropertiesScan
public class Springboot4FeaturesApplication {

	public static void main(String[] args) {
		SpringApplication.run(Springboot4FeaturesApplication.class, args);
	}



}
