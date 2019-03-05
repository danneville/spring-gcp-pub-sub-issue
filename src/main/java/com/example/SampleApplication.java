package com.example;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@Slf4j
@SpringBootApplication
public class SampleApplication implements CommandLineRunner {

    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(SampleApplication.class, args);
        SpringApplication.exit(run);
    }

    @Override
    public void run(String... args) {
        log.info("Running");
    }
}