package real;

import java.util.SortedSet;
import java.util.TreeSet;

public class Task3 {
	public int solution(int[] A, int S) {
		// Implement your solution here
		int no = 0;
		int startI = 0;
		int endI = 0;
		int sum = 0;

		SortedSet<Integer> n = new TreeSet<>();
		for (int i = 0; i < A.length; i++) {
			sum += A[i];
			endI = i + 1;
			int avg = sum / (endI - startI);
			if (avg == S) {
				no++;
			} else if (avg > S) {
				startI++;
				sum -= A[startI];
			}
			n.add(A[i]);
			no += lowerClass(A, n, i, S);

		}

		if (no > 1000000000) {
			return 1000000000;
		}
		return no;
	}

	private int lowerClass(int[] A, SortedSet<Integer> n, int i, int S) {
		SortedSet<Integer> head = n.headSet(A[i]);
		int count = 0;
		if (!head.isEmpty()) {
			Integer[] lowers = n.headSet(A[i]).toArray(new Integer[0]);
			int index = 0;
			int subSum = A[i];
			int subCount = 1;

			while (index < lowers.length - 1) {
				subSum += lowers[index];
				subCount++;
				int avg = subSum / subCount;
				if (avg == S) {
					count++;
				} else if (avg > S) {
					subSum = A[i];
					subCount = 1;
				}
				index++;
			}
		}
		return count;
	}

}
