package daily.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BagOfTokenTest {

    BagOfToken bagOfToken = new BagOfToken();

    @Test
    void bagOfTokensScore() {
        assertEquals(0, bagOfToken.bagOfTokensScore(new int[]{100}, 50));
    }
}