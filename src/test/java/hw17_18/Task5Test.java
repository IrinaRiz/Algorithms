package hw17_18;

import org.junit.Assert;
import org.junit.Test;

public class Task5Test {
    @Test
    public void testRemoveSpaces1(){
        String input = "QA For  Everyone ";
        String expectedResult = "qaforeveryone";

        Task5 task5 = new Task5();

        String actualResult = task5.updatedString(input);

        Assert.assertEquals(expectedResult,actualResult);
    }

    @Test
    public void testRemoveSpaces2(){
        String input = " Java lessons  are fun";
        String expectedResult = "javalessonsarefun";

        Task5 task5 = new Task5();

        String actualResult = task5.updatedString(input);

        Assert.assertEquals(expectedResult,actualResult);
    }

    @Test
    public void testRemoveSpaces3(){
        String input = "  ";
        String expectedResult = null;

        Task5 task5 = new Task5();

        String actualResult = task5.updatedString(input);

        Assert.assertEquals(expectedResult,actualResult);
    }
}
