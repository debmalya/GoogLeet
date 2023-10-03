package daily.medium;

public class RemoveColoredPiecesIfBothNeighborsAreTheSameColor {

    public static final String AAA = "AAA";
    public static final String BBB = "BBB";

    public int count = 0;

    /**
     * There are n pieces arranged in a line, and each piece is colored either by 'A' or by 'B'.
     * You are given a string colors of length n where colors[i] is the color of the ith piece.
     * <p>
     * Alice and Bob are playing a game where they take alternating turns removing pieces from the line.
     * In this game, Alice moves first.
     * <p>
     * Alice is only allowed to remove a piece colored 'A' if both its neighbors are also colored 'A'.
     * She is not allowed to remove pieces that are colored 'B'.
     * <p>
     * Bob is only allowed to remove a piece colored 'B' if both its neighbors are also colored 'B'.
     * He is not allowed to remove pieces that are colored 'A'.
     * <p>
     * Alice and Bob cannot remove pieces from the edge of the line.
     * <p>
     * If a player cannot make a move on their turn, that player loses and the other player wins.
     * Assuming Alice and Bob play optimally,
     *
     * @param colors a string colors either by 'A' or by 'B'.
     * @return true if Alice wins, or return false if Bob wins.
     */
    public boolean winnerOfGame(String colors) {
        int alice_plays = 0, bob_plays = 0, count = 0;

        for (int i = 1; i < colors.length(); i++) {
            if (colors.charAt(i) == colors.charAt(i - 1)) {
                count++;
            } else {
                if (colors.charAt(i - 1) == 'A') {
                    alice_plays += Math.max(0, count - 1);
                } else {
                    bob_plays += Math.max(0, count - 1);
                }
                count = 0;
            }
        }

        if (colors.charAt(colors.length() - 1) == 'A') {
            alice_plays += Math.max(0, count - 1);
        } else {
            bob_plays += Math.max(0, count - 1);
        }

        return alice_plays > bob_plays;
    }

    public boolean winnerOfGame2(String colors) {
        if (count % 2 == 0) {
            count++;
            if (colors.contains(AAA)) {
                return winnerOfGame2(colors.replaceFirst(AAA, "AA"));
            }
            count = 0;
            return false;
        } else {
            count++;
            if (colors.contains(BBB)) {
                return winnerOfGame2(colors.replaceFirst(BBB, "BB"));
            }
            count = 0;
            return true;
        }
    }

    public boolean winnerOfGame1(String colors) {

        int aCount = 0;
        while (colors.contains(AAA)) {
            colors = colors.replace(AAA, "AA");
            aCount++;
        }
        if (aCount == 0) {
            return false;
        }

        int bCount = 0;
        while (colors.contains(BBB)) {
            colors = colors.replace(BBB, "BB");
            bCount++;
        }
        return aCount > bCount;
    }

    public boolean winnerOfGame0(String colors) {
        int count = 0;

        while (true) {
            if (count % 2 == 0) {
                if (colors.contains(AAA)) {
                    int position = colors.indexOf(AAA);
                    colors = colors.substring(0, position) + "AA" + colors.substring(position + 3);
                } else {
                    return false;
                }
            } else if (count % 2 == 1) {
                if (colors.contains(BBB)) {
                    int position = colors.indexOf(BBB);
                    colors = colors.substring(0, position) + "BB" + colors.substring(position + 3);
                } else {
                    return true;
                }

            }

            count++;
        }
    }


}
