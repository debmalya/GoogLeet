package googleet.linkedlist;

import java.util.Stack;

public class AddTwoNumbers {
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode result = new ListNode();
		Stack<Integer> firstStack = fillStack(l1);
		Stack<Integer> secondStack = fillStack(l2);
		Stack<Integer> sumStack = addTwoStack(firstStack, secondStack);
		ListNode current = result;
		while (!sumStack.isEmpty()) {
			current.val = sumStack.pop();
			if (!sumStack.isEmpty()) {
				current.next = new ListNode();
			}

			current = current.next;
		}
		return result;
	}

	private Stack<Integer> fillStack(ListNode l1) {
		Stack<Integer> stack = new Stack<>();
		while (l1 != null) {
			stack.push(l1.val);
			l1 = l1.next;
		}
		return stack;
	}

	private Stack<Integer> addTwoStack(Stack<Integer> first, Stack<Integer> second) {
		Stack<Integer> result = new Stack<>();

		int totalSum = 0;
		int currentSum = 0;
		int count = 0;
		int carry = 0;
		while (!first.isEmpty() || !second.isEmpty()) {

			if (!first.isEmpty()) {
				currentSum += first.pop();
			}
			if (!second.isEmpty()) {
				currentSum += second.pop();
			}
			carry = currentSum / 10;
			currentSum %= 10;
			result.push(currentSum);
			totalSum = currentSum * (int) Math.pow(10, count) + totalSum;
			System.out.println("currentSum = " + currentSum);
			currentSum = carry;
		}
		System.out.println("final total sum = " + result);
		Stack<Integer> finalResult = new Stack<>();
		while (!result.isEmpty()) {
			finalResult.push(result.pop());
		}

		return finalResult;

	}
}
