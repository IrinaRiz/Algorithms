package hw15_16;

import org.junit.Assert;
import org.junit.Test;

public class ZeroSumTest {
    @Test
    public void testCheckSumZero(){
        int[] array = {35, 23, 12, 89, -23, -48, 100};
        int[] expectedResult = {23, -23};

        ZeroSum zeroSum = new ZeroSum();
        int[] actualResult = zeroSum.shortArray(array);

        Assert.assertArrayEquals(expectedResult, actualResult);

    }
}
