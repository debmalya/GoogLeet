package daily;

import java.util.Stack;

/**
 * Implement a first in first out (FIFO) queue using only two stacks. The
 * implemented queue should support all the functions of a normal queue (push,
 * peek, pop, and empty).
 * 
 * Implement the MyQueue class:
 * 
 * void push(int x) Pushes element x to the back of the queue. int pop() Removes
 * the element from the front of the queue and returns it. int peek() Returns
 * the element at the front of the queue. boolean empty() Returns true if the
 * queue is empty, false otherwise.
 * 
 * @author DJash
 *
 */
public class MyQueue {
	Stack<Integer> stack;

	public MyQueue() {
		stack = new Stack<>();

	}

	public void push(int x) {
		stack.push(x);
	}

	public int pop() {
		int first = 0;
		Stack<Integer> temp = new Stack<>();
		while (!stack.isEmpty()) {
			temp.push(stack.pop());
		}
		if (!temp.isEmpty()) {
			first = temp.pop();
		}

		while (!temp.isEmpty()) {
			stack.push(temp.pop());
		}
		return first;

	}

	public int peek() {
		int first = 0;
		Stack<Integer> temp = new Stack<>();
		while (!stack.isEmpty()) {
			temp.push(stack.pop());
		}
		if (!temp.isEmpty()) {
			first = temp.peek();
		}

		while (!temp.isEmpty()) {
			stack.push(temp.pop());
		}
		return first;
	}

	public boolean empty() {
		return stack.isEmpty();
	}

}
