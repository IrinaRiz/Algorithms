package hw17_18;

import org.junit.Assert;
import org.junit.Test;

public class PrintSelectedLetters {
    @Test
    public void testReturnLetters1() {
        String str = "QAForEveryone";
        Task1 task1 = new Task1();
        String expectedResult = "qorro";

        String actualResult = task1.printLetters(str);

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testReturnLetters2() {
        String str = "Java lessons are fun";
        Task1 task1 = new Task1();

        String expectedResult = "or";

        String actualResult = task1.printLetters(str);

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testReturnLetters3() {
        String str = "";
        Task1 task1 = new Task1();

        String expectedResult = null;

        String actualResult = task1.printLetters(str);

        Assert.assertEquals(expectedResult, actualResult);
    }
}

