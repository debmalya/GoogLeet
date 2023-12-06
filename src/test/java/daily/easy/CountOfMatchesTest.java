package daily.easy;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CountOfMatchesTest {
    CountOfMatches countOfMatches = new CountOfMatches();

    @Test
    void numberOfMatches() {
        for (int i = 1; i < 201; i++) {
            assertEquals(i - 1, countOfMatches.numberOfMatches(i));
        }
    }
}