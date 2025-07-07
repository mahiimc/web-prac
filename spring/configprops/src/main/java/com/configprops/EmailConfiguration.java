package com.configprops;


import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 *  Using @Value in one alternative option but what if there are more properties
 *  Lets say 10 properties required in one class and 4 props required in another class
 *  using @Value  is not a good option
 *
 *  so , using @ConfigurationProperties  map the properties to the dto , and inject it and re-use
 *
 */



@Data
@ConfigurationProperties(prefix = "email")
@NoArgsConstructor
@Component
public class EmailConfiguration {

    private String user;
    private String password;
    private Configuration configuration;

    @Data
    private static class Configuration {
        private String smtpServer;
        private String maxBodySize;
        private String  subject;
    }
}
