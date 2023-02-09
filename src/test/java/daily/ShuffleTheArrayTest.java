package daily;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

class ShuffleTheArrayTest {

	ShuffleTheArray shuffleTheArray = new ShuffleTheArray();

	@Test
	void testShuffle() {
		int[] actual = shuffleTheArray.shuffle(new int[] { 1, 2, 3, 4, 4, 3, 2, 1 }, 4);
		int[] expected = new int[] { 1, 4, 2, 3, 3, 2, 4, 1 };
		
		assertArrayEquals(expected, actual);
		
		actual = shuffleTheArray.shuffle(new int[] { 1, 2, 3, 4, 4, 3, 2, 1 }, 4);
		expected = new int[] { 1, 4, 2, 3, 3, 2, 4, 1 };
		assertArrayEquals(expected, actual);
	}

}
