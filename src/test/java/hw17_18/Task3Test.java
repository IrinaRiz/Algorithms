package hw17_18;

import org.junit.Assert;
import org.junit.Test;

public class Task3Test {
    @Test
    public void testRemoveDigit1(){
        char digit = '0';
        String initialString = "QAF0rEvery0ne";
        String expectedResult = "QAForEveryone";

        Task3 task3 = new Task3();

        String actualResult = task3.correctString(initialString,'0');
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testRemoveDigit2(){
        char digit = '0';
        String initialString = "Java less0ns are fun";
        String expectedResult = "Java lessons are fun";

        Task3 task3 = new Task3();

        String actualResult = task3.correctString(initialString,'0');
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testNegative(){
        char digit = '0';
        String initialString = "  ";
        String expectedResult = "Warning: String is empty or blank!";

        Task3 task3 = new Task3();

        String actualResult = task3.correctString(initialString,'0');
        Assert.assertEquals(expectedResult, actualResult);
    }
}
