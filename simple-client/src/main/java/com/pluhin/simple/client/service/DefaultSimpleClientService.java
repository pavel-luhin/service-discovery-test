package com.pluhin.simple.client.service;

import com.pluhin.simple.client.SecretClient;
import com.pluhin.simple.client.dto.DataDTO;
import java.time.LocalDateTime;
import org.springframework.stereotype.Service;

@Service
public class DefaultSimpleClientService implements SimpleClientService {

  private final SecretClient secretClient;

  public DefaultSimpleClientService(SecretClient secretClient) {
    this.secretClient = secretClient;
  }

  @Override
  public DataDTO getSecretData() {
    return new DataDTO(
        secretClient.getSecret(),
        LocalDateTime.now()
    );
  }
}
