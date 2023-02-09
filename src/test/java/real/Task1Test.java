package real;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Task1Test {

	Task1 task1 = new Task1();

	@Test
	void testSolution() {
		assertEquals(33, task1.solution(new String[] { "test1a", "test2", "test1b", "test1c", "test3" },
				new String[] { "Wrong answer", "OK", "Runtime error", "OK", "Time limit exceeded"}));
	}

	@Test
	void groupTest() {
		assertEquals(1, task1.getGroup("test1a"));
		assertEquals(1, task1.getGroup("test1b"));
		assertEquals(1, task1.getGroup("test1c"));
		assertEquals(2, task1.getGroup("test2"));
	}

}
