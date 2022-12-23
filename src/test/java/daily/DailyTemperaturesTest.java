package daily;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

class DailyTemperaturesTest {
	DailyTemperatures dailyTemperatures = new DailyTemperatures();

	@Test
	void testDailyTemperatures() {
		int[] temperatures = new int[] { 73, 74, 75, 71, 69, 72, 76, 73 };
		int[] expected = new int[] { 1, 1, 4, 2, 1, 1, 0, 0 };
		int[] actual = dailyTemperatures.dailyTemperatures(temperatures);
		System.out.println("Expected : "+ Arrays.toString(expected)+" actual :" + Arrays.toString(actual));
		assertArrayEquals(expected, actual);
	}

}
