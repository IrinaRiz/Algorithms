import hw11_12.MaxMinAverage;
import org.junit.Assert;
import org.junit.Test;

public class MaxMinAverageTest {

    @Test
    public void compareTest() {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] expectedResult1 = {5, 1, 3};

        int[] array2 = {-3, 0, 155, -39, 1003};
        int[] expectedResult2 = {1003, -39, 223};

        Assert.assertArrayEquals(expectedResult1, MaxMinAverage.newArray(array1));
        Assert.assertArrayEquals(expectedResult2, MaxMinAverage.newArray(array2));

    }
}
