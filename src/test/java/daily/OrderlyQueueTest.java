package daily;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class OrderlyQueueTest {
	OrderlyQueue orderlyQueue = new OrderlyQueue();

	@Test
	void testOrderlyQueue() {
		assertEquals("acb", orderlyQueue.orderlyQueue("cba", 1));
		assertEquals("aaabc", orderlyQueue.orderlyQueue("baaca", 3));
	}

}
