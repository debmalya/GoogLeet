package daily;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;

class GasStationTest {
	GasStation gasStation = new GasStation();

	@Test
	void testCanCompleteCircuit() {
		assertSame(3, gasStation.canCompleteCircuit(new int[] { 1, 2, 3, 4, 5 }, new int[] { 3, 4, 5, 1, 2 }));
		assertSame(3, gasStation.canCompleteCircuit(new int[] { 1, 2, 3, 4, 5 }, new int[] { 3, 4, 5, 1, 2 }));
		assertSame(4, gasStation.canCompleteCircuit(new int[] { 5, 1, 2, 3, 4 }, new int[] { 4, 4, 1, 5, 1 }));
		assertSame(0, gasStation.canCompleteCircuit(new int[] { 2 }, new int[] { 2 }));
	}

	@Test
	void testGetFeasibleIndexes1() {
		List<Integer> actual = gasStation.getFeasibleIndexes(new int[] { 1, 2, 3, 4, 5 }, new int[] { 3, 4, 5, 1, 2 });
		assertAll(() -> assertEquals(2, actual.size()), () -> assertSame(3, actual.get(0)),
				() -> assertSame(4, actual.get(1)));
	}

	@Test
	void testGetFeasibleIndexes2() {
		List<Integer> actual = gasStation.getFeasibleIndexes(new int[] { 2, 3, 4 }, new int[] { 3, 4, 3 });
		assertAll(() -> assertEquals(1, actual.size()), () -> assertSame(2, actual.get(0)));
	}
	
	@Test
	void testGetFeasibleIndexes3() {
		List<Integer> actual = gasStation.getFeasibleIndexes(new int[] { 2 }, new int[] { 2 });
		assertAll(() -> assertEquals(1, actual.size()), () -> assertSame(0, actual.get(0)));
	}

	@Test
	void able2Complete() {
		assertTrue(gasStation.ableToComplete(new int[] { 1, 2, 3, 4, 5 }, new int[] { 3, 4, 5, 1, 2 }, 3));
		assertTrue(gasStation.ableToComplete(new int[] { 5, 1, 2, 3, 4 }, new int[] { 4, 4, 1, 5, 1 }, 4));
		assertFalse(gasStation.ableToComplete(new int[] { 2, 3, 4 }, new int[] { 3, 4, 3 }, 2));
	}

}
