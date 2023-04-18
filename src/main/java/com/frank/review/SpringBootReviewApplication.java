package com.frank.review;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.frank.review.controller.HelloController;

@SpringBootApplication
public class SpringBootReviewApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext ctx = 
        		SpringApplication.run(SpringBootReviewApplication.class, args);
//        HelloController helloCon = ctx.getBean(HelloController.class);
//        System.out.println("bean====>" + helloCon);
    }

}
