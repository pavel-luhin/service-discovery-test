package com.pluhin.simple.client.controller;

import com.pluhin.simple.client.SecretClient;
import com.pluhin.simple.client.dto.DataDTO;
import java.time.LocalDateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

  private final SecretClient secretClient;

  @Autowired
  public TestController(SecretClient secretClient) {
    this.secretClient = secretClient;
  }

  @GetMapping(value = "/", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
  public ResponseEntity<DataDTO> getData() {
    final String secret = secretClient.getSecret();
    return ResponseEntity.ok(
        new DataDTO(secret, LocalDateTime.now())
    );
  }
}
