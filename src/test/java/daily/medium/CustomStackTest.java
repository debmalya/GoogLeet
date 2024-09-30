package daily.medium;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class CustomStackTest {
  @Test
  void testPushPop() {
    CustomStack stack = new CustomStack(3);
    stack.push(1);
    stack.push(2);
    assertEquals(2, stack.pop());
    assertEquals(1, stack.pop());
    assertEquals(-1, stack.pop());
  }

  @Test
  void testIncrement() {
    CustomStack stack = new CustomStack(3);
    stack.push(1);
    stack.push(2);
    stack.push(3);
    stack.increment(2, 10);
    assertEquals(3, stack.pop());
    assertEquals(12, stack.pop());
    assertEquals(11, stack.pop());
  }

  @Test
  void testIncrementWithLessElements() {
    CustomStack stack = new CustomStack(3);
    stack.push(1);
    stack.increment(2, 5);
    assertEquals(6, stack.pop());
    assertEquals(-1, stack.pop());
  }
}
