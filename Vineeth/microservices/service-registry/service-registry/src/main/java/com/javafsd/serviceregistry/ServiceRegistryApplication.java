package com.javafsd.serviceregistry;

import org.springframework.boot.SpringApplication;


@SpringBootApplication
@EnableEurekaServer
public class ServiceRegistryApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceRegistryApplication.class, args);
    }

}
