package daily;

public class MaximumBagsWithFullCapacityOfRocks {
	public int maximumBags(int[] capacity, int[] rocks, int additionalRocks) {
		int max = 0;

		// can distribute additionalRocks?
		int index = 0;
		while (additionalRocks > 0 && index < rocks.length) {
			if (additionalRocks >= capacity[index] - rocks[index]) {
				additionalRocks -= (capacity[index] - rocks[index]);
				rocks[index] = capacity[index];
			} else {
				rocks[index] += additionalRocks;
				additionalRocks = 0;
			}
//			System.out.println("Additonal rocks " + additionalRocks);
			index++;
		}
//		System.out.println(Arrays.toString(rocks));
		// check how many bags has maxium capacity
		for (int i = 0; i < capacity.length; i++) {
			if (rocks[i] == capacity[i]) {
				max++;
			}
		}
		return max;
	}
}
