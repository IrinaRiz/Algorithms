import hw11_12.MoreOrLessZero;
import org.junit.Assert;
import org.junit.Test;

public class MoreOrLessZeroTest {
    @Test
    public void simpleTest(){
        int a = 555;
        int b = 0;
        int c = -555;
        boolean expectedResult1 = true;
        boolean expectedResult2 = true;
        boolean expectedResult3 = false;

        Assert.assertEquals(expectedResult1, MoreOrLessZero.isLessZero(a));
        Assert.assertEquals(expectedResult2, MoreOrLessZero.isLessZero(b));
        Assert.assertEquals(expectedResult3, MoreOrLessZero.isLessZero(c));
    }
}
