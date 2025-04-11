package SWE;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AppIntegrationTest
{

  @Test
  public void testHelloPipeline(){
    String result = App.sayHello() + " TESTED";
    assertTrue(result.contains("CI/CD"));
  }
}
