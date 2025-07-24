Conclusion:

Spring uses proxies to enable features like @Transactional, @Cacheable, @Async, etc., by wrapping your beans and intercepting method calls.

🟢 JDK Dynamic Proxy:
Used when your bean implements an interface.

Proxies only interface methods (public).

Does not work with classes that don’t implement interfaces.

Final methods are not proxied.

Faster and simpler, no subclassing involved.

🟠 CGLIB Proxy:
Used when your bean is a concrete class without an interface.

Creates a subclass of your class and overrides methods.

Cannot proxy final methods (or static methods).

Slightly heavier due to runtime bytecode manipulation.



```
/Library/Java/JavaVirtualMachines/jdk-23.jdk/Contents/Home/bin/java -javaagent:/Applications/IntelliJ IDEA CE.app/Contents/lib/idea_rt.jar=55693 -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath /Users/mahi/Documents/Projects/web-prac/spring/proxy/target/classes:/Users/mahi/.m2/repository/org/springframework/boot/spring-boot-starter-web/3.5.3/spring-boot-starter-web-3.5.3.jar:/Users/mahi/.m2/repository/org/springframework/boot/spring-boot-starter/3.5.3/spring-boot-starter-3.5.3.jar:/Users/mahi/.m2/repository/org/springframework/boot/spring-boot/3.5.3/spring-boot-3.5.3.jar:/Users/mahi/.m2/repository/org/springframework/boot/spring-boot-autoconfigure/3.5.3/spring-boot-autoconfigure-3.5.3.jar:/Users/mahi/.m2/repository/org/springframework/boot/spring-boot-starter-logging/3.5.3/spring-boot-starter-logging-3.5.3.jar:/Users/mahi/.m2/repository/ch/qos/logback/logback-classic/1.5.18/logback-classic-1.5.18.jar:/Users/mahi/.m2/repository/ch/qos/logback/logback-core/1.5.18/logback-core-1.5.18.jar:/Users/mahi/.m2/repository/org/apache/logging/log4j/log4j-to-slf4j/2.24.3/log4j-to-slf4j-2.24.3.jar:/Users/mahi/.m2/repository/org/apache/logging/log4j/log4j-api/2.24.3/log4j-api-2.24.3.jar:/Users/mahi/.m2/repository/org/slf4j/jul-to-slf4j/2.0.17/jul-to-slf4j-2.0.17.jar:/Users/mahi/.m2/repository/jakarta/annotation/jakarta.annotation-api/2.1.1/jakarta.annotation-api-2.1.1.jar:/Users/mahi/.m2/repository/org/yaml/snakeyaml/2.4/snakeyaml-2.4.jar:/Users/mahi/.m2/repository/org/springframework/boot/spring-boot-starter-json/3.5.3/spring-boot-starter-json-3.5.3.jar:/Users/mahi/.m2/repository/com/fasterxml/jackson/core/jackson-databind/2.19.1/jackson-databind-2.19.1.jar:/Users/mahi/.m2/repository/com/fasterxml/jackson/core/jackson-annotations/2.19.1/jackson-annotations-2.19.1.jar:/Users/mahi/.m2/repository/com/fasterxml/jackson/core/jackson-core/2.19.1/jackson-core-2.19.1.jar:/Users/mahi/.m2/repository/com/fasterxml/jackson/datatype/jackson-datatype-jdk8/2.19.1/jackson-datatype-jdk8-2.19.1.jar:/Users/mahi/.m2/repository/com/fasterxml/jackson/datatype/jackson-datatype-jsr310/2.19.1/jackson-datatype-jsr310-2.19.1.jar:/Users/mahi/.m2/repository/com/fasterxml/jackson/module/jackson-module-parameter-names/2.19.1/jackson-module-parameter-names-2.19.1.jar:/Users/mahi/.m2/repository/org/springframework/boot/spring-boot-starter-tomcat/3.5.3/spring-boot-starter-tomcat-3.5.3.jar:/Users/mahi/.m2/repository/org/apache/tomcat/embed/tomcat-embed-core/10.1.42/tomcat-embed-core-10.1.42.jar:/Users/mahi/.m2/repository/org/apache/tomcat/embed/tomcat-embed-el/10.1.42/tomcat-embed-el-10.1.42.jar:/Users/mahi/.m2/repository/org/apache/tomcat/embed/tomcat-embed-websocket/10.1.42/tomcat-embed-websocket-10.1.42.jar:/Users/mahi/.m2/repository/org/springframework/spring-web/6.2.8/spring-web-6.2.8.jar:/Users/mahi/.m2/repository/org/springframework/spring-beans/6.2.8/spring-beans-6.2.8.jar:/Users/mahi/.m2/repository/io/micrometer/micrometer-observation/1.15.1/micrometer-observation-1.15.1.jar:/Users/mahi/.m2/repository/io/micrometer/micrometer-commons/1.15.1/micrometer-commons-1.15.1.jar:/Users/mahi/.m2/repository/org/springframework/spring-webmvc/6.2.8/spring-webmvc-6.2.8.jar:/Users/mahi/.m2/repository/org/springframework/spring-aop/6.2.8/spring-aop-6.2.8.jar:/Users/mahi/.m2/repository/org/springframework/spring-context/6.2.8/spring-context-6.2.8.jar:/Users/mahi/.m2/repository/org/springframework/spring-expression/6.2.8/spring-expression-6.2.8.jar:/Users/mahi/.m2/repository/org/slf4j/slf4j-api/2.0.17/slf4j-api-2.0.17.jar:/Users/mahi/.m2/repository/org/springframework/spring-core/6.2.8/spring-core-6.2.8.jar:/Users/mahi/.m2/repository/org/springframework/spring-jcl/6.2.8/spring-jcl-6.2.8.jar com.proxy.ProxyApplication
2025-07-24T16:56:34.153+05:30  INFO 40557 --- [proxy] [           main] com.proxy.ProxyApplication               : Starting ProxyApplication using Java 23.0.1 with PID 40557 (/Users/mahi/Documents/Projects/web-prac/spring/proxy/target/classes started by mahi in /Users/mahi/Documents/Projects/web-prac/spring/proxy)
2025-07-24T16:56:34.156+05:30  INFO 40557 --- [proxy] [           main] com.proxy.ProxyApplication               : No active profile set, falling back to 1 default profile: "default"
2025-07-24T16:56:34.488+05:30  INFO 40557 --- [proxy] [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat initialized with port 8080 (http)
2025-07-24T16:56:34.494+05:30  INFO 40557 --- [proxy] [           main] o.apache.catalina.core.StandardService   : Starting service [Tomcat]
2025-07-24T16:56:34.494+05:30  INFO 40557 --- [proxy] [           main] o.apache.catalina.core.StandardEngine    : Starting Servlet engine: [Apache Tomcat/10.1.42]
2025-07-24T16:56:34.511+05:30  INFO 40557 --- [proxy] [           main] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring embedded WebApplicationContext
2025-07-24T16:56:34.511+05:30  INFO 40557 --- [proxy] [           main] w.s.c.ServletWebServerApplicationContext : Root WebApplicationContext: initialization completed in 320 ms
Concrete Injection : com.proxy.service.ManagerService$$SpringCGLIB$$0
Interface Injection : jdk.proxy2.$Proxy56
2025-07-24T16:56:34.766+05:30  INFO 40557 --- [proxy] [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat started on port 8080 (http) with context path '/'
2025-07-24T16:56:34.769+05:30  INFO 40557 --- [proxy] [           main] com.proxy.ProxyApplication               : Started ProxyApplication in 0.804 seconds (process running for 0.948)
```