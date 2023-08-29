package daily;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * mplement a last-in-first-out (LIFO) stack using only two queues. The implemented stack should support all the functions of a normal stack (push, top, pop, and empty).
 * <p>
 * Implement the MyStack class:
 * <p>
 * void push(int x) Pushes element x to the top of the stack.
 * int pop() Removes the element on the top of the stack and returns it.
 * int top() Returns the element on the top of the stack.
 * boolean empty() Returns true if the stack is empty, false otherwise.
 * Notes:
 * <p>
 * You must use only standard operations of a queue, which means that only push to back, peek/pop from front, size and is empty operations are valid.
 * Depending on your language, the queue may not be supported natively. You may simulate a queue using a list or deque (double-ended queue) as long as you use only a queue's standard operations.
 */
class MyStackTest {
    MyStack obj = new MyStack();

    @Test
    void pop() {
        obj.push(1);
        obj.push(2);
        assertEquals(2, obj.pop());
    }

    @Test
    void top() {
        obj.push(1);
        obj.push(2);
        assertEquals(2, obj.top());
        assertEquals(2, obj.pop());
        assertEquals(1, obj.top());
    }

    @Test
    void empty() {
        obj.push(1);
        obj.push(2);
        assertEquals(2, obj.pop());
        assertEquals(1, obj.top());
        assertFalse(obj.empty());

        assertEquals(1, obj.pop());
        assertTrue(obj.empty());


    }
}