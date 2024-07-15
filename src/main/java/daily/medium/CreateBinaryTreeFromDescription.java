package daily.medium;

import btree.TreeNode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CreateBinaryTreeFromDescription {
  public TreeNode createBinaryTree(int[][] descriptions) {

    Map<Integer, TreeNode> nodeMap = new HashMap<>();
    List<Integer> orphaNodes = new ArrayList<>();
    for (int[] description : descriptions) {
      TreeNode parent = nodeMap.get(description[0]);
      if (parent == null) {
        parent = new TreeNode(description[0]);
        addToParentList(description, orphaNodes);
      }
      TreeNode child = removeChildNode(description, nodeMap, orphaNodes);
      if (description[2] == 1) {
        // left child
        if (child == null) {
          createChild(description, parent, nodeMap, true);
        } else {
          parent.left = child;
        }
      } else {
        if (child == null) {
          createChild(description, parent, nodeMap, false);
        } else {
          parent.right = child;
        }
      }
      nodeMap.put(description[0], parent);
    }

    return nodeMap.get(orphaNodes.getFirst());
  }

  private static void addToParentList(int[] description, List<Integer> orphaNodes) {
    if (!orphaNodes.contains(description[0])) {
      orphaNodes.add(description[0]);
    }
  }

  private static TreeNode removeChildNode(
      int[] description, Map<Integer, TreeNode> nodeMap, List<Integer> orphaNodes) {
    TreeNode child = nodeMap.get(description[1]);
    int position = orphaNodes.indexOf(description[1]);
    if (position > -1) {
      orphaNodes.remove(position);
    }
    return child;
  }

  private static void createChild(
      int[] description, TreeNode parent, Map<Integer, TreeNode> nodeMap, boolean isLeftChild) {
    if (isLeftChild) {
      parent.left = new TreeNode(description[1]);
      nodeMap.put(description[1], parent.left);
    } else {
      parent.right = new TreeNode(description[1]);
      nodeMap.put(description[1], parent.right);
    }
  }
}
