package daily.medium;

import java.util.*;

public class MinimumHeightTree {
    /**
     * A tree is an undirected graph in which any two vertices are connected by exactly one path.
     * In other words, any connected graph without simple cycles is a tree.
     * <p>
     * Given a tree of n nodes labelled from 0 to n - 1, and an array of n - 1 edges
     * where edges[i] = [ai, bi] indicates that there is an undirected edge between the two nodes ai and bi in the tree,
     * you can choose any node of the tree as the root. When you select a node x as the root,
     * the result tree has height h. Among all possible rooted trees, those with minimum height (i.e. min(h))
     * are called minimum height trees (MHTs).
     * <p>
     * Return a list of all MHTs' root labels. You can return the answer in any order.
     * <p>
     * The height of a rooted tree is the number of edges on the longest downward path between the root and a leaf.
     *
     * @param n
     * @param edges
     * @return
     */
    public List<Integer> findMinHeightTrees(int n, int[][] edges) {
        // if edges is Empty, return [0]
        List<Integer> list = new ArrayList<>();
        if (edges.length == 0) {
            list.add(0);
            return list;
        }

        // calculate the indegree of every node
        int[] indegree = new int[n];
        // save adjacent nodes of certain node into a HashMap
        HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();
        for (int i = 0; i < n; i++)
            map.put(i, new ArrayList<>());
        for (int i = 0; i < edges.length; i++) {
            // for undirected graph, every edge has two directions, therefore...
            indegree[edges[i][0]]++;
            indegree[edges[i][1]]++;
            map.get(edges[i][0]).add(edges[i][1]);
            map.get(edges[i][1]).add(edges[i][0]);
        }

        // if indegree of a node is 1, it means that the node only has one adjacent node
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < n; i++)
            if (indegree[i] == 1)
                q.offer(i);

        // count the number of nodes which has been watached
        int count = 0;
        while (!q.isEmpty()) {
            int size = q.size();
            count += size;
            for (int i = 0; i < size; i++) {
                Integer id = q.poll();
                indegree[id]--;
                // if count == n, add the id of node into the resulting list
                if (count == n)
                    list.add(id);
                for (Integer adjId : map.get(id)) {
                    // if indegree of a node equals to 0, it means this node has already been added
                    // into the reulsting list
                    if (indegree[adjId] != 0) {
                        indegree[adjId]--;
                        if (indegree[adjId] == 1)
                            q.offer(adjId);
                    }
                }
            }
        }
        return list;
    }
}
