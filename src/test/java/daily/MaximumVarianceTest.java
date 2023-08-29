package daily;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MaximumVarianceTest {

    MaximumVariance maximumVariance = new MaximumVariance();

    //    @Test
    void largestVariance() {
        assertEquals(3, maximumVariance.largestVariance("aababbb"));
        assertEquals(1, maximumVariance.largestVariance("ajoyjash"));
        assertEquals(2, maximumVariance.largestVariance("debmalyajash"));
        assertEquals(0, maximumVariance.largestVariance("abcde"));
    }
}