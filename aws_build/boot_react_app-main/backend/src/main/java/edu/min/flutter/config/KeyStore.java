package edu.min.flutter.config;

public class KeyStore {
  
  // 최종적으로 환경변수 정장되는 변수
  // .env > docker-compose.yml > backend/Dockerfile > application.properties > AppConfig.java > KeyStore.java
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
