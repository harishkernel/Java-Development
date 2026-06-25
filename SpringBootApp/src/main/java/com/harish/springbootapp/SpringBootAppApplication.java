package com.harish.springbootapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootAppApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(SpringBootAppApplication.class, args);
        Dev dev = context.getBean(Dev.class);
        dev.build();
    }

}
