package daily.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FindWordsTest {
    FindWords findWords = new FindWords();

    @Test
    void countCharacters() {
        assertEquals(6, findWords.countCharacters(new String[]{"cat", "bt", "hat", "tree"}, "atach"));
        assertEquals(10, findWords.countCharacters(new String[]{"hello", "world", "leetcode"}, "welldonehoneyr"));
    }
}