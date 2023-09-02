package daily;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ExtraCharactersInAStringTest {
    ExtraCharactersInAString extraCharactersInAString = new ExtraCharactersInAString();

    @Test
    void minExtraChar() {
        assertEquals(0, extraCharactersInAString.minExtraChar("helloworld", new String[]{"hello", "world"}));
        assertEquals(7, extraCharactersInAString.minExtraChar("dwmodizxvvbosxxw", new String[]{"ox", "lb", "diz", "gu", "v", "ksv", "o", "nuq", "r", "txhe", "e", "wmo", "cehy", "tskz", "ds", "kzbu"}));
        assertEquals(15, extraCharactersInAString.minExtraChar("azvzulhlwxwobowijiyebeaskecvtjqwkmaqnvnaomaqnvf", new String[]{"na", "i", "edd", "wobow", "kecv", "b", "n", "or", "jj", "zul", "vk", "yeb", "qnfac", "azv", "grtjba", "yswmjn", "xowio", "u", "xi", "pcmatm", "maqnv"}));
    }

    @Test
    void minExtraChar0() {
        assertEquals(0, extraCharactersInAString.minExtraChar0("helloworld", new String[]{"hello", "world"}));
        assertEquals(7, extraCharactersInAString.minExtraChar0("dwmodizxvvbosxxw", new String[]{"ox", "lb", "diz", "gu", "v", "ksv", "o", "nuq", "r", "txhe", "e", "wmo", "cehy", "tskz", "ds", "kzbu"}));
        assertEquals(14, extraCharactersInAString.minExtraChar0("azvzulhlwxwobowijiyebeaskecvtjqwkmaqnvnaomaqnvf", new String[]{"na", "i", "edd", "wobow", "kecv", "b", "n", "or", "jj", "zul", "vk", "yeb", "qnfac", "azv", "grtjba", "yswmjn", "xowio", "u", "xi", "pcmatm", "maqnv"}));
    }
}