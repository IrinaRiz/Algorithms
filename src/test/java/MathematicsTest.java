import org.junit.Assert;
import org.junit.Test;

public class MathematicsTest {
    @Test
    public void testTypeNumber(){

        int number1 = -345;
        int number2 = 0;
        int number3 = 222222;
        //int number4 = 2147483647 + 3;

        Assert.assertEquals("Odd", Mathematics.typeNumber(number1));
        Assert.assertEquals("Even", Mathematics.typeNumber(number2));
        Assert.assertEquals("Even", Mathematics.typeNumber(number3));
        //Assert.assertEquals("Undefined", Mathematics.typeNumber(number4));
    }
}
