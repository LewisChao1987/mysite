package com.buzz.mysite;

import nz.net.ultraq.thymeleaf.LayoutDialect;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.thymeleaf.TemplateEngine;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@PropertySource(value = {"classpath:config/config.properties","classpath:config/redis.properties"},
        ignoreResourceNotFound = true,encoding = "utf-8")
@ImportResource(locations = "classpath:bean/default.xml")
@EnableWebSecurity
public class MysiteApplication {
    public static void main(String[] args) {
        TemplateEngine templateEngine = new TemplateEngine();
        templateEngine.addDialect(new LayoutDialect());
        SpringApplication.run(MysiteApplication.class, args);
    }
}
