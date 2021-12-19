package hw17_18;

import org.junit.Assert;
import org.junit.Test;

public class UpperCaseTest {
    @Test
    public void testSpace1(){
        String input = "QA For  Everyone ";
        String expectedResult = "QA FOR EVERYONE";

        ChangeToUpperCase changeToUpperCase = new ChangeToUpperCase();
        String actualResult = changeToUpperCase.upperCaseString(input);

        Assert.assertEquals(expectedResult,actualResult);
    }

    @Test
    public void testSpace2(){
        String input = " Java lessons  are fun";
        String expectedResult = "JAVA LESSONS ARE FUN";

        ChangeToUpperCase changeToUpperCase = new ChangeToUpperCase();
        String actualResult = changeToUpperCase.upperCaseString(input);

        Assert.assertEquals(expectedResult,actualResult);
    }
}
