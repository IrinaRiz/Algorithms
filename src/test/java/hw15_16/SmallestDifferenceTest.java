package hw15_16;

import org.junit.Assert;
import org.junit.Test;

public class SmallestDifferenceTest {
    @Test
    public void checkDifferenceTest1(){
        int[] array = {8, 5, 2, 0, 9, 12, 8};
        int[] expectedResult =  {8, 8};

        SmallestDifference smallestDifference = new SmallestDifference();
        int[] actualResult = smallestDifference.minDifference(array);

        Assert.assertArrayEquals(expectedResult,actualResult);

    }

    @Test
    public void checkDifferenceTest2(){
        int[] array = {8, -55, 2, -54, -12};
        int[] expectedResult =  {-55, -54};

        SmallestDifference smallestDifference = new SmallestDifference();
        int[] actualResult = smallestDifference.minDifference(array);

        Assert.assertArrayEquals(expectedResult,actualResult);
    }
}
