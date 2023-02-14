package daily;

public class CountOddNumbers {

	public int countOdds(int low, int high) {

		int range = high - low;
		int count = range / 2;
		if (low % 2 == 1) {
			return count + 1;
		} else if (high % 2 == 1) {
			return count + 1;
		}
		return count;
	}

}
