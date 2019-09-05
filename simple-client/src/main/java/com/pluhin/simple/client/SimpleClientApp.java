package com.pluhin.simple.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class SimpleClientApp {

  public static void main(String[] args) {
    SpringApplication.run(SimpleClientApp.class, args);
  }
}
