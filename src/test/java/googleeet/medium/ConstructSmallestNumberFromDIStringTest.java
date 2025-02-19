package googleeet.medium;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ConstructSmallestNumberFromDIStringTest {

  @Test
  void smallestNumber() {
    ConstructSmallestNumberFromDIString obj = new ConstructSmallestNumberFromDIString();
    assertEquals("123", obj.smallestNumber("II"));
    assertEquals("321", obj.smallestNumber("DD"));
  }
}
