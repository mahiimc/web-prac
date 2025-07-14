package com.ratelimitter.config;


import com.ratelimitter.filters.RateLimitterFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public FilterRegistrationBean<RateLimitterFilter> rateLimitFilter() {
        FilterRegistrationBean<RateLimitterFilter> bean = new FilterRegistrationBean<>();
        bean.setFilter(new RateLimitterFilter());
        bean.addUrlPatterns("/api/test");
        return bean;
    }
}
