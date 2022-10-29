package googleet.process;

public class FruitIntoBaskets {

	/**
	 * Trees are represented by an integer array. Different types of fruit each tree
	 * produces. Fruits can be collected by following rules.
	 * 
	 * RULES
	 * 
	 * You only have two baskets. Each basket you can take only one type of fruit.
	 * There is no limit on number of fruits.
	 * 
	 * Starting from any tree you can pick only one fruit from a tree.
	 * 
	 * Once you reach a tree with fruit that cannot fit in your baskets, you must
	 * stop.
	 * 
	 * @param fruits - integer array
	 * @return maximum number of fruits can pick.
	 */

	public int totalFruit(int[] fruits) {
		int max = 0;
		int currentMax = 0;
		int changeCount = 0;
		int changed = 0;
		int last = fruits[fruits.length - 1];
		for (int i = fruits.length - 1; i > -1; i--) {
			if (fruits[i] != last) {
				if (changeCount == 0) {
					changeCount++;
					currentMax++;
					changed = fruits[i];
					while (--i > -1 && (fruits[i] == last || fruits[i] == changed)) {
						currentMax++;
					}
				}
				max = Math.max(max, currentMax);
				currentMax = 0;
			} else {
				last = fruits[i];
				currentMax++;
			}
		}
		return Math.max(max, currentMax);
	}

}
