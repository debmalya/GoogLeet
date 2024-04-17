package daily.medium;

import btree.TreeNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class SmallestStringStartingFromLeaf {
    List<String> stringList = new ArrayList<>();

    public String smallestFromLeaf(TreeNode root) {

        readLeaves(root, "");

        if (!stringList.isEmpty()) {
            Collections.sort(stringList);
            return stringList.getFirst();
        }
        return "";
    }

    private void readLeaves(TreeNode root, String string) {
        if (root != null) {
            char c = (char) (root.val + 'a');
            if (root.left == null && root.right == null) {
                string = string + c;
                StringBuilder sb = new StringBuilder(string);
                stringList.add(sb.reverse().toString());
            } else {
                readLeaves(root.left, string + c);
                readLeaves(root.right, string + c);
            }
        }
    }
}
