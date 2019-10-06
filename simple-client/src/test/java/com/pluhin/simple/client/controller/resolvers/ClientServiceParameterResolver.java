package com.pluhin.simple.client.controller.resolvers;

import static org.mockito.Mockito.when;

import com.pluhin.simple.client.SecretClient;
import com.pluhin.simple.client.service.DefaultSimpleClientService;
import com.pluhin.simple.client.service.SimpleClientService;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.api.extension.ParameterContext;
import org.junit.jupiter.api.extension.ParameterResolutionException;
import org.junit.jupiter.api.extension.ParameterResolver;
import org.mockito.Mockito;

public class ClientServiceParameterResolver implements ParameterResolver {

  @Override
  public boolean supportsParameter(ParameterContext parameterContext, ExtensionContext extensionContext)
      throws ParameterResolutionException {
    return parameterContext.getParameter().getType() == SimpleClientService.class;
  }

  @Override
  public Object resolveParameter(ParameterContext parameterContext, ExtensionContext extensionContext)
      throws ParameterResolutionException {
    return mockService();
  }

  private SimpleClientService mockService() {
    return new DefaultSimpleClientService(client());
  }

  private SecretClient client() {
    SecretClient mock = Mockito.mock(SecretClient.class);
    when(mock.getSecret()).thenReturn("supersecret");
    return mock;
  }
}
