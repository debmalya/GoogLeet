package codility;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ProperStringTest {
	
	ProperString properString = new ProperString();

	@Test
	void one() {
		assertEquals(1,properString.solution("{[()()]}"));
		assertEquals(1,properString.solution(""));
		assertEquals(1,properString.solution("()[]"));
	}

	@Test
	void zero() {
		assertEquals(0,properString.solution("([)()]"));
		assertEquals(0,properString.solution(")()]"));
		
	}

}
