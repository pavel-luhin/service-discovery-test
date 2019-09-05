package com.pluhin.simple.client.dto;

import java.time.LocalDateTime;

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
}
