package daily.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LongestStringChainTest {

    LongestStringChain longestStringChain = new LongestStringChain();

    @Test
    void longestStrChain() {
        assertEquals(4, longestStringChain.longestStrChain(new String[]{"a", "b", "ba", "bca", "bda", "bdca"}));
        assertEquals(5, longestStringChain.longestStrChain(new String[]{"xbc", "pcxbcf", "xb", "cxbc", "pcxbc"}));
    }
}