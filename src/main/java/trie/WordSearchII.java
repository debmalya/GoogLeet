package trie;

import java.util.ArrayList;
import java.util.List;

public class WordSearchII {

	/**
	 * Given an m x n board of characters and a list of strings words, return all
	 * words on the board.
	 * 
	 * Each word must be constructed from letters of sequentially adjacent cells,
	 * where adjacent cells are horizontally or vertically neighboring. The same
	 * letter cell may not be used more than once in a word.
	 * 
	 * Example: Input: board =
	 * [["o","a","a","n"],["e","t","a","e"],["i","h","k","r"],["i","f","l","v"]],
	 * words = ["oath","pea","eat","rain"] Output: ["eat","oath"]
	 * 
	 * 
	 * Input: board = [["a","b"],["c","d"]], words = ["abcb"] Output: []
	 * 
	 * @param board of characters.
	 * @param words list of words.
	 * @return all words on the board.
	 */
	 private static final char HASH_TAG = '#';
	    private Tree root = new Tree();
	    
	    public List<String> findWords(char[][] board, String[] words) {
	        for (String word : words) {
	            Tree temp = root;
	            // Test case 60/63 
	            for (int i = word.length() - 1; i >= 0; i--) {
	                int idx = word.charAt(i) - 'a';
	                if (temp.val[idx] == null) {
	                    temp.val[idx] = new Tree();
	                    temp.val[idx].parent = temp;
	                    temp.val[idx].idx = idx;
	                }
	                temp = temp.val[idx];
	            }
	            temp.word = word;
	        }    
	        return searchWord(board);
	    }
	    
	    private List<String> searchWord(char[][] board) {
	        List<String> res = new ArrayList<>();
	        
	        for (int i = 0; i < board.length; i++)
	            for (int j = 0; j < board[0].length; j++) {
	                Tree temp = root;
	                checkWord(res, i, j, board, temp);
	            }
	        
	        return res;
	    }
	    
	    private void checkWord(List<String> res, int y, int x, char[][] board, Tree temp) {
	        
	        if (x >= board[0].length || x < 0
	            || y >= board.length || y < 0)
	            return;
	        
	        char ch = board[y][x];
	        if (ch== HASH_TAG || temp.val[ch - 'a'] == null)
	            return;
	        
	        temp = temp.val[ch - 'a'];
	        
	        if (temp.word != null) {
	            res.add(temp.word);
	            temp.word = null; // Test case 17/63: When there is more than one answer
	            Tree ptr = temp;
	            while (ptr.parent != null 
	                    && ptr.isEmpty()) {
	                int idx = ptr.idx;
	                ptr = ptr.parent;
	                ptr.val[idx] = null;
	            }
	        }
	        
	        board[y][x] = HASH_TAG;

	        checkWord(res, y, x + 1, board, temp);
	        checkWord(res, y, x - 1, board, temp);
	        checkWord(res, y + 1, x, board, temp);
	        checkWord(res, y - 1, x, board, temp);
	        
	        board[y][x] = ch;
	    }
	    
	    class Tree {
	        Tree parent;
	        Tree[] val = new Tree[26];
	        String word;
	        int idx;

	        public boolean isEmpty() {
	            for (int i = 0; i < 26; i++) 
	                if (val[i] != null)
	                    return false;

	            return true;
	        }
	    }
	
	public List<String> findWords0(char[][] board, String[] words) {
		List<String> wordList = new ArrayList<>();
		TrieNode root = new TrieNode();

		for (String each : words) {
			addWord(each, root);
		}
		return wordList;
	}

	public void addWord(String each, TrieNode root) {
		if (each == null || root == null) {
			return;
		}
		TrieNode current = new TrieNode();
		for (int i = 0; i < each.length(); i++) {
			char c = each.charAt(i);
			if (i == 0) {
				current = root.searchCharacter(c);
				if (current == null) {
					current = root.addChildren(c);

				}
			} else {

				if (current.searchCharacter(c) == null) {
					current = current.addChildren(c);
				}
			}

		}

	}

}
