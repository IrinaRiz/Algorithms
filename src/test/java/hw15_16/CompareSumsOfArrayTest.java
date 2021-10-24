package hw15_16;

import org.junit.Assert;
import org.junit.Test;

public class CompareSumsOfArrayTest {
    @Test
    public void compareSums1(){
        int[] array = {4, 6, 3, 7, 1, 2};
        boolean expectedResult = true;

        CompareSumsOfArray compareSumsOfArray = new CompareSumsOfArray();
        boolean actualResult = compareSumsOfArray.compareSums(array);

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void compareSums2(){
        int[] array = {12, 48, 15, 125};
        boolean expectedResult = false;

        CompareSumsOfArray compareSumsOfArray = new CompareSumsOfArray();
        boolean actualResult = compareSumsOfArray.compareSums(array);

        Assert.assertEquals(expectedResult, actualResult);
    }
}
