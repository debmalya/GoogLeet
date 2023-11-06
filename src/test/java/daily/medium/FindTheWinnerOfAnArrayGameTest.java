package daily.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FindTheWinnerOfAnArrayGameTest {
    FindTheWinnerOfAnArrayGame findTheWinnerOfAnArrayGame = new FindTheWinnerOfAnArrayGame();

    @Test
    void getWinner() {
        assertEquals(5, findTheWinnerOfAnArrayGame.getWinner(new int[]{2, 1, 3, 5, 4, 6, 7}, 2));
        assertEquals(3, findTheWinnerOfAnArrayGame.getWinner(new int[]{3, 2, 1}, 10));
    }

    @Test
    void getWinnerRealTestCase() {
        assertEquals(99, findTheWinnerOfAnArrayGame.getWinner(new int[]{1, 11, 22, 33, 44, 55, 66, 77, 88, 99}, 1000000000));
    }

    @Test
    void getWinner0() {
        assertEquals(5, findTheWinnerOfAnArrayGame.getWinner0(new int[]{2, 1, 3, 5, 4, 6, 7}, 2));
        assertEquals(3, findTheWinnerOfAnArrayGame.getWinner0(new int[]{3, 2, 1}, 10));
    }

    @Test
    void getWinnerRealTestCase0() {
        assertEquals(99, findTheWinnerOfAnArrayGame.getWinner0(new int[]{1, 11, 22, 33, 44, 55, 66, 77, 88, 99}, 1000000000));
    }
}