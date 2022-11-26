package daily;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SudukuValidatorTest {

	SudukuValidator sudukuValidator = new SudukuValidator();

	@Test
	void testIsValidSudoku() {
		char[][] board = new char[][] { { '.', '.', '.', '.', '5', '.', '.', '1', '.' },
				{ '.', '4', '.', '3', '.', '.', '.', '.', '.' }, { '.', '.', '.', '.', '.', '3', '.', '.', '1' },
				{ '8', '.', '.', '.', '.', '.', '.', '2', '.' }, { '.', '.', '2', '.', '7', '.', '.', '.', '.' },
				{ '.', '1', '5', '.', '.', '.', '.', '.', '.' }, { '.', '.', '.', '.', '.', '2', '.', '.', '.' },
				{ '.', '2', '.', '9', '.', '.', '.', '.', '.' }, { '.', '.', '4', '.', '.', '.', '.', '.', '.' } };

		assertFalse(sudukuValidator.isValidSudoku(board));

	}

}
