package com.example.teemo_backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;


@EnableScheduling
@SpringBootApplication
public class TeemoBackEndApplication {

    public static void main(String[] args) {
        SpringApplication.run(TeemoBackEndApplication.class, args);
    }

}
