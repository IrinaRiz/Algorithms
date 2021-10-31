package hw17_18;

import org.junit.Assert;
import org.junit.Test;

public class Task2Test {
    @Test
    public void testOddIndex1() {
        String str = "QAForEveryone";
        String expectedResult = "AoEeyn";

        Task2 task2 = new Task2();
        String actualResult = task2.oddIndexString(str);

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testOddIndex2() {
        String str = "JavaLessonsAreFun";
        String expectedResult = "aaesnAeu";

        Task2 task2 = new Task2();
        String actualResult = task2.oddIndexString(str);

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testOddIndex3() {
        String str = "";
        String expectedResult = null;

        Task2 task2 = new Task2();
        String actualResult = task2.oddIndexString(str);

        Assert.assertEquals(expectedResult, actualResult);
    }
}
