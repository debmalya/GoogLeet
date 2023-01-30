package googleet.hard;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LFUCacheTest {

	LFUCache lfu;

	@Test
	void testLFUCache() {
		lfu = new LFUCache(2);
		lfu.put(1, 1);
		lfu.put(2, 2);
		assertEquals(1, lfu.get(1));
		lfu.put(3, 3);
		assertEquals(-1, lfu.get(2));
		assertEquals(3, lfu.get(3));
		lfu.put(4, 4);
		assertEquals(-1, lfu.get(1));
		assertEquals(3, lfu.get(3));
		assertEquals(4, lfu.get(4));
	}

	@Test
	void more() {
		lfu = new LFUCache(2);
		lfu.put(1, 1);
		lfu.put(2, 2);
		assertEquals(1, lfu.get(1));
		lfu.put(3, 3);
		assertEquals(-1, lfu.get(2));
		assertEquals(3, lfu.get(3));
		lfu.put(4, 4);
		assertEquals(-1, lfu.get(1));
		assertEquals(3, lfu.get(3));
		assertEquals(4, lfu.get(4));

		lfu.put(5, 5);
		assertEquals(-1, lfu.get(4));
	}

	@Test
	void sample5() {
		lfu = new LFUCache(0);
		lfu.put(0, 0);
		assertEquals(-1, lfu.get(0));
	}
	
	@Test
	void sample17() {
		lfu = new LFUCache(2);
		assertEquals(-1, lfu.get(2));
		lfu.put(2, 6);
		assertEquals(-1, lfu.get(1));
		lfu.put(1, 5);
		lfu.put(1, 2);
		assertEquals(2, lfu.get(1));
		assertEquals(6, lfu.get(2));		
	}
	
	@Test
	void sample18() {
		lfu = new LFUCache(2);
		lfu.put(2, 1);
		lfu.put(2, 2);
		assertEquals(2, lfu.get(2));
		
		lfu.put(1, 1);
		lfu.put(4, 1);
		assertEquals(2, lfu.get(2));
	}
}
