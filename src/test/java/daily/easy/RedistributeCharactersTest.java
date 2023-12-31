package daily.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class RedistributeCharactersTest {
    RedistributeCharacters redistributeCharacters = new RedistributeCharacters();

    @Test
    void makeEqual() {
        assertTrue(redistributeCharacters.makeEqual(new String[]{"abc", "aabc", "bc"}));
    }
}