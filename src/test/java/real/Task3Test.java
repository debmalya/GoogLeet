package real;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Task3Test {

	Task3 task3 = new Task3();

	@Test
	void testSolution() {
		assertEquals(3, task3.solution(new int[] { 2, 1, 3 }, 2));
//		assertEquals(3, task3.solution(new int[] { 1, 2, 3 }, 2));
		assertEquals(0, task3.solution(new int[] { 2, 1, 4 }, 3));
		assertEquals(2, task3.solution(new int[] { 0,4,3,-1 }, 2));
		

	}

}
