Error Response: 
```
{
"message": "You have exceeded your request limit. Try again later."
}
```


Logs : 
```
:: Spring Boot ::                (v3.5.3)

2025-07-14T22:42:49.878+05:30  INFO 6861 --- [inmemory-rate-limitter] [           main] c.r.InmemoryRateLimitterApplication      : Starting InmemoryRateLimitterApplication using Java 23.0.1 with PID 6861 (/Users/mahi/Documents/Projects/web-prac/spring/inmemory-rate-limitter/target/classes started by mahi in /Users/mahi/Documents/Projects/web-prac/spring/inmemory-rate-limitter)
2025-07-14T22:42:49.880+05:30  INFO 6861 --- [inmemory-rate-limitter] [           main] c.r.InmemoryRateLimitterApplication      : No active profile set, falling back to 1 default profile: "default"
2025-07-14T22:42:50.220+05:30  INFO 6861 --- [inmemory-rate-limitter] [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat initialized with port 8080 (http)
2025-07-14T22:42:50.226+05:30  INFO 6861 --- [inmemory-rate-limitter] [           main] o.apache.catalina.core.StandardService   : Starting service [Tomcat]
2025-07-14T22:42:50.226+05:30  INFO 6861 --- [inmemory-rate-limitter] [           main] o.apache.catalina.core.StandardEngine    : Starting Servlet engine: [Apache Tomcat/10.1.42]
2025-07-14T22:42:50.241+05:30  INFO 6861 --- [inmemory-rate-limitter] [           main] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring embedded WebApplicationContext
2025-07-14T22:42:50.242+05:30  INFO 6861 --- [inmemory-rate-limitter] [           main] w.s.c.ServletWebServerApplicationContext : Root WebApplicationContext: initialization completed in 334 ms
2025-07-14T22:42:50.361+05:30  INFO 6861 --- [inmemory-rate-limitter] [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat started on port 8080 (http) with context path '/'
2025-07-14T22:42:50.365+05:30  INFO 6861 --- [inmemory-rate-limitter] [           main] c.r.InmemoryRateLimitterApplication      : Started InmemoryRateLimitterApplication in 0.67 seconds (process running for 0.83)
2025-07-14T22:42:58.184+05:30  INFO 6861 --- [inmemory-rate-limitter] [nio-8080-exec-1] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring DispatcherServlet 'dispatcherServlet'
2025-07-14T22:42:58.184+05:30  INFO 6861 --- [inmemory-rate-limitter] [nio-8080-exec-1] o.s.web.servlet.DispatcherServlet        : Initializing Servlet 'dispatcherServlet'
2025-07-14T22:42:58.185+05:30  INFO 6861 --- [inmemory-rate-limitter] [nio-8080-exec-1] o.s.web.servlet.DispatcherServlet        : Completed initialization in 0 ms
2025-07-14T22:42:58.197+05:30  INFO 6861 --- [inmemory-rate-limitter] [nio-8080-exec-1] c.r.interceptor.RateLimitInterceptor     : Tokens present : 4, trying to consume 1
2025-07-14T22:42:58.658+05:30  INFO 6861 --- [inmemory-rate-limitter] [nio-8080-exec-2] c.r.interceptor.RateLimitInterceptor     : Tokens present : 3, trying to consume 1
2025-07-14T22:42:58.955+05:30  INFO 6861 --- [inmemory-rate-limitter] [nio-8080-exec-3] c.r.interceptor.RateLimitInterceptor     : Tokens present : 2, trying to consume 1
2025-07-14T22:42:59.272+05:30  INFO 6861 --- [inmemory-rate-limitter] [nio-8080-exec-4] c.r.interceptor.RateLimitInterceptor     : Tokens present : 1, trying to consume 1
2025-07-14T22:42:59.589+05:30  INFO 6861 --- [inmemory-rate-limitter] [nio-8080-exec-5] c.r.interceptor.RateLimitInterceptor     : Tokens present : 0, trying to consume 1
2025-07-14T22:42:59.872+05:30  INFO 6861 --- [inmemory-rate-limitter] [nio-8080-exec-6] c.r.interceptor.RateLimitInterceptor     : No tokens
2025-07-14T22:43:00.156+05:30  INFO 6861 --- [inmemory-rate-limitter] [nio-8080-exec-7] c.r.interceptor.RateLimitInterceptor     : No tokens
2025-07-14T22:43:03.473+05:30  INFO 6861 --- [inmemory-rate-limitter] [nio-8080-exec-8] c.r.interceptor.RateLimitInterceptor     : No tokens
2025-07-14T22:43:03.601+05:30  INFO 6861 --- [inmemory-rate-limitter] [nio-8080-exec-9] c.r.interceptor.RateLimitInterceptor     : No tokens
2025-07-14T22:43:03.752+05:30  INFO 6861 --- [inmemory-rate-limitter] [io-8080-exec-10] c.r.interceptor.RateLimitInterceptor     : No tokens
2025-07-14T22:43:03.885+05:30  INFO 6861 --- [inmemory-rate-limitter] [nio-8080-exec-1] c.r.interceptor.RateLimitInterceptor     : No tokens
2025-07-14T22:43:04.035+05:30  INFO 6861 --- [inmemory-rate-limitter] [nio-8080-exec-2] c.r.interceptor.RateLimitInterceptor     : No tokens
2025-07-14T22:43:04.185+05:30  INFO 6861 --- [inmemory-rate-limitter] [nio-8080-exec-3] c.r.interceptor.RateLimitInterceptor     : No tokens
2025-07-14T22:43:04.335+05:30  INFO 6861 --- [inmemory-rate-limitter] [nio-8080-exec-4] c.r.interceptor.RateLimitInterceptor     : No tokens
2025-07-14T22:43:04.468+05:30  INFO 6861 --- [inmemory-rate-limitter] [nio-8080-exec-5] c.r.interceptor.RateLimitInterceptor     : No tokens
2025-07-14T22:43:04.601+05:30  INFO 6861 --- [inmemory-rate-limitter] [nio-8080-exec-6] c.r.interceptor.RateLimitInterceptor     : No tokens
2025-07-14T22:43:04.769+05:30  INFO 6861 --- [inmemory-rate-limitter] [nio-8080-exec-7] c.r.interceptor.RateLimitInterceptor     : No tokens
2025-07-14T22:43:04.903+05:30  INFO 6861 --- [inmemory-rate-limitter] [nio-8080-exec-8] c.r.interceptor.RateLimitInterceptor     : No tokens
2025-07-14T22:43:05.372+05:30  INFO 6861 --- [inmemory-rate-limitter] [nio-8080-exec-9] c.r.interceptor.RateLimitInterceptor     : No tokens
2025-07-14T22:43:05.805+05:30  INFO 6861 --- [inmemory-rate-limitter] [io-8080-exec-10] c.r.interceptor.RateLimitInterceptor     : No tokens
2025-07-14T22:43:06.239+05:30  INFO 6861 --- [inmemory-rate-limitter] [nio-8080-exec-1] c.r.interceptor.RateLimitInterceptor     : No tokens
2025-07-14T22:43:06.522+05:30  INFO 6861 --- [inmemory-rate-limitter] [nio-8080-exec-2] c.r.interceptor.RateLimitInterceptor     : No tokens
2025-07-14T22:43:06.671+05:30  INFO 6861 --- [inmemory-rate-limitter] [nio-8080-exec-3] c.r.interceptor.RateLimitInterceptor     : No tokens
2025-07-14T22:43:06.835+05:30  INFO 6861 --- [inmemory-rate-limitter] [nio-8080-exec-4] c.r.interceptor.RateLimitInterceptor     : No tokens
2025-07-14T22:43:07.122+05:30  INFO 6861 --- [inmemory-rate-limitter] [nio-8080-exec-5] c.r.interceptor.RateLimitInterceptor     : No tokens
2025-07-14T22:43:07.268+05:30  INFO 6861 --- [inmemory-rate-limitter] [nio-8080-exec-6] c.r.interceptor.RateLimitInterceptor     : No tokens
2025-07-14T22:43:07.439+05:30  INFO 6861 --- [inmemory-rate-limitter] [nio-8080-exec-7] c.r.interceptor.RateLimitInterceptor     : No tokens
2025-07-14T22:43:07.738+05:30  INFO 6861 --- [inmemory-rate-limitter] [nio-8080-exec-8] c.r.interceptor.RateLimitInterceptor     : No tokens
2025-07-14T22:43:07.868+05:30  INFO 6861 --- [inmemory-rate-limitter] [nio-8080-exec-9] c.r.interceptor.RateLimitInterceptor     : No tokens
2025-07-14T22:43:08.018+05:30  INFO 6861 --- [inmemory-rate-limitter] [io-8080-exec-10] c.r.interceptor.RateLimitInterceptor     : No tokens
2025-07-14T22:44:12.388+05:30  INFO 6861 --- [inmemory-rate-limitter] [nio-8080-exec-2] c.r.interceptor.RateLimitInterceptor     : Tokens present : 4, trying to consume 1
2025-07-14T22:44:13.054+05:30  INFO 6861 --- [inmemory-rate-limitter] [nio-8080-exec-3] c.r.interceptor.RateLimitInterceptor     : Tokens present : 3, trying to consume 1
2025-07-14T22:44:13.671+05:30  INFO 6861 --- [inmemory-rate-limitter] [nio-8080-exec-4] c.r.interceptor.RateLimitInterceptor     : Tokens present : 2, trying to consume 1
2025-07-14T22:44:14.205+05:30  INFO 6861 --- [inmemory-rate-limitter] [nio-8080-exec-5] c.r.interceptor.RateLimitInterceptor     : Tokens present : 1, trying to consume 1

```
