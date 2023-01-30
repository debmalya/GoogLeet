package daily;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TribonacciTest {

	Tribonacci tribonacci;

	@BeforeEach
	void setUp() {
		tribonacci = new Tribonacci();
	}

	@Test
	void testTribonacci() {
		assertEquals(2, tribonacci.tribonacci(3));
		assertEquals(4, tribonacci.tribonacci(4));
	}

	@Test
	void sample() {
		assertEquals(615693474, tribonacci.tribonacci(35));
	}
	
	@Test
	void sample1() {
		assertEquals(1389537, tribonacci.tribonacci(25));
	}
}
