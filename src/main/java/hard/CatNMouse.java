package hard;

public class CatNMouse {
    /**
     * A game on an undirected graph is played by two players, Mouse and Cat, who alternate turns.
     * <p>
     * The graph is given as follows: graph[a] is a list of all nodes b such that ab is an edge of the graph.
     * <p>
     * The mouse starts at node 1 and goes first, the cat starts at node 2 and goes second, and there is a hole at node 0.
     * <p>
     * During each player's turn, they must travel along one edge of the graph that meets where they are.  For example, if the Mouse is at node 1, it must travel to any node in graph[1].
     * <p>
     * Additionally, it is not allowed for the Cat to travel to the Hole (node 0).
     * <p>
     * Then, the game can end in three ways:
     * <p>
     * If ever the Cat occupies the same node as the Mouse, the Cat wins.
     * If ever the Mouse reaches the Hole, the Mouse wins.
     * If ever a position is repeated (i.e., the players are in the same position as a previous turn, and it is the same player's turn to move), the game is a draw.
     * Given a graph, and assuming both players play optimally, return
     * <p>
     * 1 if the mouse wins the game,
     * 2 if the cat wins the game, or
     * 0 if the game is a draw.
     *
     * @param graph
     * @return
     * @reference : https://leetcode.com/problems/cat-and-mouse/description/
     */
    public int catMouseGame(int[][] graph) {
        return 0;
    }
}
