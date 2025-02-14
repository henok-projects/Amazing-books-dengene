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
            .route("product-service", r -> r.path("/products/**")
                .uri("lb://product-service")) // Use Eureka service name
            .route("order-service", r -> r.path("/orders/**")
                .uri("lb://order-service")) // Use Eureka service name
            .route("user-service", r -> r.path("/users/**")
                .uri("lb://user-service")) // Use Eureka service name
            .build();
    }
}
