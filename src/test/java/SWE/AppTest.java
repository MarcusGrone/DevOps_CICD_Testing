package SWE;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {

  @Test
  public void testSayHello() {
    assertEquals("Hello, CI/CD!", App.sayHello()); //Trigger CI
  }
}
