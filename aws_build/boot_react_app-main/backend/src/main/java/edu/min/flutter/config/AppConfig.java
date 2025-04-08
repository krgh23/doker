package edu.min.flutter.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Configuration
public class AppConfig {

  private final Environment env;
  
  @Bean
  KeyStore keyStore() {
    return new KeyStore(env.getProperty("spring.api.key"));
  }
  
}
