package hw15_16;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class TwoSumTest {
    @Test
    public void testIndexArray1(){
        int[] array = {68, 5, 2, 100, 9, 12, 8};
        int targetNumber = 10;
        int[] expectedResult =  {2, 6};

        TwoSum twoSum = new TwoSum();
        int[] actualResult = twoSum.returnIndex(array, targetNumber);
        System.out.println(Arrays.toString(actualResult));

        Assert.assertArrayEquals(expectedResult,actualResult);
    }

    @Test
    public void testIndexArray2(){
        int[] array = {1, 20, 40, 60, -40, -20, -1};
        int targetNumber = -19;
        int[] expectedResult = {0, 5};

        TwoSum twoSum = new TwoSum();
        int[] actualResult = twoSum.returnIndex(array, targetNumber);

        Assert.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testIndexArray3(){
        int[] array = {8, 5, 2, 0, 9, 12, 8};
        int targetNumber = 12;
        int[] expectedResult = {3, 5};

        TwoSum twoSum = new TwoSum();
        int[] actualResult = twoSum.returnIndex(array, targetNumber);

        Assert.assertArrayEquals(expectedResult, actualResult);
    }
}
