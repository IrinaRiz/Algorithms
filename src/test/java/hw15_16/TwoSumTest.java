package hw15_16;

import org.junit.Assert;
import org.junit.Test;

public class TwoSumTest {
    @Test
    public void indexArrayTest1(){
        int[] array = {68, 5, 2, 100, 9, 12, 8};
        int targetNumber = 10;
        int[] expectedResult =  {2, 6};

        TwoSum twoSum = new TwoSum();
        int[] actualResult = twoSum.returnIndex(array, targetNumber);

        Assert.assertArrayEquals(expectedResult,actualResult);
    }

    @Test
    public void indexArrayTest2(){
        int[] array = {1, 20, 40, 60, -40, -20, -1};
        int targetNumber = -19;
        int[] expectedResult = {0, 5};

        TwoSum twoSum = new TwoSum();
        int[] actualResult = twoSum.returnIndex(array, targetNumber);

        Assert.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void indexArrayTest3(){
        int[] array = {8, 5, 2, 0, 9, 12, 8};
        int targetNumber = 12;
        int[] expectedResult = {3, 5};

        TwoSum twoSum = new TwoSum();
        int[] actualResult = twoSum.returnIndex(array, targetNumber);

        Assert.assertArrayEquals(expectedResult, actualResult);
    }
}
