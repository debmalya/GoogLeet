package hackerrank.interview.prep;

import java.util.Arrays;
import java.util.Scanner;

public class ZigZagSequence {

	public static void main(String[] args) throws java.lang.Exception {
		try (Scanner kb = new Scanner(System.in)) {
			//		The first line contains t the number of test cases. 
					int test_cases = kb.nextInt();
					for (int cs = 1; cs <= test_cases; cs++) {
			//			The first line of each test case contains an integer n. Denoting the number of array elements.
						int n = kb.nextInt();
						int a[] = new int[n];
			//			The next line of the test case contains n elements of array a.
						for (int i = 0; i < n; i++) {
							a[i] = kb.nextInt();
						}
						findZigZagSequence(a, n);
					}
		}
	}

	/**
	 * Transform the array into a zig zag sequence by permuting the array elements.
	 * A sequence will be called a zig zag sequence if the first k elements in the
	 * sequence are in increasing order and the last k elements are in decreasing
	 * order, where k = (n + 1)/2.
	 * 
	 * Find the lexicographically smallest zig zag sequence of the given array.
	 * 
	 * Example.
	 * 
	 * a=[2,3,5,1,4]
	 * 
	 * Now if we permute the array as [1,4,5,3,2] the result is a zig zag sequence.
	 * 
	 * @param a - Given an array of n distinct integers.
	 * @param n
	 */
	public static int[] findZigZagSequence(int[] a, int n) {
		Arrays.sort(a);
		int mid = (n ) / 2;
		int temp = a[mid];
		a[mid] = a[n - 1];
		a[n - 1] = temp;

		int st = mid + 1;
		int ed = n - 2;
		while (st <= ed) {
			temp = a[st];
			a[st] = a[ed];
			a[ed] = temp;
			st = st + 1;
			ed = ed - 1;
		}
		for (int i = 0; i < n; i++) {
			if (i > 0)
				System.out.print(" ");
			System.out.print(a[i]);
		}
		System.out.println();
		return a;
	}

}
