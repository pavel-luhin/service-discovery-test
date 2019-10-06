package com.pluhin.simple.client.controller;

import com.pluhin.simple.client.dto.DataDTO;
import com.pluhin.simple.client.service.SimpleClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

  private final SimpleClientService clientService;

  @Autowired
  public TestController(SimpleClientService clientService) {
    this.clientService = clientService;
  }

  @GetMapping(value = "/", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
  public ResponseEntity<DataDTO> getData() {
    return ResponseEntity.ok(clientService.getSecretData());
  }
}
