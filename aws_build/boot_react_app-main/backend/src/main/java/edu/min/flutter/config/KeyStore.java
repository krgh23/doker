package edu.min.flutter.config;

public class KeyStore {
  
  private String springApiKey;
  
  public KeyStore(String springApiKey) {
    this.springApiKey = springApiKey;
  }

  public String getSpringApiKey() {
    return springApiKey;
  }

  public void setSpringApiKey(String springApiKey) {
    this.springApiKey = springApiKey;
  }
  
}
