package daily.medium;

public class CustomStack {

  int currentIndex = 0;
  int[] stack;

  public CustomStack(int maxSize) {
    stack = new int[maxSize];
  }

  public void push(int x) {
    if (currentIndex < stack.length) {
      stack[currentIndex++] = x;
    }
  }

  public int pop() {
    if (currentIndex > 0) {
      return stack[--currentIndex];
    }
    return -1;
  }

  /**
   * Increments the bottom k elements of the stack by val. If there are less than k elements in the
   * stack, increment all the elements in the stack.
   *
   * @param k - integer.
   * @param val - integer value to increment by.
   */
  public void increment(int k, int val) {
    for (int i = 0; i < Math.min(k, stack.length); i++) {
      stack[i] += val;
    }
  }
}
