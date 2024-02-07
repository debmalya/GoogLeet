package daily.medium;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

class GroupAnagramsTest {

    GroupAnagrams groupAnagrams = new GroupAnagrams();

    @Test
    void groupAnagrams() {
        var anagram = groupAnagrams.groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"});
        assertEquals(3, anagram.size());
    }
}