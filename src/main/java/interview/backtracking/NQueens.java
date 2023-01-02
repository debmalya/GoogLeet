package interview.backtracking;

import java.util.ArrayList;
import java.util.List;

public class NQueens {
	/**
	 * 
	 * @param n
	 * @return
	 */
	public int[][] solution(int n) {
		List<List<Integer>> seqs = new ArrayList<>();
		nQueens(1, n, null, seqs);
		return seqs.stream().map(u -> u.stream().mapToInt(i -> i).toArray()).toArray(int[][]::new);
	}

	void nQueens(int k, int n, List<Integer> seq, List<List<Integer>> seqs) {
		for (int i = 1; i <= n; i++) {
			if (!canPlace(k, i, seq))
				continue;

			List<Integer> newSeq = (seq == null) ? new ArrayList<>() : new ArrayList<>(seq); // new or copy
			newSeq.add(i);

			if (k == n) { // last column reached? -> placing done
				seqs.add(newSeq); // record the placing sequence
			} else {
				nQueens(k + 1, n, newSeq, seqs); // place the next queen
			}
		}
	}

	boolean canPlace(int k, int i, List<Integer> seq) {
		if (seq == null)
			return true; // nothing has been placed yet -> always possible

		for (int j = 1; j < k; j++) {
			int r = seq.get(j - 1); // row number
			if (r == i || Math.abs(r - i) == Math.abs(j - k))
				return false;
		}

		return true;
	}

	public void handleQueenPlacing(boolean[][] chessBoard, int row, int column) {
		int boardSize = chessBoard.length;

		for (int i = 0; i < boardSize; i++) {
			// vertically cannot place any queen
			chessBoard[(row + i) % boardSize][column] = true;
			// horizontally cannot place any queen
			chessBoard[row][(column + i) % boardSize] = true;
			// diagonally cannot place any queen
			if (row + i < boardSize && column + i < boardSize) {
				chessBoard[(row + i) % boardSize][(column + i) % boardSize] = true;
			}
			if (row + i < boardSize && column - i > -1) {
				chessBoard[(row + i) % boardSize][column - i] = true;
			}
			if (row - i > -1 && column - i > -1) {
				chessBoard[row - i][column - i] = true;
			}
			if (row - i > -1 && column + i < boardSize) {
				chessBoard[row - i][column - i] = true;
			}
		}

	}
}
