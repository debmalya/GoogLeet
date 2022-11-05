package trie;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class WordSearchIITest {

	WordSearchII wordSearchII = new WordSearchII();

	@Test
	void testFindWords() {
		char[][] board = new char[][] { { 'o', 'a', 'a', 'n' }, { 'e', 't', 'a', 'e' }, { 'i', 'h', 'k', 'r' },
				{ 'i', 'f', 'l', 'v' } };
		String[] words = new String[] { "oath", "pea", "eat", "rain" };
		wordSearchII.findWords(board, words);
	}

	@Test
	void testAddWord() {
		TrieNode root = new TrieNode();
		wordSearchII.addWord("oath", root);
		assertNotNull(root.getChildren());
		assertAll(() -> assertEquals(1, root.getChildren().size()),
				() -> assertEquals('o', root.getChildren().get(0).getVal()),
				() -> assertEquals('a', root.getChildren().get(0).getChildren().get(0).getVal())
				);
	}

}
