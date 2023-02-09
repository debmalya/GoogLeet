package googleeet.medium;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class JumpGameIITest {
	JumpGameII jumpGame2 = new JumpGameII();

	@Test
	void testJump() {
		assertEquals(2, jumpGame2.jump(new int[] { 2, 3, 1, 1, 4 }));
	}

}
