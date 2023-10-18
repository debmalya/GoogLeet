package daily.medium;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class ValidateBinaryTreeNodes {
    /**
     * You have n binary tree nodes numbered from 0 to n - 1 where node i has two children leftChild[i] and rightChild[i],
     * return true if and only if all the given nodes form exactly one valid binary tree.
     *
     * @param n          - number of nodes in the binary tree.
     * @param leftChild  left children of the binary tree.
     * @param rightChild right children of the binary tree.
     * @return if and only if all the given nodes form exactly one valid binary tree.
     */
    public boolean validateBinaryTreeNodes(int n, int[] leftChild, int[] rightChild) {
        int[] indegree = new int[n];
        for (int i = 0; i < n; i++) {
            if (leftChild[i] != -1) indegree[leftChild[i]]++;
            if (rightChild[i] != -1) indegree[rightChild[i]]++;
        }
        int root = -1;
        for (int i = 0; i < n; i++) {
            if (indegree[i] == 0) {
                if (root == -1) root = i;
                else return false;
            }
        }
        if (root == -1) return false;
        boolean[] visited = new boolean[n];
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            int node = queue.poll();
            if (visited[node]) return false;
            visited[node] = true;
            if (leftChild[node] != -1) queue.offer(leftChild[node]);
            if (rightChild[node] != -1) queue.offer(rightChild[node]);
        }
        int trueCount = 0;
        for (boolean b : visited) {
            if (b) trueCount++;
        }
        return trueCount == n;
    }

    public boolean validateBinaryTreeNodes0(int n, int[] leftChild, int[] rightChild) {
        boolean isValid = true;
        Set<Integer> unique = new HashSet<>(n);
        for (int i = 0; i < n; i++) {
            if (leftChild[i] != -1 && rightChild[i] != -1) {
                if (leftChild[i] > rightChild[i]) {
                    isValid = false;
                    break;
                }
            }

            if (leftChild[i] != -1) {
                isValid = isLessThanAnyExistingElement(leftChild[i], isValid, unique);
                if (!unique.add(leftChild[i])) {
                    isValid = false;
                }
            }

            if (rightChild[i] != -1) {
                isValid = isLessThanAnyExistingElement(rightChild[i], isValid, unique);
                if (!unique.add(rightChild[i])) {
                    isValid = false;
                }
            }


            if (!isValid) {
                break;
            }


        }
        return isValid;
    }

    private static boolean isLessThanAnyExistingElement(int currentElement, boolean isValid, Set<Integer> unique) {
        var arr = unique.toArray(new Integer[0]);
        for (Integer integer : arr) {
            if (currentElement < integer) {
                isValid = false;
                break;
            }
        }
        return isValid;
    }
}
