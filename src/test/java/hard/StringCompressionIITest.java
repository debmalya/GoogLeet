package hard;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StringCompressionIITest {

    StringCompressionII stringCompressionII = new StringCompressionII();

    @Test
    void getLengthOfOptimalCompression() {
        assertEquals(4, stringCompressionII.getLengthOfOptimalCompression0("aaabcccd", 2));
        assertEquals(2, stringCompressionII.getLengthOfOptimalCompression0("aabbaa", 2));
        assertEquals(3, stringCompressionII.getLengthOfOptimalCompression0("aaaaaaaaaaa", 0));
    }

    @Test
    void getLengthOfOptimalCompressionActual() {
        assertEquals(0, stringCompressionII.getLengthOfOptimalCompression0("a", 1));
        assertEquals(3, stringCompressionII.getLengthOfOptimalCompression("abbbbbbbbbba", 2));
    }
}