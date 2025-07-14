package com.ratelimitter.filters;

import io.github.bucket4j.Bandwidth;
import io.github.bucket4j.Bucket;
import io.github.bucket4j.Refill;
import io.github.bucket4j.local.LocalBucketBuilder;
import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.http.HttpServletResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;

import java.io.IOException;
import java.time.Duration;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Slf4j
public class RateLimitterFilter implements Filter {
    private final Map<String, Bucket> buckets = new ConcurrentHashMap<>();

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        String ipAddress = request.getRemoteAddr();
        Bandwidth limit = Bandwidth.classic(5, Refill.intervally(5,Duration.ofMinutes(1)));
        Bucket bucket = buckets.computeIfAbsent(ipAddress, k-> Bucket.builder()
                .addLimit(limit)
                .build()
        );
        if(bucket.tryConsume(1)) {
            log.info("Tokens present : {}, trying to consume 1", bucket.getAvailableTokens());
            chain.doFilter(request,response);
        } else {
            log.info("No tokens");
            ((HttpServletResponse) response).setStatus(HttpStatus.TOO_MANY_REQUESTS.value());
        }
    }
}
