package daily.medium;

import btree.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class FindLargestValueInEachRow {

    public List<Integer> largestValues(TreeNode root) {
        if (root == null) return new ArrayList<>();

        List<Integer> result = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            int curr_level_size = queue.size();
            int max_val = Integer.MIN_VALUE;

            for (int i = 0; i < curr_level_size; i++) {
                TreeNode node = queue.poll();
                max_val = Math.max(max_val, node.val);

                if (node.left != null) queue.offer(node.left);
                if (node.right != null) queue.offer(node.right);
            }

            result.add(max_val);
        }

        return result;
    }

    public List<Integer> largestValues0(TreeNode root) {
        List<Integer> max = new ArrayList<>();
        Queue<TreeNode> breadthFirstTraversal = new LinkedList<>();
        if (root != null) {
            breadthFirstTraversal.offer(root);
            Queue<TreeNode> eachLayer = new LinkedList<>();
            while (true) {
                int maxPerRow = Integer.MIN_VALUE;
                while (!breadthFirstTraversal.isEmpty()) {
                    TreeNode eachNode = breadthFirstTraversal.poll();
                    if (eachNode != null) {

                        if (eachNode.val > maxPerRow) {
                            maxPerRow = eachNode.val;
                        }
                        if (eachNode.left != null) {
                            eachLayer.offer(eachNode.left);
                        }
                        if (eachNode.right != null) {
                            eachLayer.offer(eachNode.right);
                        }
                    }
                }
                max.add(maxPerRow);

                if (!eachLayer.isEmpty()) {
                    while (!eachLayer.isEmpty()) {
                        breadthFirstTraversal.offer(eachLayer.poll());
                    }
                } else {
                    break;
                }


            }
        }
        return max;
    }
}
