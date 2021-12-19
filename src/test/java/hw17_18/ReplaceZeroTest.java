package hw17_18;

import org.junit.Assert;
import org.junit.Test;

public class ReplaceZeroTest {
    @Test
    public void testRemoveDigit1(){
        char digit = '0';
        String initialString = "QAF0rEvery0ne";
        String expectedResult = "QAForEveryone";

        ReplaceZeroToLetterO replaceZeroToLetterO = new ReplaceZeroToLetterO();

        String actualResult = replaceZeroToLetterO.correctString(initialString,'0');
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testRemoveDigit2(){
        char digit = '0';
        String initialString = "Java less0ns are fun";
        String expectedResult = "Java lessons are fun";

        ReplaceZeroToLetterO replaceZeroToLetterO = new ReplaceZeroToLetterO();

        String actualResult = replaceZeroToLetterO.correctString(initialString,'0');
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testNegative(){
        char digit = '0';
        String initialString = "";
        String expectedResult = "";

        ReplaceZeroToLetterO replaceZeroToLetterO = new ReplaceZeroToLetterO();

        String actualResult = replaceZeroToLetterO.correctString(initialString,'0');
        Assert.assertEquals(expectedResult, actualResult);
    }
}
