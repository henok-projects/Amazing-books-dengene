package com.api_gateway.api_gateway.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GatewayConfig {

    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
        return builder.routes()
            .route("customer", r -> r.path("/customer/**")
                .uri("lb://customer"))
            .route("author", r -> r.path("/author/**")
                .uri("lb://author")) // Use Eureka service name
            .route("book", r -> r.path("/book/**")
                .uri("lb://book"))
            .build();
    }
}
