package hw15_16;

import org.junit.Assert;
import org.junit.Test;

public class LongestArrayTest {
    @Test
    public void maxSequenceTest1(){
        int[] array = {1, 1, 1, 0, 0, 0, 1, 1};
        String[] expectedResult = {"1","1","1"};

        LongestArray longestArray = new LongestArray();
        String[] actualResult = longestArray.longArray(array);

        Assert.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void maxSequenceTest2() {
        int[] array = {1, 0, 1, 1, 0, 1};
        String[] expectedResult = {"1", "1"};

        LongestArray longestArray = new LongestArray();
        String[] actualResult = longestArray.longArray(array);

        Assert.assertArrayEquals(expectedResult, actualResult);
    }
}
