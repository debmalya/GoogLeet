package daily.medium;

import java.util.PriorityQueue;

public class SeatManager {
    /**
     * Design a system that manages the reservation state of n seats that are numbered from 1 to n.
     * <p>
     * Implement the SeatManager class:
     * <p>
     * SeatManager(int n) Initializes a SeatManager object that will manage n seats numbered from 1 to n.
     * All seats are initially available.
     * int reserve() Fetches the smallest-numbered unreserved seat, reserves it, and returns its number.
     * void unreserve(int seatNumber) Unreserves the seat with the given seatNumber.
     */

    private int last;
    private final PriorityQueue<Integer> pq;


    /**
     * Initializes a SeatManager object that will manage n seats numbered from 1 to n
     *
     * @param n number of seats.
     */
    public SeatManager(int n) {
        this.last = 0;
        this.pq = new PriorityQueue<>();
    }

    /**
     * Fetches the smallest-numbered unreserved seat.
     * Reserves it. and returns its number
     *
     * @return its number.
     */
    public int reserve() {
        if (pq.isEmpty()) {
            return ++last;
        } else {
            return pq.poll();
        }
    }

    public void unreserve(int seatNumber) {
        if (seatNumber == last) {
            --last;
        } else {
            pq.offer(seatNumber);
        }
    }
}
