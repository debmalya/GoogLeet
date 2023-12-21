package daily.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BuyTwoChocolatesTest {

    BuyTwoChocolates buyTwoChocolates = new BuyTwoChocolates();

    @Test
    void buyChoco() {
        assertEquals(0, buyTwoChocolates.buyChoco(new int[]{1, 2, 2}, 3));
        assertEquals(3, buyTwoChocolates.buyChoco(new int[]{3, 2, 3}, 3));
    }
}