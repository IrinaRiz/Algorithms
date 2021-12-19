package hw17_18;

import org.junit.Assert;
import org.junit.Test;

public class Task6Test {
    @Test
    public void testSpace1(){
        String input = "QA For  Everyone ";
        String expectedResult = "QA FOR EVERYONE";

        ChangeToUpperCase task6 = new ChangeToUpperCase();
        String actualResult = task6.upperCaseString(input);

        Assert.assertEquals(expectedResult,actualResult);
    }

    @Test
    public void testSpace2(){
        String input = " Java lessons  are fun";
        String expectedResult = "JAVA LESSONS ARE FUN";

        ChangeToUpperCase task6 = new ChangeToUpperCase();
        String actualResult = task6.upperCaseString(input);

        Assert.assertEquals(expectedResult,actualResult);
    }
}
