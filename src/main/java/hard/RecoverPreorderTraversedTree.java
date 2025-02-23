package hard;

import btree.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class RecoverPreorderTraversedTree {
  /**
   * We run a preorder depth-first search (DFS) on the root of a binary tree.
   *
   * <p>At each node in this traversal, we output D dashes (where D is the depth of this node), then
   * we output the value of this node. If the depth of a node is D, the depth of its immediate child
   * is D + 1. The depth of the root node is 0.
   *
   * <p>If a node has only one child, that child is guaranteed to be the left child.
   *
   * <p>Given the output traversal of this traversal, recover the tree and return its root.
   *
   * @param traversal
   * @return
   */
  int currentNodeIndex = 0;
    public TreeNode recoverFromPreorder(String traversal) {
        List<int[]> nodeDepthPairs = new ArrayList<>();
        int i = 0;
        int len = traversal.length();
        while(i < len){
            int depth = 0;
            while(traversal.charAt(i) == '-'){
                depth++;
                i++;
            }
            int nodeVal = 0;
            while(i < len && traversal.charAt(i) != '-'){
                nodeVal *= 10;
                nodeVal += traversal.charAt(i) - 48;
                i++;
            }
            nodeDepthPairs.add(new int[]{nodeVal,depth});
        }
        return buildSubtree(nodeDepthPairs,0);
    }

    public TreeNode buildSubtree(List<int[]> nodeDepthPairs, int depth){
        if(currentNodeIndex >= nodeDepthPairs.size() || nodeDepthPairs.get(currentNodeIndex)[1] < depth)
            return null;
        TreeNode curr = new TreeNode(nodeDepthPairs.get(currentNodeIndex)[0]);
        currentNodeIndex++;
        curr.left = buildSubtree(nodeDepthPairs,depth+1);
        curr.right = buildSubtree(nodeDepthPairs,depth+1);
        return curr;
    }
}
