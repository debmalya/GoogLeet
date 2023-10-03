package daily.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class RemoveColoredPiecesIfBothNeighborsAreTheSameColorTest {

    RemoveColoredPiecesIfBothNeighborsAreTheSameColor removeColoredPiecesIfBothNeighborsAreTheSameColor
            = new RemoveColoredPiecesIfBothNeighborsAreTheSameColor();

    @Test
    void winnerOfGame() {
        assertTrue(removeColoredPiecesIfBothNeighborsAreTheSameColor.winnerOfGame0("AAABABB"));
        assertFalse(removeColoredPiecesIfBothNeighborsAreTheSameColor.winnerOfGame0("AA"));
        assertFalse(removeColoredPiecesIfBothNeighborsAreTheSameColor.winnerOfGame0("ABBBBBBBAAA"));
    }

    @Test
    void winnerOfGameOwn() {
        assertTrue(removeColoredPiecesIfBothNeighborsAreTheSameColor.winnerOfGame0("AAABBBAAA"));
    }

    @Test
    void winnerOfGameActual0() {
        assertFalse(removeColoredPiecesIfBothNeighborsAreTheSameColor.winnerOfGame0("AAAABBBB"));
    }

    @Test
    void winnerOfGameActual() {
        assertFalse(removeColoredPiecesIfBothNeighborsAreTheSameColor.winnerOfGame1("AAAABBBB"));
    }

    @Test
    void winnerOfTheGameActualBetter() {
        assertTrue(removeColoredPiecesIfBothNeighborsAreTheSameColor.winnerOfGame2("AAABBBAAA"));
        assertFalse(removeColoredPiecesIfBothNeighborsAreTheSameColor.winnerOfGame2("AAAABBBB"));
        assertTrue(removeColoredPiecesIfBothNeighborsAreTheSameColor.winnerOfGame2("AAAAABBBBBBAAAAA"));
        assertTrue(removeColoredPiecesIfBothNeighborsAreTheSameColor.winnerOfGame2("AAABABB"));
        assertFalse(removeColoredPiecesIfBothNeighborsAreTheSameColor.winnerOfGame2("AA"));
        assertFalse(removeColoredPiecesIfBothNeighborsAreTheSameColor.winnerOfGame2("ABBBBBBBAAA"));
    }

    @Test
    void winnerOfTheGameFactualBetter() {
        assertTrue(removeColoredPiecesIfBothNeighborsAreTheSameColor.winnerOfGame2("AAABBBAAA"));
        assertFalse(removeColoredPiecesIfBothNeighborsAreTheSameColor.winnerOfGame2("AAAABBBB"));
        assertTrue(removeColoredPiecesIfBothNeighborsAreTheSameColor.winnerOfGame2("AAAAABBBBBBAAAAA"));
        assertTrue(removeColoredPiecesIfBothNeighborsAreTheSameColor.winnerOfGame2("AAABABB"));
        assertFalse(removeColoredPiecesIfBothNeighborsAreTheSameColor.winnerOfGame2("AA"));
        assertFalse(removeColoredPiecesIfBothNeighborsAreTheSameColor.winnerOfGame2("ABBBBBBBAAA"));
    }

}