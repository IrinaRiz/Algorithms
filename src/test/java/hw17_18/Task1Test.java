package hw17_18;

import org.junit.Assert;
import org.junit.Test;

public class Task1Test {
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
        String str = null;
        Task1 task1 = new Task1();

        String expectedResult = "Nothing to print, string is empty";

        String actualResult = task1.printLetters(str);

        Assert.assertEquals(expectedResult, actualResult);
    }
}

