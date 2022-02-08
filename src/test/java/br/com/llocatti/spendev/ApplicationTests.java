package br.com.llocatti.spendev;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ApplicationTests {

  @Test
  void contextLoads() {
    Assertions.assertDoesNotThrow(() -> Application.main(new String[] {}));
  }
}
