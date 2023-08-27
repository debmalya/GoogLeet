package daily;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MaximumLengthOfPairChainTest {

    MaximumLengthOfPairChain maximumLengthOfPairChain = new MaximumLengthOfPairChain();

    @Test
    void findLongestChain() {
        assertEquals(3, maximumLengthOfPairChain.findLongestChain(new int[][]{{1, 2}, {4, 5}, {7, 8}}));
        assertEquals(3, maximumLengthOfPairChain.findLongestChain(new int[][]{{1, 2}, {7, 8}, {4, 5}}));
        assertEquals(2, maximumLengthOfPairChain.findLongestChain(new int[][]{{1, 2}, {2, 3}, {3, 4}}));
    }
}