package com.example.springboot_4_features.callExternalApidemo.config;

import com.example.springboot_4_features.callExternalApidemo.CommentsClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.reactive.function.client.support.WebClientAdapter;
import org.springframework.web.service.invoker.HttpServiceProxyFactory;

@Configuration
public class CommentConfig {

    @Bean
    CommentsClient commentClient() {
        WebClient webClient = WebClient.builder()
                .baseUrl("https://jsonplaceholder.typicode.com/")
                .build();

        HttpServiceProxyFactory factory =
                HttpServiceProxyFactory.builderFor(
                        WebClientAdapter.create(webClient)
                ).build();

        return factory.createClient(CommentsClient.class);
    }
}
