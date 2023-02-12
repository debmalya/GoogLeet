package hackerrank.interview.prep;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CaesarCipherTest {

	CaesarCipher caseCipher = new CaesarCipher();

	@Test
	void testCaesarCipher() {
		assertEquals("defghijklmnopqrstuvwxyzabc", CaesarCipher.caesarCipher("abcdefghijklmnopqrstuvwxyz", 3));
		assertEquals("okffng-Qwvb", CaesarCipher.caesarCipher("middle-Outz",2));
	}

}
