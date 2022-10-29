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
		int lastFruit = -1;
		int secondLastFruit = -1;
		int lastFruitCount = 0;

		for (Integer fruit : fruits) {
			if (fruit == lastFruit || fruit == secondLastFruit) {
				currentMax++;
			} else {
				currentMax = lastFruitCount + 1;
			}

			if (fruit == lastFruit) {
				lastFruitCount += 1;
			} else {
				lastFruitCount = 1;
			}

			if (fruit != lastFruit) {
				secondLastFruit = lastFruit;
				lastFruit = fruit;
			}
			max = Math.max(max, currentMax);
		}
		return max;
	}

}
