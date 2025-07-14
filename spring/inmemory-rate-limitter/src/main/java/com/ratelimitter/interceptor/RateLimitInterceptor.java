package com.ratelimitter.interceptor;


import com.ratelimitter.exception.TooManyRequestsException;
import io.github.bucket4j.Bandwidth;
import io.github.bucket4j.Bucket;
import io.github.bucket4j.Refill;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import java.time.Duration;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Slf4j
@Component
public class RateLimitInterceptor implements HandlerInterceptor {
    private final Map<String, Bucket> buckets = new ConcurrentHashMap<>();

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) {
        String ipAddress = request.getRemoteAddr();
        Bandwidth limit = Bandwidth.classic(5, Refill.intervally(5, Duration.ofMinutes(1)));
        Bucket bucket = buckets.computeIfAbsent(ipAddress, k-> Bucket.builder()
                .addLimit(limit)
                .build()
        );
        if(bucket.tryConsume(1)) {
            log.info("Tokens present : {}, trying to consume 1", bucket.getAvailableTokens());
            return  true;
        } else {
            log.info("No tokens");
           throw new TooManyRequestsException("You have exceeded your request limit. Try again later.");
        }
    }

}
