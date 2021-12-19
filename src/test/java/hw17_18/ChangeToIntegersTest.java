package hw17_18;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class ChangeToIntegersTest {
    @Test
    public void changeToDigits1(){
        String input = "QA 4 Every1";
        List<Integer> expectedResult = Arrays.asList(4, 1);

        ChangeToListOfIntegers changeToListOfIntegers = new ChangeToListOfIntegers();
        List<Integer> actualResult = changeToListOfIntegers.digitsList(input);
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void changeToDigits2(){
        String input = "45 тысяч 378";
        List<Integer> expectedResult = Arrays.asList(4, 5, 3, 7, 8);

        ChangeToListOfIntegers changeToListOfIntegers = new ChangeToListOfIntegers();
        List<Integer> actualResult = changeToListOfIntegers.digitsList(input);
        Assert.assertEquals(expectedResult, actualResult);
    }

}
