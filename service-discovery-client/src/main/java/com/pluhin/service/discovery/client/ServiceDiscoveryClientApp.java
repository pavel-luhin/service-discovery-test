package com.pluhin.service.discovery.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ServiceDiscoveryClientApp {

  public static void main(String[] args) {
    SpringApplication.run(ServiceDiscoveryClientApp.class, args);
  }
}
