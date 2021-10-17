import hw11_12.OddEven;
import org.junit.Assert;
import org.junit.Test;

public class OddEvenTest {
    @Test
    public void testTypeNumber() {

        int number1 = -345;
        int number2 = 0;
        int number3 = 222222;
        int number4 = 2147483647 + 3;

        Assert.assertEquals("Odd", OddEven.typeNumber(number1));
        Assert.assertEquals("Even", OddEven.typeNumber(number2));
        Assert.assertEquals("Even", OddEven.typeNumber(number3));
        //Assert.assertEquals("Undefined", Mathematics.typeNumber(number4));
    }
}
