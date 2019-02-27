package com.school.web.config;


import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;

@Configuration
public class DataSourceConfig {

    @ConfigurationProperties(prefix="spring.datasource.test")
    @Bean(name = "dataSource")
    public DataSource testDataSource() {
        return DataSourceBuilder.create().build();
    }

}
