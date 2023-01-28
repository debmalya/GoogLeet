package googleet.hard;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SummaryRangesTest {

	SummaryRanges summaryRanges;

	@BeforeEach
	void setUp() {
		summaryRanges = new SummaryRanges();
	}

	@Test
	void testSummaryRanges() {
		assertNotNull(summaryRanges);
	}

	@Test
	void intervalFor1stEntry() {
		summaryRanges.addNum(1);
		int[][] intervals = summaryRanges.getIntervals();

		assertAll(() -> assertEquals(1, intervals.length), () -> assertEquals(1, intervals[0][0]),
				() -> assertEquals(1, intervals[0][1]));
	}

	@Test
	void intervalFor2ndEntry() {
		summaryRanges.addNum(1);
		int[][] intervals = summaryRanges.getIntervals();

		assertAll(() -> assertEquals(1, intervals.length), () -> assertEquals(1, intervals[0][0]),
				() -> assertEquals(1, intervals[0][1]));

		summaryRanges.addNum(3);
		int[][] interval2 = summaryRanges.getIntervals();
		assertAll(() -> assertEquals(2, interval2.length), () -> assertEquals(3, interval2[1][0]),
				() -> assertEquals(3, interval2[1][1]), () -> assertEquals(1, interval2[0][0]),
				() -> assertEquals(1, interval2[0][1]));

	}

	@Test
	void intervalFor3rdEntry() {
		summaryRanges.addNum(1);
		int[][] intervals = summaryRanges.getIntervals();

		assertAll(() -> assertEquals(1, intervals.length), () -> assertEquals(1, intervals[0][0]),
				() -> assertEquals(1, intervals[0][1]));

		summaryRanges.addNum(3);
		int[][] interval2 = summaryRanges.getIntervals();
		assertAll(() -> assertEquals(2, interval2.length), () -> assertEquals(3, interval2[1][0]),
				() -> assertEquals(3, interval2[1][1]), () -> assertEquals(1, interval2[0][0]),
				() -> assertEquals(1, interval2[0][1]));

		summaryRanges.addNum(7);
		int[][] interval3 = summaryRanges.getIntervals();
		assertAll(() -> assertEquals(3, interval3.length), () -> assertEquals(7, interval3[2][0]),
				() -> assertEquals(7, interval3[2][1]), () -> assertEquals(3, interval3[1][0]),
				() -> assertEquals(3, interval3[1][1]), () -> assertEquals(1, interval3[0][0]),
				() -> assertEquals(1, interval3[0][1]));

	}

	@Test
	void intervalFor4thEntry() {
		summaryRanges.addNum(1);
		int[][] intervals = summaryRanges.getIntervals();

		assertAll(() -> assertEquals(1, intervals.length), () -> assertEquals(1, intervals[0][0]),
				() -> assertEquals(1, intervals[0][1]));

		summaryRanges.addNum(3);
		int[][] interval2 = summaryRanges.getIntervals();
		assertAll(() -> assertEquals(2, interval2.length), () -> assertEquals(3, interval2[1][0]),
				() -> assertEquals(3, interval2[1][1]), () -> assertEquals(1, interval2[0][0]),
				() -> assertEquals(1, interval2[0][1]));

		summaryRanges.addNum(7);
		int[][] interval3 = summaryRanges.getIntervals();
		assertAll(() -> assertEquals(3, interval3.length), () -> assertEquals(7, interval3[2][0]),
				() -> assertEquals(7, interval3[2][1]), () -> assertEquals(3, interval3[1][0]),
				() -> assertEquals(3, interval3[1][1]), () -> assertEquals(1, interval3[0][0]),
				() -> assertEquals(1, interval3[0][1]));

		summaryRanges.addNum(2);
		int[][] interval4 = summaryRanges.getIntervals();
		assertAll(() -> assertEquals(2, interval4.length, "Expected length is not matching"),
				() -> assertEquals(1, interval4[0][0], "Expected first interval start value is not matching"),
				() -> assertEquals(3, interval4[0][1], "Expected first interval end value is not matching"),
				() -> assertEquals(7, interval4[1][0], "Expected second interval start value is not matching"),
				() -> assertEquals(7, interval4[1][1], "Expected second interval end value is not matching"));

		summaryRanges.addNum(6);
		int[][] interval5 = summaryRanges.getIntervals();
		assertAll(() -> assertEquals(2, interval5.length), () -> assertEquals(1, interval5[0][0]),
				() -> assertEquals(3, interval5[0][1]), () -> assertEquals(6, interval5[1][0]),
				() -> assertEquals(7, interval5[1][1]));
	}

	@Test
	void intervalForChangingRange() {
		summaryRanges.addNum(1);
		int[][] intervals = summaryRanges.getIntervals();

		assertAll(() -> assertEquals(1, intervals.length), () -> assertEquals(1, intervals[0][0]),
				() -> assertEquals(1, intervals[0][1]));

		summaryRanges.addNum(3);
		int[][] interval2 = summaryRanges.getIntervals();
		assertAll(() -> assertEquals(2, interval2.length), () -> assertEquals(3, interval2[1][0]),
				() -> assertEquals(3, interval2[1][1]), () -> assertEquals(1, interval2[0][0]),
				() -> assertEquals(1, interval2[0][1]));

		summaryRanges.addNum(2);
		int[][] interval3 = summaryRanges.getIntervals();
		assertAll(() -> assertEquals(1, interval3.length), () -> assertEquals(1, interval3[0][0]),
				() -> assertEquals(3, interval3[0][1]));

	}

	@Test
	void intervalForLowKeyEntry() {
		summaryRanges.addNum(2);
		int[][] intervals = summaryRanges.getIntervals();

		assertAll(() -> assertEquals(1, intervals.length), () -> assertEquals(2, intervals[0][0]),
				() -> assertEquals(2, intervals[0][1]));

		summaryRanges.addNum(1);
		int[][] interval2 = summaryRanges.getIntervals();
		assertAll(() -> assertEquals(1, interval2.length), () -> assertEquals(1, interval2[0][0]),
				() -> assertEquals(2, interval2[0][1]));

	}

	@Test
	void intervalForLowHighKeyEntry() {
		summaryRanges.addNum(2);
		int[][] intervals = summaryRanges.getIntervals();

		assertAll(() -> assertEquals(1, intervals.length), () -> assertEquals(2, intervals[0][0]),
				() -> assertEquals(2, intervals[0][1]));

		summaryRanges.addNum(1);
		int[][] interval2 = summaryRanges.getIntervals();
		assertAll(() -> assertEquals(1, interval2.length), () -> assertEquals(1, interval2[0][0]),
				() -> assertEquals(2, interval2[0][1]));

		summaryRanges.addNum(3);
		int[][] interval3 = summaryRanges.getIntervals();
		assertAll(() -> assertEquals(1, interval3.length), () -> assertEquals(1, interval3[0][0]),
				() -> assertEquals(3, interval3[0][1]));
	}

	@Test
	void sample4() {
		summaryRanges.addNum(1);
		int[][] interval1 = summaryRanges.getIntervals();
		assertAll(() -> assertEquals(1, interval1.length, "Expected length is not matching"),
				() -> assertEquals(1, interval1[0][0], "Expected first interval start value is not matching"),
				() -> assertEquals(1, interval1[0][1], "Expected first interval end value is not matching"));

		summaryRanges.addNum(9);
		int[][] interval2 = summaryRanges.getIntervals();
		assertAll(() -> assertEquals(2, interval2.length, "Expected length is not matching"),
				() -> assertEquals(1, interval2[0][0], "Expected first interval start value is not matching"),
				() -> assertEquals(1, interval2[0][1], "Expected first interval end value is not matching"),
				() -> assertEquals(9, interval2[1][0], "Expected second interval start value is not matching"),
				() -> assertEquals(9, interval2[1][1], "Expected second interval end value is not matching"));

		summaryRanges.addNum(2);
		int[][] interval3 = summaryRanges.getIntervals();
		assertAll(() -> assertEquals(2, interval3.length, "Expected length is not matching"),
				() -> assertEquals(1, interval3[0][0], "Expected first interval start value is not matching"),
				() -> assertEquals(2, interval3[0][1], "Expected first interval end value is not matching"),
				() -> assertEquals(9, interval3[1][0], "Expected second interval start value is not matching"),
				() -> assertEquals(9, interval3[1][1], "Expected second interval end value is not matching"));
	}

	@Test
	void sample5() {
		summaryRanges.addNum(6);
		int[][] interval1 = summaryRanges.getIntervals();
		assertAll(() -> assertEquals(1, interval1.length, "Expected length is not matching"),
				() -> assertEquals(6, interval1[0][0], "Expected first interval start value is not matching"),
				() -> assertEquals(6, interval1[0][1], "Expected first interval end value is not matching"));

		summaryRanges.addNum(6);
		int[][] interval2 = summaryRanges.getIntervals();
		assertAll(() -> assertEquals(1, interval2.length, "Expected length is not matching"),
				() -> assertEquals(6, interval2[0][0], "Expected first interval start value is not matching"),
				() -> assertEquals(6, interval2[0][1], "Expected first interval end value is not matching"));

		summaryRanges.addNum(0);
		int[][] interval3 = summaryRanges.getIntervals();
		assertAll(() -> assertEquals(2, interval3.length, "Expected length is not matching"),
				() -> assertEquals(0, interval3[0][0], "Expected first interval start value is not matching"),
				() -> assertEquals(0, interval3[0][1], "Expected first interval end value is not matching"),
				() -> assertEquals(6, interval3[1][0], "Expected second interval start value is not matching"),
				() -> assertEquals(6, interval3[1][1], "Expected second interval end value is not matching"));

		summaryRanges.addNum(4);
		int[][] interval4 = summaryRanges.getIntervals();
		assertAll(() -> assertEquals(3, interval4.length, "Expected length is not matching"),
				() -> assertEquals(0, interval4[0][0], "Expected first interval start value is not matching"),
				() -> assertEquals(0, interval4[0][1], "Expected first interval end value is not matching"),
				() -> assertEquals(4, interval4[1][0], "Expected second interval start value is not matching"),
				() -> assertEquals(4, interval4[1][1], "Expected second interval end value is not matching"),
				() -> assertEquals(6, interval4[2][0], "Expected third interval start value is not matching"),
				() -> assertEquals(6, interval4[2][1], "Expected third interval end value is not matching"));

		summaryRanges.addNum(8);
		int[][] interval5 = summaryRanges.getIntervals();
		assertAll(() -> assertEquals(4, interval5.length, "Expected length is not matching"),
				() -> assertEquals(0, interval5[0][0], "Expected first interval start value is not matching"),
				() -> assertEquals(0, interval5[0][1], "Expected first interval end value is not matching"),
				() -> assertEquals(4, interval5[1][0], "Expected second interval start value is not matching"),
				() -> assertEquals(4, interval5[1][1], "Expected second interval end value is not matching"),
				() -> assertEquals(6, interval5[2][0], "Expected third interval start value is not matching"),
				() -> assertEquals(6, interval5[2][1], "Expected third interval end value is not matching"),
				() -> assertEquals(8, interval5[3][0], "Expected third interval start value is not matching"),
				() -> assertEquals(8, interval5[3][1], "Expected third interval end value is not matching"));

		summaryRanges.addNum(7);
		int[][] interval6 = summaryRanges.getIntervals();
		assertAll(() -> assertEquals(3, interval6.length, "Expected length is not matching"),
				() -> assertEquals(0, interval6[0][0], "Expected first interval start value is not matching"),
				() -> assertEquals(0, interval6[0][1], "Expected first interval end value is not matching"),
				() -> assertEquals(4, interval6[1][0], "Expected second interval start value is not matching"),
				() -> assertEquals(4, interval6[1][1], "Expected second interval end value is not matching"),
				() -> assertEquals(6, interval6[2][0], "Expected third interval start value is not matching"),
				() -> assertEquals(8, interval6[2][1], "Expected third interval end value is not matching"));

		summaryRanges.addNum(5);
		int[][] interval7 = summaryRanges.getIntervals();
		assertAll(() -> assertEquals(2, interval7.length, "Expected length is not matching"),
				() -> assertEquals(0, interval7[0][0], "Expected first interval start value is not matching"),
				() -> assertEquals(0, interval7[0][1], "Expected first interval end value is not matching"),
				() -> assertEquals(4, interval7[1][0], "Expected second interval start value is not matching"),
				() -> assertEquals(8, interval7[1][1], "Expected second interval end value is not matching"));
	}

	@Test
	void codeCoverage1() {
		summaryRanges.addNum(9);
		int[][] interval1 = summaryRanges.getIntervals();
		assertAll(() -> assertEquals(1, interval1.length, "Expected length is not matching"),
				() -> assertEquals(9, interval1[0][0], "Expected first interval start value is not matching"),
				() -> assertEquals(9, interval1[0][1], "Expected first interval end value is not matching"));

		summaryRanges.addNum(1);
		int[][] interval2 = summaryRanges.getIntervals();
		assertAll(() -> assertEquals(2, interval2.length, "Expected length is not matching"),
				() -> assertEquals(1, interval2[0][0], "Expected first interval start value is not matching"),
				() -> assertEquals(1, interval2[0][1], "Expected first interval end value is not matching"),
				() -> assertEquals(9, interval2[1][0], "Expected second interval start value is not matching"),
				() -> assertEquals(9, interval2[1][1], "Expected second interval end value is not matching"));

		summaryRanges.addNum(8);
		int[][] interval3 = summaryRanges.getIntervals();
		assertAll(() -> assertEquals(2, interval3.length, "Expected length is not matching"),
				() -> assertEquals(1, interval3[0][0], "Expected first interval start value is not matching"),
				() -> assertEquals(1, interval3[0][1], "Expected first interval end value is not matching"),
				() -> assertEquals(8, interval3[1][0], "Expected second interval start value is not matching"),
				() -> assertEquals(9, interval3[1][1], "Expected second interval end value is not matching"));
	}

	@Test
	void sample6() {
		summaryRanges.addNum(6);
		int[][] interval1 = summaryRanges.getIntervals();
		assertAll(() -> assertEquals(1, interval1.length, "Expected length is not matching"),
				() -> assertEquals(6, interval1[0][0], "Expected first interval start value is not matching"),
				() -> assertEquals(6, interval1[0][1], "Expected first interval end value is not matching"));

		summaryRanges.addNum(6);
		int[][] interval2 = summaryRanges.getIntervals();
		assertAll(() -> assertEquals(1, interval2.length, "Expected length is not matching"),
				() -> assertEquals(6, interval2[0][0], "Expected first interval start value is not matching"),
				() -> assertEquals(6, interval2[0][1], "Expected first interval end value is not matching"));

		summaryRanges.addNum(0);
		int[][] interval3 = summaryRanges.getIntervals();
		assertAll(() -> assertEquals(2, interval3.length, "Expected length is not matching"),
				() -> assertEquals(0, interval3[0][0], "Expected first interval start value is not matching"),
				() -> assertEquals(0, interval3[0][1], "Expected first interval end value is not matching"),
				() -> assertEquals(6, interval3[1][0], "Expected second interval start value is not matching"),
				() -> assertEquals(6, interval3[1][1], "Expected second interval end value is not matching"));

		summaryRanges.addNum(4);
		int[][] interval4 = summaryRanges.getIntervals();
		assertAll(() -> assertEquals(3, interval4.length, "Expected length is not matching"),
				() -> assertEquals(0, interval4[0][0], "Expected first interval start value is not matching"),
				() -> assertEquals(0, interval4[0][1], "Expected first interval end value is not matching"),
				() -> assertEquals(4, interval4[1][0], "Expected second interval start value is not matching"),
				() -> assertEquals(4, interval4[1][1], "Expected second interval end value is not matching"),
				() -> assertEquals(6, interval4[2][0], "Expected third interval start value is not matching"),
				() -> assertEquals(6, interval4[2][1], "Expected third interval end value is not matching"));

		summaryRanges.addNum(8);
		int[][] interval5 = summaryRanges.getIntervals();
		assertAll(() -> assertEquals(4, interval5.length, "Expected length is not matching"),
				() -> assertEquals(0, interval5[0][0], "Expected first interval start value is not matching"),
				() -> assertEquals(0, interval5[0][1], "Expected first interval end value is not matching"),
				() -> assertEquals(4, interval5[1][0], "Expected second interval start value is not matching"),
				() -> assertEquals(4, interval5[1][1], "Expected second interval end value is not matching"),
				() -> assertEquals(6, interval5[2][0], "Expected third interval start value is not matching"),
				() -> assertEquals(6, interval5[2][1], "Expected third interval end value is not matching"),
				() -> assertEquals(8, interval5[3][0], "Expected fourth interval start value is not matching"),
				() -> assertEquals(8, interval5[3][1], "Expected fourth interval end value is not matching"));

		summaryRanges.addNum(7);
		int[][] interval6 = summaryRanges.getIntervals();
		assertAll(() -> assertEquals(3, interval6.length, "Expected length is not matching"),
				() -> assertEquals(0, interval6[0][0], "Expected first interval start value is not matching"),
				() -> assertEquals(0, interval6[0][1], "Expected first interval end value is not matching"),
				() -> assertEquals(4, interval6[1][0], "Expected second interval start value is not matching"),
				() -> assertEquals(4, interval6[1][1], "Expected second interval end value is not matching"),
				() -> assertEquals(6, interval6[2][0], "Expected third interval start value is not matching"),
				() -> assertEquals(8, interval6[2][1], "Expected third interval end value is not matching"));

		summaryRanges.addNum(6);
		int[][] interval7 = summaryRanges.getIntervals();
		assertAll(() -> assertEquals(3, interval7.length, "Expected length is not matching"),
				() -> assertEquals(0, interval7[0][0], "Expected first interval start value is not matching"),
				() -> assertEquals(0, interval7[0][1], "Expected first interval end value is not matching"),
				() -> assertEquals(4, interval7[1][0], "Expected second interval start value is not matching"),
				() -> assertEquals(4, interval7[1][1], "Expected second interval end value is not matching"),
				() -> assertEquals(6, interval7[2][0], "Expected third interval start value is not matching"),
				() -> assertEquals(8, interval7[2][1], "Expected third interval end value is not matching"));

		summaryRanges.addNum(4);
		int[][] interval8 = summaryRanges.getIntervals();
		assertAll(() -> assertEquals(3, interval8.length, "Expected length is not matching"),
				() -> assertEquals(0, interval8[0][0], "Expected first interval start value is not matching"),
				() -> assertEquals(0, interval8[0][1], "Expected first interval end value is not matching"),
				() -> assertEquals(4, interval8[1][0], "Expected second interval start value is not matching"),
				() -> assertEquals(4, interval8[1][1], "Expected second interval end value is not matching"),
				() -> assertEquals(6, interval8[2][0], "Expected third interval start value is not matching"),
				() -> assertEquals(8, interval8[2][1], "Expected third interval end value is not matching"));

		summaryRanges.addNum(7);
		int[][] interval9 = summaryRanges.getIntervals();
		assertAll(() -> assertEquals(3, interval9.length, "Expected length is not matching"),
				() -> assertEquals(0, interval9[0][0], "Expected first interval start value is not matching"),
				() -> assertEquals(0, interval9[0][1], "Expected first interval end value is not matching"),
				() -> assertEquals(4, interval9[1][0], "Expected second interval start value is not matching"),
				() -> assertEquals(4, interval9[1][1], "Expected second interval end value is not matching"),
				() -> assertEquals(6, interval9[2][0], "Expected third interval start value is not matching"),
				() -> assertEquals(8, interval9[2][1], "Expected third interval end value is not matching"));

		summaryRanges.addNum(5);
		int[][] interval10 = summaryRanges.getIntervals();
		assertAll(() -> assertEquals(2, interval10.length, "Expected length is not matching"),
				() -> assertEquals(0, interval10[0][0], "Expected first interval start value is not matching"),
				() -> assertEquals(0, interval10[0][1], "Expected first interval end value is not matching"),
				() -> assertEquals(4, interval10[1][0], "Expected second interval start value is not matching"),
				() -> assertEquals(8, interval10[1][1], "Expected second interval end value is not matching"));
	}

	@Test
	void codeCoverage2() {
		summaryRanges.addNum(9);
		int[][] interval1 = summaryRanges.getIntervals();
		assertAll(() -> assertEquals(1, interval1.length, "Expected length is not matching"),
				() -> assertEquals(9, interval1[0][0], "Expected first interval start value is not matching"),
				() -> assertEquals(9, interval1[0][1], "Expected first interval end value is not matching"));

		summaryRanges.addNum(8);
		int[][] interval3 = summaryRanges.getIntervals();
		assertAll(() -> assertEquals(1, interval3.length, "Expected length is not matching"),
				() -> assertEquals(8, interval3[0][0], "Expected first interval start value is not matching"),
				() -> assertEquals(9, interval3[0][1], "Expected first interval end value is not matching"));

		summaryRanges.addNum(8);
		int[][] interval2 = summaryRanges.getIntervals();
		assertAll(() -> assertEquals(1, interval2.length, "Expected length is not matching"),
				() -> assertEquals(8, interval2[0][0], "Expected first interval start value is not matching"),
				() -> assertEquals(9, interval2[0][1], "Expected first interval end value is not matching"));
	}

	@Test
	void codeCoverage3() {
		summaryRanges.addNum(3);
		int[][] interval1 = summaryRanges.getIntervals();
		assertAll(() -> assertEquals(1, interval1.length, "Expected length is not matching"),
				() -> assertEquals(3, interval1[0][0], "Expected first interval start value is not matching"),
				() -> assertEquals(3, interval1[0][1], "Expected first interval end value is not matching"));

		summaryRanges.addNum(4);
		int[][] interval3 = summaryRanges.getIntervals();
		assertAll(() -> assertEquals(1, interval3.length, "Expected length is not matching"),
				() -> assertEquals(3, interval3[0][0], "Expected first interval start value is not matching"),
				() -> assertEquals(4, interval3[0][1], "Expected first interval end value is not matching"));

		summaryRanges.addNum(5);
		int[][] interval2 = summaryRanges.getIntervals();
		assertAll(() -> assertEquals(1, interval2.length, "Expected length is not matching"),
				() -> assertEquals(3, interval2[0][0], "Expected first interval start value is not matching"),
				() -> assertEquals(5, interval2[0][1], "Expected first interval end value is not matching"));
	}
}
