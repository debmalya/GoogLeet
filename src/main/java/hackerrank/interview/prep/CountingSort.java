package hackerrank.interview.prep;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CountingSort {

	/*
	 * Complete the 'countingSort' function below.
	 *
	 * The function is expected to return an INTEGER_ARRAY. The function accepts
	 * INTEGER_ARRAY arr as parameter.
	 */

	public static List<Integer> countingSort(List<Integer> arr) {
		// Write your code here

		List<Integer> frequenceList = new ArrayList<>(100);

		for (int i = 0; i < 100; i++) {
			frequenceList.add(0);
		}

		for (int i = 0; i < arr.size(); i++) {
			int index = arr.get(i);
			frequenceList.set(index, frequenceList.get(index) + 1);
		}
		return frequenceList;
	}

}
