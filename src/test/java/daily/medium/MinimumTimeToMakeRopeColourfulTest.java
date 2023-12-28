package daily.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MinimumTimeToMakeRopeColourfulTest {

    MinimumTimeToMakeRopeColourful minimumTimeToMakeRopeColourful = new MinimumTimeToMakeRopeColourful();

    @Test
    void minCost() {
        assertEquals(3, minimumTimeToMakeRopeColourful.minCost0("abaac", new int[]{1, 2, 3, 4, 5}));
        assertEquals(0, minimumTimeToMakeRopeColourful.minCost0("abc", new int[]{1, 2, 3}));
        assertEquals(2, minimumTimeToMakeRopeColourful.minCost0("aabaa", new int[]{1, 2, 3, 4, 1}));
    }

    @Test
    void ownCost() {
        assertEquals(3, minimumTimeToMakeRopeColourful.minCost0("aaabaa", new int[]{1, 2, 1, 3, 4, 1}));
        assertEquals(3, minimumTimeToMakeRopeColourful.minCost0("aaabaa", new int[]{1, 1, 1, 3, 4, 1}));
        assertEquals(3, minimumTimeToMakeRopeColourful.minCost0("aaabaa", new int[]{2, 1, 1, 3, 4, 1}));
        assertEquals(4, minimumTimeToMakeRopeColourful.minCost0("aaabaa", new int[]{1, 3, 2, 3, 4, 1}));
    }

    @Test
    void actual() {
        assertEquals(3, minimumTimeToMakeRopeColourful.minCost1("abaac", new int[]{1, 2, 3, 4, 5}));
        assertEquals(0, minimumTimeToMakeRopeColourful.minCost1("abc", new int[]{1, 2, 3}));
        assertEquals(2, minimumTimeToMakeRopeColourful.minCost1("aabaa", new int[]{1, 2, 3, 4, 1}));
        assertEquals(3, minimumTimeToMakeRopeColourful.minCost1("aaabaa", new int[]{1, 2, 1, 3, 4, 1}));
        assertEquals(3, minimumTimeToMakeRopeColourful.minCost1("aaabaa", new int[]{1, 1, 1, 3, 4, 1}));
        assertEquals(3, minimumTimeToMakeRopeColourful.minCost1("aaabaa", new int[]{2, 1, 1, 3, 4, 1}));
        assertEquals(4, minimumTimeToMakeRopeColourful.minCost1("aaabaa", new int[]{1, 3, 2, 3, 4, 1}));
        assertEquals(26, minimumTimeToMakeRopeColourful.minCost1("aaabbbabbbb", new int[]{3, 5, 10, 7, 5, 3, 5, 5, 4, 8, 1}));
    }

    @Test
    void better() {
        assertEquals(3, minimumTimeToMakeRopeColourful.minCost("abaac", new int[]{1, 2, 3, 4, 5}));
        assertEquals(0, minimumTimeToMakeRopeColourful.minCost("abc", new int[]{1, 2, 3}));
        assertEquals(2, minimumTimeToMakeRopeColourful.minCost("aabaa", new int[]{1, 2, 3, 4, 1}));
        assertEquals(3, minimumTimeToMakeRopeColourful.minCost("aaabaa", new int[]{1, 2, 1, 3, 4, 1}));
        assertEquals(3, minimumTimeToMakeRopeColourful.minCost("aaabaa", new int[]{1, 1, 1, 3, 4, 1}));
        assertEquals(3, minimumTimeToMakeRopeColourful.minCost("aaabaa", new int[]{2, 1, 1, 3, 4, 1}));
        assertEquals(4, minimumTimeToMakeRopeColourful.minCost("aaabaa", new int[]{1, 3, 2, 3, 4, 1}));
        assertEquals(26, minimumTimeToMakeRopeColourful.minCost("aaabbbabbbb", new int[]{3, 5, 10, 7, 5, 3, 5, 5, 4, 8, 1}));
    }
}