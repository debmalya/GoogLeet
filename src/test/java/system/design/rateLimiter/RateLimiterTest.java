package system.design.rateLimiter;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RateLimiterTest {

	@Test
	void testShouldAllow() {
		RateLimiter rateLimiter = new RateLimiter(3, 5);
		assertTrue(rateLimiter.shouldAllow(1));
		assertTrue(rateLimiter.shouldAllow(1));
		assertTrue(rateLimiter.shouldAllow(2));
		assertFalse(rateLimiter.shouldAllow(3));
		assertTrue(rateLimiter.shouldAllow(8));
	}

	@Test
	void example2() {
		RateLimiter rateLimiter = new RateLimiter(16, 12);
		assertTrue(rateLimiter.shouldAllow(38));
		assertTrue(rateLimiter.shouldAllow(42));
		assertTrue(rateLimiter.shouldAllow(48));
		for (int i = 0; i < 16; i++) {
			if (i < 14) {
				assertTrue(rateLimiter.shouldAllow(50), String.format("Expected true but found false for index %d", i));
			} else {
				assertFalse(rateLimiter.shouldAllow(50),
						String.format("Expected false but found false for index %d", i));
			}
		}

	}

}
