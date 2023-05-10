package com.programming.sakshem.blogster;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import org.springframework.scheduling.annotation.EnableAsync;

import com.programming.sakshem.blogster.config.SwaggerConfiguration;

@SpringBootApplication
@EnableAsync
@Import(SwaggerConfiguration.class)
public class Blogster {

    public static void main(String[] args) {
        SpringApplication.run(com.programming.sakshem.blogster.Blogster.class, args);
    }

}
