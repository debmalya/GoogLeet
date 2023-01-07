package daily;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DeleteColumnsToMakeSortedTest {

	DeleteColumnsToMakeSorted deleteColumnsToMakeSorted = new DeleteColumnsToMakeSorted();

	@Test
	void check1() {
		assertEquals(1, deleteColumnsToMakeSorted.minDeletionSize(new String[] { "cba", "daf", "ghi" }));
	}

	@Test
	void check2() {
		assertEquals(0, deleteColumnsToMakeSorted.minDeletionSize(new String[] { "a", "b" }));
	}

	@Test
	void check3() {
		assertEquals(3, deleteColumnsToMakeSorted.minDeletionSize(new String[] { "zyx", "wvu", "tsr" }));
	}

	@Test
	void check4() {

		assertEquals(2, deleteColumnsToMakeSorted.minDeletionSize(new String[] { "rrjk", "furt", "guzm" }));
	}

}
