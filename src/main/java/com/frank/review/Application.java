package com.frank.review;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.frank.review.controller.HelloController;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        ConfigurableApplicationContext ctx = 
        		SpringApplication.run(Application.class, args);
//        HelloController helloCon = ctx.getBean(HelloController.class);
//        System.out.println("bean====>" + helloCon);
    }

}
