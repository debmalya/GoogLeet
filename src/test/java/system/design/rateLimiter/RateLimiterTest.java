package system.design.rateLimiter;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RateLimiterTest {

	@Test
	void testShouldAllow() {
		RateLimiter rateLimiter = new RateLimiter(3, 5);
	}

}
