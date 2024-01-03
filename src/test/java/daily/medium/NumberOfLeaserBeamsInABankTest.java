package daily.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NumberOfLeaserBeamsInABankTest {

    NumberOfLeaserBeamsInABank numberOfLeaserBeamsInABank = new NumberOfLeaserBeamsInABank();

    @Test
    void numberOfBeams() {
        assertEquals(8, numberOfLeaserBeamsInABank.numberOfBeams(new String[]{"011001", "000000", "010100", "001000"}));
    }
}