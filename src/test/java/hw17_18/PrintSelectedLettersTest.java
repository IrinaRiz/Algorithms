package hw17_18;

import org.junit.Assert;
import org.junit.Test;

public class PrintSelectedLettersTest {
    @Test
    public void testReturnLetters1() {
        String str = "QAForEveryone";
        PrintSelectedLetters printSelectedLetters = new PrintSelectedLetters();
        String expectedResult = "qorro";

        String actualResult = printSelectedLetters.printLetters(str);

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testReturnLetters2() {
        String str = "Java lessons are fun";
        PrintSelectedLetters printSelectedLetters = new PrintSelectedLetters();

        String expectedResult = "or";

        String actualResult = printSelectedLetters.printLetters(str);

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testReturnLetters3() {
        String str = "";
        PrintSelectedLetters printSelectedLetters = new PrintSelectedLetters();

        String expectedResult = null;

        String actualResult = printSelectedLetters.printLetters(str);

        Assert.assertEquals(expectedResult, actualResult);
    }
}

