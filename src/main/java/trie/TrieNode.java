package trie;

import java.util.ArrayList;
import java.util.List;

public class TrieNode {

	private char val;

	public void setVal(char val) {
		this.val = val;
	}

	private List<TrieNode> children;

	public TrieNode addChildren(char c) {
		if (children == null) {
			children = new ArrayList<>();
		}
		TrieNode child = new TrieNode();
		child.val = c;
		children.add(child);
		return child;
	}

	public char getVal() {
		return val;
	}

	public List<TrieNode> getChildren() {
		return children;
	}

	public TrieNode searchCharacter(char c) {
		TrieNode trieNode = null;
		if (children != null) {
			for (int i = 0; i < children.size(); i++) {
				if (children.get(i).val == c) {
					return children.get(i);
				}
			}
		}
		return trieNode;
	}

}
