package com.pluhin.simple.client.dto;

import java.time.LocalDateTime;
import java.util.Objects;

public class DataDTO {

  private final String secret;
  private final LocalDateTime serverTime;

  public DataDTO(String secret, LocalDateTime serverTime) {
    this.secret = secret;
    this.serverTime = serverTime;
  }

  public String getSecret() {
    return secret;
  }

  public LocalDateTime getServerTime() {
    return serverTime;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataDTO dataDTO = (DataDTO) o;
    return secret.equals(dataDTO.secret) &&
        serverTime.equals(dataDTO.serverTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(secret, serverTime);
  }
}
