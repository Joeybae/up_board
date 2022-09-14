package com.example.fourgrowing;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class FourgrowingApplication {

    public static void main(String[] args) {
        SpringApplication.run(FourgrowingApplication.class, args);
    }
}
