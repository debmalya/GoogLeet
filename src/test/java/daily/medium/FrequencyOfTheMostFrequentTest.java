package daily.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FrequencyOfTheMostFrequentTest {
    FrequencyOfTheMostFrequent frequencyOfTheMostFrequent = new FrequencyOfTheMostFrequent();

    @Test
    void maxFrequency() {
        assertEquals(3, frequencyOfTheMostFrequent.maxFrequency(new int[]{1, 2, 4}, 5));
        assertEquals(2, frequencyOfTheMostFrequent.maxFrequency(new int[]{1, 4, 8, 13}, 5));
        assertEquals(1, frequencyOfTheMostFrequent.maxFrequency(new int[]{3, 9, 6}, 2));
    }

    @Test
    void maxFrequencyOwn() {
        assertEquals(5, frequencyOfTheMostFrequent.maxFrequency(new int[]{3, 3, 3, 4, 4}, 3));
        assertEquals(5, frequencyOfTheMostFrequent.maxFrequency(new int[]{1, 2, 4, 3, 3, 3}, 3));
    }
}