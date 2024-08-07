package hard;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Integer2EnglishWordTest {

  Integer2EnglishWord integer2EnglishWord = new Integer2EnglishWord();

  @Test
  void numberToWords() {
    assertEquals("One Hundred Twenty Three", integer2EnglishWord.numberToWords(123));
    assertEquals(
        "Twelve Thousand Three Hundred Forty Five", integer2EnglishWord.numberToWords(12345));
    assertEquals(
        "One Million Two Hundred Thirty Four Thousand Five Hundred Sixty Seven",
        integer2EnglishWord.numberToWords(1234567));
    assertEquals("Zero", integer2EnglishWord.numberToWords(0));

    assertEquals("Twenty", integer2EnglishWord.numberToWords(20));

    assertEquals(
        "Two Billion One Hundred Forty Seven Million Four Hundred Eighty Three Thousand Six Hundred Forty Seven",
        integer2EnglishWord.numberToWords(Integer.MAX_VALUE),
        "" + Integer.MAX_VALUE);
  }

  @Test
  void easy() {
    assertEquals("Eleven", integer2EnglishWord.numberToWords(11));
    assertEquals("Twenty", integer2EnglishWord.numberToWords(20));
    assertEquals("Fifty", integer2EnglishWord.numberToWords(50));
    assertEquals("Twenty One", integer2EnglishWord.numberToWords(21));
    assertEquals(
        "Fifty Thousand Eight Hundred Sixty Eight", integer2EnglishWord.numberToWords(50868));
  }
}
