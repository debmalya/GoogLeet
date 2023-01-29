package googleet.hard;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SummaryRangesSolutionTest {
	
	SummaryRangesSolution summaryRangesSolution;
	
	@BeforeEach
	void setUp() {
		summaryRangesSolution = new SummaryRangesSolution();
	}

	@Test
	void intervalFor4thEntry() {
		summaryRangesSolution.addNum(1);
		int[][] intervals = summaryRangesSolution.getIntervals();

		assertAll(() -> assertEquals(1, intervals.length), () -> assertEquals(1, intervals[0][0]),
				() -> assertEquals(1, intervals[0][1]));

		summaryRangesSolution.addNum(3);
		int[][] interval2 = summaryRangesSolution.getIntervals();
		assertAll(() -> assertEquals(2, interval2.length), () -> assertEquals(3, interval2[1][0]),
				() -> assertEquals(3, interval2[1][1]), () -> assertEquals(1, interval2[0][0]),
				() -> assertEquals(1, interval2[0][1]));

		summaryRangesSolution.addNum(7);
		int[][] interval3 = summaryRangesSolution.getIntervals();
		assertAll(() -> assertEquals(3, interval3.length), () -> assertEquals(7, interval3[2][0]),
				() -> assertEquals(7, interval3[2][1]), () -> assertEquals(3, interval3[1][0]),
				() -> assertEquals(3, interval3[1][1]), () -> assertEquals(1, interval3[0][0]),
				() -> assertEquals(1, interval3[0][1]));

		summaryRangesSolution.addNum(2);
		int[][] interval4 = summaryRangesSolution.getIntervals();
		assertAll(() -> assertEquals(2, interval4.length, "Expected length is not matching"),
				() -> assertEquals(1, interval4[0][0], "Expected first interval start value is not matching"),
				() -> assertEquals(3, interval4[0][1], "Expected first interval end value is not matching"),
				() -> assertEquals(7, interval4[1][0], "Expected second interval start value is not matching"),
				() -> assertEquals(7, interval4[1][1], "Expected second interval end value is not matching"));

		summaryRangesSolution.addNum(6);
		int[][] interval5 = summaryRangesSolution.getIntervals();
		assertAll(() -> assertEquals(2, interval5.length), () -> assertEquals(1, interval5[0][0]),
				() -> assertEquals(3, interval5[0][1]), () -> assertEquals(6, interval5[1][0]),
				() -> assertEquals(7, interval5[1][1]));
	}

}
