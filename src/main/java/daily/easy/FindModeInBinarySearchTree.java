package daily.easy;

import btree.TreeNode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class FindModeInBinarySearchTree {
    /**
     * Given the root of a binary search tree (BST) with duplicates,
     * .
     * <p>
     * If the tree has more than one mode, return them in any order.
     * <p>
     * Assume a BST is defined as follows:
     * <p>
     * The left subtree of a node contains only nodes with keys less than or equal to the node's key.
     * The right subtree of a node contains only nodes with keys greater than or equal to the node's key.
     * Both the left and right subtrees must also be binary search trees.
     *
     * @param root of a binary search tree
     * @return return all the mode(s) (i.e., the most frequently occurred element) in it
     */
    public int[] findMode(TreeNode root) {
        List<Integer> numList = new ArrayList<>();
        inorderTraversal(root, numList);
        if (!numList.isEmpty()) {
            List<Integer> maxList = new ArrayList<>();
            int prev = numList.get(0);
            int maxCount = 1;
            int currentCount = 1;
            maxList.add(prev);
            for (int index = 1; index < numList.size(); index++) {
                int num = numList.get(index);
                if (prev == num) {
                    currentCount++;
                } else {
                    currentCount = 1;
                }
                if (currentCount > maxCount) {
                    maxList.clear();
                    maxList.add(num);
                    maxCount = currentCount;
                } else if (currentCount == maxCount) {
                    if (!maxList.contains(num)) {
                        maxList.add(num);
                    }
                }
                prev = num;
            }
            return maxList.stream().mapToInt(i -> i).toArray();
        }
        return new int[0];
    }

    private void inorderTraversal(TreeNode root, List<Integer> numList) {
        if (root != null) {
            inorderTraversal(root.left, numList);
            numList.add(root.val);
            inorderTraversal(root.right, numList);
        }
    }

    public int[] findMode0(TreeNode root) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        AtomicInteger maxCount = new AtomicInteger(Integer.MIN_VALUE);
        List<Integer> maxValues = new ArrayList<>();

        readNodes(root, frequencyMap);

        frequencyMap.forEach((num, count) -> {
            if (count > maxCount.get()) {
                maxValues.clear();
                maxValues.add(num);
                maxCount.set(count);
            } else if (count == maxCount.get()) {
                maxValues.add(num);
            }
        });
        return maxValues.stream().mapToInt(i -> i).toArray();
    }

    private void readNodes(TreeNode root, Map<Integer, Integer> frequencyMap) {
        if (root != null) {

            frequencyMap.putIfAbsent(root.val, 0);
            var count = frequencyMap.get(root.val);
            frequencyMap.put(root.val, ++count);

            readNodes(root.left, frequencyMap);
            readNodes(root.right, frequencyMap);
        }
    }
}
