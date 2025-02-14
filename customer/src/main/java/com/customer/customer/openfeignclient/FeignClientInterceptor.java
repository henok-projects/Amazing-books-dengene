package com.customer.customer.openfeignclient;

import feign.RequestInterceptor;
import feign.RequestTemplate;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
@RequiredArgsConstructor
public class FeignClientInterceptor implements RequestInterceptor {

//    private final JwtUtil jwtUtil;
    private String cachedToken;
    private Date tokenExpiryTime;

    @Override
    public void apply(RequestTemplate requestTemplate) {
        if (cachedToken == null || new Date().after(tokenExpiryTime)) {
            // Generate a new token if it doesn't exist or has expired
//            cachedToken = jwtUtil.generateToken("customer","customer", "customer");
//            tokenExpiryTime = jwtUtil.extractClaims(cachedToken).getExpiration();
        }
        requestTemplate.header("Authorization", "Bearer " + cachedToken);
        requestTemplate.header("X-User", "user-service");
    }
}
