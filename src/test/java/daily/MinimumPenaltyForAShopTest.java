package daily;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MinimumPenaltyForAShopTest {

    MinimumPenaltyForAShop minimumPenaltyForAShop = new MinimumPenaltyForAShop();

    @Test
    void bestClosingTime() {
        assertEquals(2, minimumPenaltyForAShop.bestClosingTime("YYNY"));
        assertEquals(0, minimumPenaltyForAShop.bestClosingTime("NNNN"));
        assertEquals(4, minimumPenaltyForAShop.bestClosingTime("YYYY"));
        assertEquals(3, minimumPenaltyForAShop.bestClosingTime("YYYN"));
        assertEquals(1, minimumPenaltyForAShop.bestClosingTime("YNNY"));
        assertEquals(4, minimumPenaltyForAShop.bestClosingTime("NYYY"));
        assertEquals(4, minimumPenaltyForAShop.bestClosingTime("YNYY"));
    }
}