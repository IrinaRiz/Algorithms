import hw11_12.FindMax;
import org.junit.Assert;
import org.junit.Test;

public class MaxValueTest {
    @Test

    public void maxTest() {
        int a = 3333;
        int b = 9999;

        int expectedResult = 9999;

        Assert.assertEquals(expectedResult, FindMax.maxValue(a, b));
    }
}
