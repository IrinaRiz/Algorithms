package hw15_16;

import org.junit.Assert;
import org.junit.Test;

public class SortedArrayTest {
    @Test
    public void sortArray1(){
        int[] array = {12, 2, 3, 4, 5};
        int[] expectedResult = {2, 3, 4, 5, 12};

        SortedArray sortedArray = new SortedArray();
        int[] actualResult = sortedArray.sortArray(array);

        Assert.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void sortArray2(){
        int[] array = {-3, 0, 155, -39, 1003};
        int[] expectedResult = {-39, -3, 0, 155, 1003};

        SortedArray sortedArray = new SortedArray();
        int[] actualResult = sortedArray.sortArray(array);

        Assert.assertArrayEquals(expectedResult, actualResult);
    }
}
