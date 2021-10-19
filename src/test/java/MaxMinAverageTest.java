import hw11_12.MaxMinAverage5;
import org.junit.Assert;
import org.junit.Test;

public class MaxMinAverageTest {

    @Test
    public void compareTest() {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] expectedResult1 = {5, 1, 3};

        int[] array2 = {-3, 0, 155, -39, 1003};
        int[] expectedResult2 = {1003, -39, 223};

        Assert.assertArrayEquals(expectedResult1, MaxMinAverage5.newArray(array1));
        Assert.assertArrayEquals(expectedResult2, MaxMinAverage5.newArray(array2));

    }
}
