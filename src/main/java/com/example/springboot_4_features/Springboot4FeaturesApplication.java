package com.example.springboot_4_features;
//import org.springdoc.webmvc.ui.SwaggerConfig.swaggerWelcome;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.resilience.annotation.EnableResilientMethods;

@SpringBootApplication
@ConfigurationPropertiesScan
@EnableResilientMethods
public class Springboot4FeaturesApplication {

	public static void main(String[] args) {
		SpringApplication.run(Springboot4FeaturesApplication.class, args);
		/*ApplicationContext ctx = SpringApplication.run(Springboot4FeaturesApplication.class, args);
		for (String s : ctx.getBeanDefinitionNames()) {
			System.out.println(s);
		}
*/
	}

}
