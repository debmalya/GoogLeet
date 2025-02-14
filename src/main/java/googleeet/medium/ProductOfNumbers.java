package googleeet.medium;

import java.util.ArrayList;
import java.util.List;

/**
 * Design an algorithm that accepts a stream of integers and retrieves the product of the last k
 * integers of the stream.
 *
 * <p>Implement the ProductOfNumbers class:
 *
 * <p>ProductOfNumbers() Initializes the object with an empty stream. void add(int num) Appends the
 * integer num to the stream. int getProduct(int k) Returns the product of the last k numbers in the
 * current list. You can assume that always the current list has at least k numbers. The test cases
 * are generated so that, at any time, the product of any contiguous sequence of numbers will fit
 * into a single 32-bit integer without overflowing.
 */
public class ProductOfNumbers {
  List<Integer> prefixProducts;

  public ProductOfNumbers() {
    prefixProducts = new ArrayList<>();
    prefixProducts.add(1); // Initialize with 1 to handle the product of the first element
  }

  public void add(int num) {
    if (num == 0) {
      prefixProducts = new ArrayList<>();
      prefixProducts.add(1); // Reset the list if a zero is added
    } else {
      prefixProducts.add(prefixProducts.get(prefixProducts.size() - 1) * num);
    }
  }

  public int getProduct(int k) {
    int n = prefixProducts.size();
    if (k >= n) {
      return 0; // If k is greater than or equal to the size of the list, return 0
    }
    return prefixProducts.get(n - 1) / prefixProducts.get(n - k - 1);
  }
}
