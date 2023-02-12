package hackerrank.interview.prep;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.IntStream;

public class TowerBreakers {

	/**
	 * Two players are playing a game of Tower Breakers! Player 1 always moves
	 * first, and both players always play optimally.The rules of the game are as
	 * follows:
	 * 
	 * Initially
	 *  1. There are n towers. 
	 *  2. Each tower is of height m. 
	 *  3. The players
	 * move in alternating turns. In each turn, a player can choose a tower of
	 * height y and reduce its height to 1 <= y < x , where and y evenly divides x.
	 *  4. If the current player is unable to make a move, they lose the game.
	 * 
	 * 
	 * @param n
	 * @param m
	 * @return
	 */
	public static int towerBreakers(int n, int m) {

		return 0;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		int t = Integer.parseInt(bufferedReader.readLine().trim());

		IntStream.range(0, t).forEach(tItr -> {
			try {
				String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

				int n = Integer.parseInt(firstMultipleInput[0]);

				int m = Integer.parseInt(firstMultipleInput[1]);

				int result = TowerBreakers.towerBreakers(n, m);

				bufferedWriter.write(String.valueOf(result));
				bufferedWriter.newLine();
			} catch (IOException ex) {
				throw new RuntimeException(ex);
			}
		});

		bufferedReader.close();
		bufferedWriter.close();
	}

}
