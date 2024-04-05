package com.derezhenko.config.properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DatabaseProperties {
    private final String url;
    private final String username;
    private final String password;
    private final String driverClassName;
    private final Integer poolSize;

    public DatabaseProperties(@Value("${db.url}") String url,
                              @Value("${db.username}") String username,
                              @Value("${db.password}") String password,
                              @Value("${db.driver.classname}") String driverClassName,
                              @Value("${db.pool-size}") String poolSize){
        this.url = url;
        this.password = password;
        this.username = username;
        this.driverClassName = driverClassName;
        this.poolSize = Integer.valueOf(poolSize);
    }

    public String getUrl() {
        return url;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getDriverClassName() {
        return driverClassName;
    }

    public Integer getPoolSize() {
        return poolSize;
    }
}
