package real;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;

class ValidParanthesisTest {
	ValidParanthesis validParanthesis = new ValidParanthesis();

	@Test
	void testRemoveOuterParentheses() {
		assertEquals("()()()", validParanthesis.removeOuterParentheses("(()())(())"));
		assertEquals("()()()()(())", validParanthesis.removeOuterParentheses("(()())(())(()(()))"));
	}

	@Test
	void primitiveDecomposition() {
		List<String> actual = validParanthesis.primitiveDecomposition("(()())(())");
		assertAll(() -> assertEquals(2, actual.size()), () -> assertEquals("()()", actual.get(0)),
				() -> assertEquals("()", actual.get(1)));

	}

	@Test
	void decompose() {
		List<String> actual = validParanthesis.primitiveDecomposition("(()())(())(()(()))");
		System.out.println(actual);
		assertAll(() -> assertEquals(3, actual.size()), () -> assertEquals("()()", actual.get(0)),
				() -> assertEquals("()", actual.get(1)), () -> assertEquals("()(())", actual.get(2)));
	}

}
