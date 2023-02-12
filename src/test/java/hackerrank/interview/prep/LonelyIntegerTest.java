package hackerrank.interview.prep;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

class LonelyIntegerTest {



	@Test
	void testLonelyinteger() {
		Integer[] array = new Integer[]{1, 2, 3, 4};
		List<Integer> list = Arrays.asList(array);
		assertEquals(4,LonelyInteger.lonelyinteger(list));
	}

}
