package com.pluhin.service.discovery.client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecretController {

  private final String secretString;

  public SecretController(@Value("${service.discovery.client.secret}") String secretString) {
    this.secretString = secretString;
  }

  @GetMapping("/secret")
  public ResponseEntity<String> secret() {
    return ResponseEntity.ok(secretString);
  }
}
