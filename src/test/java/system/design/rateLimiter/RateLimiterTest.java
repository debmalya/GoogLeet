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
		assertTrue(rateLimiter.shouldAllow(1));
		assertTrue(rateLimiter.shouldAllow(2));
		assertTrue(rateLimiter.shouldAllow(3));
		assertTrue(rateLimiter.shouldAllow(8));
	}

}
