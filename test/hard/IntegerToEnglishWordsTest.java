package hard;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class IntegerToEnglishWordsTest {

    @Test
    void numberToWords() {
        IntegerToEnglishWords obj = new IntegerToEnglishWords();
        Assertions.assertEquals("One", obj.numberToWords(1));
        Assertions.assertEquals("Twelve Thousand Three Hundred Forty Five", obj.numberToWords(12345));
        Assertions.assertEquals("One Million Two Hundred Thirty Four Thousand Five Hundred Sixty Seven", obj.numberToWords(1234567));
    }
}
