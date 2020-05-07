package com.cool.ProductManagement.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@Configuration
//@PropertySource("file:config/app-config.properties")
@PropertySource("classpath:app-config.properties")
public class AppConfig {

    @Autowired
    private Environment env;

}
