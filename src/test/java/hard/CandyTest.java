package hard;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CandyTest {

    Candy candy = new Candy();

    @Test
    void candy() {
        assertEquals(5, candy.candy(new int[]{1, 0, 2}));
        assertEquals(4, candy.candy(new int[]{1, 2, 2}));
    }

    @Test
    void candy0() {
        assertEquals(5, candy.candy0(new int[]{1, 0, 2}));
        assertEquals(4, candy.candy0(new int[]{1, 2, 2}));
    }

}