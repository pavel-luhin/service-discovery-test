package com.pluhin.simple.client.controller;

import com.pluhin.simple.client.controller.resolvers.ClientServiceParameterResolver;
import com.pluhin.simple.client.dto.DataDTO;
import com.pluhin.simple.client.service.SimpleClientService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(ClientServiceParameterResolver.class)
class TestControllerTest {

  @Test
  @DisplayName("Test client service return actual secret key")
  void testSuccess(SimpleClientService clientService) {
    DataDTO dataDTO = clientService.getSecretData();
    Assertions.assertAll(
        () -> Assertions.assertNotNull(dataDTO),
        () -> Assertions.assertEquals("supersecret", dataDTO.getSecret())
    );
  }
}