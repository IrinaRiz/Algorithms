package hw17_18;

import org.junit.Assert;
import org.junit.Test;

public class OddLettersTest {
    @Test
    public void testOddIndex1() {
        String str = "QAForEveryone";
        String expectedResult = "AoEeyn";

        PrintOddLetters printOddLetters = new PrintOddLetters();
        String actualResult = printOddLetters.oddIndexString(str);

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testOddIndex2() {
        String str = "JavaLessonsAreFun";
        String expectedResult = "aaesnAeu";

        PrintOddLetters printOddLetters = new PrintOddLetters();
        String actualResult = printOddLetters.oddIndexString(str);

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testOddIndex3() {
        String str = "";
        String expectedResult = null;

        PrintOddLetters printOddLetters = new PrintOddLetters();
        String actualResult = printOddLetters.oddIndexString(str);

        Assert.assertEquals(expectedResult, actualResult);
    }
}
