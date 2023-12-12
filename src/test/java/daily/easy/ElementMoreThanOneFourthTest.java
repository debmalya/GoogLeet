package daily.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ElementMoreThanOneFourthTest {
    ElementMoreThanOneFourth elementMoreThanOneFourth = new ElementMoreThanOneFourth();

    @Test
    void findSpecialInteger0() {
        assertEquals(6, elementMoreThanOneFourth.findSpecialInteger0(new int[]{1, 2, 2, 6, 6, 6, 6, 7, 10}));
        assertEquals(1, elementMoreThanOneFourth.findSpecialInteger0(new int[]{1, 1}));
        assertEquals(6, elementMoreThanOneFourth.findSpecialInteger0(new int[]{1, 2, 2, 2, 6, 6, 6, 6, 6, 6, 7, 10}));
        assertEquals(3, elementMoreThanOneFourth.findSpecialInteger0(new int[]{1, 1, 2, 2, 3, 3, 3, 4}));
    }

    void findSpecialInteger() {
        assertEquals(6, elementMoreThanOneFourth.findSpecialInteger(new int[]{1, 2, 2, 6, 6, 6, 6, 7, 10}));
        assertEquals(1, elementMoreThanOneFourth.findSpecialInteger(new int[]{1, 1}));
        assertEquals(6, elementMoreThanOneFourth.findSpecialInteger(new int[]{1, 2, 2, 2, 6, 6, 6, 6, 6, 6, 7, 10}));
        assertEquals(3, elementMoreThanOneFourth.findSpecialInteger(new int[]{1, 1, 2, 2, 3, 3, 3, 4}));
    }
}