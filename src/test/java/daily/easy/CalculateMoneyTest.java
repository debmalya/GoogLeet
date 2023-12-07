package daily.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculateMoneyTest {
    CalculateMoney calculateMoney = new CalculateMoney();

    @Test
    void totalMoney() {
        assertEquals(10, calculateMoney.totalMoney(4));
        assertEquals(37, calculateMoney.totalMoney(10));
        assertEquals(96, calculateMoney.totalMoney(20));


    }
}