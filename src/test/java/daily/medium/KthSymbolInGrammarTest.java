package daily.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class KthSymbolInGrammarTest {
    KthSymbolInGrammar kthSymbolInGrammar = new KthSymbolInGrammar();

    @Test
    void kthGrammar0() {
        assertEquals(0, kthSymbolInGrammar.kthGrammar0(1, 1));
        assertEquals(0, kthSymbolInGrammar.kthGrammar0(2, 1));
        assertEquals(1, kthSymbolInGrammar.kthGrammar0(2, 2));
    }

    @Test
    void kthGrammar01() {
        assertEquals(0, kthSymbolInGrammar.kthGrammar0(30, 1000));
    }

    @Test
    void kthGrammar1() {
        assertEquals(0, kthSymbolInGrammar.kthGrammar1(1, 1));
        assertEquals(0, kthSymbolInGrammar.kthGrammar1(2, 1));
        assertEquals(1, kthSymbolInGrammar.kthGrammar1(2, 2));
    }

    @Test
    void kthGrammar10() {
        assertEquals(0, kthSymbolInGrammar.kthGrammar1(30, 1000));
    }
}