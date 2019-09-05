package com.pluhin.simple.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("service-discovery-client")
public interface SecretClient {

  @RequestMapping("/secret")
  String getSecret();
}
