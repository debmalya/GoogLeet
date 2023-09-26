package daily.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FindTheDifferenceTest {

    FindTheDifference findTheDifference = new FindTheDifference();

    @Test
    void findTheDifferenceExample0() {
        assertEquals('e', findTheDifference.findTheDifference0("abcd", "abcde"));
        assertEquals('y', findTheDifference.findTheDifference0("", "y"));
    }

    @Test
    void findTheDifferenceExample() {
        assertEquals('e', findTheDifference.findTheDifference("abcd", "abcde"));
        assertEquals('y', findTheDifference.findTheDifference("", "y"));
    }

    @Test
    void findTheDifferenceTestCase() {
        assertEquals('a', findTheDifference.findTheDifference("a", "aa"));
    }

    @Test
    void findTheDifferenceTestCase0() {
        assertEquals('a', findTheDifference.findTheDifference0("a", "aa"));
    }

    @Test
    void findTheDifferenceOweCase0() {
        assertEquals('z', findTheDifference.findTheDifference0("abcdefghijklmonopqrstuvwxyz",
                "abcdefghijklmonopqrstuvwxyzz"));
    }

    @Test
    void findTheDifferenceOweCase() {
        assertEquals('z', findTheDifference.findTheDifference("abcdefghijklmonopqrstuvwxyz",
                "abcdefghijklmonopqrstuvwxyzz"));
    }
}