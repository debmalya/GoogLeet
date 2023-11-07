package daily.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SeatManagerTest {

    @Test
    void reserve() {
        SeatManager seatManager = new SeatManager(5);
        assertEquals(1, seatManager.reserve());
        assertEquals(2, seatManager.reserve());
        seatManager.unreserve(2);
        assertEquals(2, seatManager.reserve());
        assertEquals(3, seatManager.reserve());
        assertEquals(4, seatManager.reserve());
        assertEquals(5, seatManager.reserve());
        assertEquals(6, seatManager.reserve());
    }


    @Test
    void reserveMore() {
        SeatManager seatManager = new SeatManager(4);
        assertEquals(1, seatManager.reserve());
        seatManager.unreserve(1);
        assertEquals(1, seatManager.reserve());
        assertEquals(2, seatManager.reserve());
        assertEquals(3, seatManager.reserve());
        seatManager.unreserve(2);
        assertEquals(2, seatManager.reserve());
        seatManager.unreserve(1);
        seatManager.unreserve(2);
    }
}