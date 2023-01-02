package interview.backtracking;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

class NQueensTest {

	NQueens nQueens = new NQueens();

	@Test
	void testSolution() {
		int[][] answer = nQueens.solution(4);
		assertAll(() -> assertEquals(2, answer.length));
	}

	@Test
	void handleQueenPlacement01() {
		boolean[][] chessBoard = new boolean[4][4];
		nQueens.handleQueenPlacing(chessBoard, 0, 1);
		printChessBoard(chessBoard);
		assertAll(() -> assertArrayEquals(new boolean[] { true, true, true, true }, chessBoard[0]),
				() -> assertArrayEquals(new boolean[] { true, true, true, false }, chessBoard[1]),
				() -> assertArrayEquals(new boolean[] { false, true, false, true }, chessBoard[2]),
				() -> assertArrayEquals(new boolean[] { false, true, false, false }, chessBoard[3]));

	}

	@Test
	void handleQueenPlacement00() {
		boolean[][] chessBoard = new boolean[4][4];
		nQueens.handleQueenPlacing(chessBoard, 0, 0);
		assertAll(() -> assertArrayEquals(new boolean[] { true, true, true, true }, chessBoard[0]),
				() -> assertArrayEquals(new boolean[] { true, true, false, false }, chessBoard[1]),
				() -> assertArrayEquals(new boolean[] { true, false, true, false }, chessBoard[2]),
				() -> assertArrayEquals(new boolean[] { true, false, false, true }, chessBoard[3]));
	}

	@Test
	void handleQueenPlacement03() {
		boolean[][] chessBoard = new boolean[4][4];
		nQueens.handleQueenPlacing(chessBoard, 0, 2);

		assertAll(() -> assertArrayEquals(new boolean[] { true, true, true, true }, chessBoard[0]),
				() -> assertArrayEquals(new boolean[] { false, true, true, true }, chessBoard[1]),
				() -> assertArrayEquals(new boolean[] { true, false, true, false }, chessBoard[2]),
				() -> assertArrayEquals(new boolean[] { false, false, true, false }, chessBoard[3]));
	}

	private void printChessBoard(boolean[][] chessBoard) {
		for (int i = 0; i < chessBoard.length; i++) {
			System.out.println(Arrays.toString(chessBoard[i]));
		}
	}

}
