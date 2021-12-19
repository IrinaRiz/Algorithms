package hw17_18;

import org.junit.Assert;
import org.junit.Test;

public class UpdatedStringTest {
    @Test
    public void testRemoveSpaces1(){
        String input = "QA For  Everyone ";
        String expectedResult = "qaforeveryone";

        UpdateString updateString = new UpdateString();

        String actualResult = updateString.updatedString(input);

        Assert.assertEquals(expectedResult,actualResult);
    }

    @Test
    public void testRemoveSpaces2(){
        String input = " Java lessons  are fun";
        String expectedResult = "javalessonsarefun";

        UpdateString updateString = new UpdateString();

        String actualResult = updateString.updatedString(input);

        Assert.assertEquals(expectedResult,actualResult);
    }

    @Test
    public void testRemoveSpaces3(){
        String input = "  ";
        String expectedResult = "  ";

        UpdateString updateString = new UpdateString();

        String actualResult = updateString.updatedString(input);

        Assert.assertEquals(expectedResult,actualResult);
    }
}
