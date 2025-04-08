package edu.min.flutter.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.min.flutter.config.KeyStore;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
public class BackendController {

  private final KeyStore keyStore;
  
  @GetMapping("/api/getKey")
  public ResponseEntity<String> loadApiKey() {
    return ResponseEntity.ok(keyStore.getSpringApiKey());
  }
  
}
