package googleeet.medium;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ProductOfNumbersTest {
  ProductOfNumbers productOfNumbers = new ProductOfNumbers();

  @Test
  void getProduct() {
    productOfNumbers.add(3);
    productOfNumbers.add(0);
    productOfNumbers.add(2);
    productOfNumbers.add(5);
    productOfNumbers.add(4);
    assertEquals(20, productOfNumbers.getProduct(2));
    assertEquals(40, productOfNumbers.getProduct(3));
    assertEquals(0, productOfNumbers.getProduct(4));
  }
}
