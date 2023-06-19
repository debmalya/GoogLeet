package googleet.hard;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ArraytilTest {

    Arraytil arraytil = new Arraytil();

    @Test
    void makeArrayIncreasing() {
        assertEquals(1, arraytil.makeArrayIncreasing(new int[]{1, 5, 3, 6, 7}, new int[]{1, 3, 2, 4}));
        assertEquals(-1, arraytil.makeArrayIncreasing(new int[]{1, 5, 3, 6, 7}, new int[]{1, 6, 3, 3}));
        assertEquals(2, arraytil.makeArrayIncreasing(new int[]{1, 5, 3, 6, 7}, new int[]{4, 3, 1}));

    }
}