package daily.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ReverseWordsInAStringIIITest {

    ReverseWordsInAStringIII reverseWordsInAStringIII = new ReverseWordsInAStringIII();

    @Test
    void reverseWords() {
        assertEquals("s'teL ekat edoCteeL tsetnoc", reverseWordsInAStringIII.reverseWords("Let's take LeetCode contest"));
        assertEquals("doG gniD", reverseWordsInAStringIII.reverseWords("God Ding"));
    }
}