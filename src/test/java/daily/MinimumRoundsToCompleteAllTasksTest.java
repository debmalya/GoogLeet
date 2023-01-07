package daily;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MinimumRoundsToCompleteAllTasksTest {
	MinimumRoundsToCompleteAllTasks minimumRoundsToCompleteAllTasks = new MinimumRoundsToCompleteAllTasks();

	@Test
	void testMinimumRounds() {
		assertEquals(4, minimumRoundsToCompleteAllTasks.minimumRounds(new int[] { 2, 2, 3, 3, 2, 4, 4, 4, 4, 4 }));
		assertEquals(2, minimumRoundsToCompleteAllTasks.minimumRounds(new int[] { 5, 5, 5, 5 }));
		assertEquals(2, minimumRoundsToCompleteAllTasks.minimumRounds(new int[] { 7, 7, 7, 7, 7, 7 }));
	}

	@Test
	void testMinimumRoundsImpossible() {
		assertEquals(-1, minimumRoundsToCompleteAllTasks.minimumRounds(new int[] { 2, 3, 3 }));
	}
}
