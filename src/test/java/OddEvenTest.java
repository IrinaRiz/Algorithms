import hw11_12.OddEven1;
import org.junit.Assert;
import org.junit.Test;

public class OddEvenTest {
    @Test
    public void negativeNumber() {
        long number1 = -345;

        String expectedResult = "Odd";

        OddEven1 oddEven = new OddEven1();
        String actualResult = oddEven.typeNumber(number1);

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void zeroNumber(){
        long number2 = 0;

        String expectedResult = "Even";

        OddEven1 oddEven = new OddEven1();
        String actualResult = oddEven.typeNumber(number2);

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void positiveNumber(){
        long number3 = 222222;

        String expectedResult = "Even";

        OddEven1 oddEven = new OddEven1();
        String actualResult = oddEven.typeNumber(number3);

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void longNumber(){
        long number4 = 2147483647l + 1;
        String expectedResult = "Undefined";

        OddEven1 oddEven = new OddEven1();
        String actualResult = oddEven.typeNumber(number4);

        Assert.assertEquals(expectedResult, actualResult);
    }
}
