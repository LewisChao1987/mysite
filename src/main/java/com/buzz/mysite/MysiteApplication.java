package com.buzz.mysite;

import nz.net.ultraq.thymeleaf.LayoutDialect;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.thymeleaf.TemplateEngine;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class MysiteApplication {

    public static void main(String[] args) {
        TemplateEngine templateEngine = new TemplateEngine();
        templateEngine.addDialect(new LayoutDialect());
        SpringApplication.run(MysiteApplication.class, args);
    }
}
