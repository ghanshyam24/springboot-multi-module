package com.user.management;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com")
public class UserHttpApplication {
    public static void main(String[] args) {
        SpringApplication.run(UserHttpApplication.class, args);
    }
}
