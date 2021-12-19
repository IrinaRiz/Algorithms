package hw17_18;

import org.junit.Assert;
import org.junit.Test;

public class Task5Test {
    @Test
    public void testRemoveSpaces1(){
        String input = "QA For  Everyone ";
        String expectedResult = "qaforeveryone";

        UpdateString task5 = new UpdateString();

        String actualResult = task5.updatedString(input);

        Assert.assertEquals(expectedResult,actualResult);
    }

    @Test
    public void testRemoveSpaces2(){
        String input = " Java lessons  are fun";
        String expectedResult = "javalessonsarefun";

        UpdateString task5 = new UpdateString();

        String actualResult = task5.updatedString(input);

        Assert.assertEquals(expectedResult,actualResult);
    }

    @Test
    public void testRemoveSpaces3(){
        String input = "  ";
        String expectedResult = "  ";

        UpdateString task5 = new UpdateString();

        String actualResult = task5.updatedString(input);

        Assert.assertEquals(expectedResult,actualResult);
    }
}
