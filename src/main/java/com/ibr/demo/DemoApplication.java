package com.ibr.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * The main class for the Demo application.
 * This class is responsible for bootstrapping the Spring Boot application.
 */
@SpringBootApplication
public class DemoApplication {

    /**
     * The main method which serves as the entry point for the Spring Boot application.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }
}
