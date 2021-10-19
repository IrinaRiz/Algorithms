import hw11_12.FindMax6;
import org.junit.Assert;
import org.junit.Test;

public class MaxValueTest {
    @Test

    public void maxTest() {
        int a = 3333;
        int b = 9999;

        int expectedResult = 9999;

        FindMax6 findMax = new FindMax6();
        int actualResult = findMax.maxValue(a, b);

        Assert.assertEquals(expectedResult, actualResult);
    }
}
