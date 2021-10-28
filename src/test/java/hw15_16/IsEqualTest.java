package hw15_16;

import org.junit.Assert;
import org.junit.Test;

public class IsEqualTest {
    @Test
    public void testCompareArrays1(){
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 =  {1, 2, 3, 4, 5};
        boolean expectedResult = true;

        CompareTwoArrays compareTwoArrays = new CompareTwoArrays();
        boolean actualResult = compareTwoArrays.isEqual(array1, array2);

        Assert.assertEquals(expectedResult,actualResult);
    }

    @Test
    public void testCompareArrays2(){
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 =  {1, 2, 3, 4, 6};
        boolean expectedResult = false;

        CompareTwoArrays compareTwoArrays = new CompareTwoArrays();
        boolean actualResult = compareTwoArrays.isEqual(array1, array2);

        Assert.assertEquals(expectedResult,actualResult);
    }
}
