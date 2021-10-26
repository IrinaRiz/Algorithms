package hw11_12;

import hw11_12.MoreOrLessZero7;
import org.junit.Assert;
import org.junit.Test;

public class MoreOrLessZeroTest {
    @Test
    public void positiveNumberTest(){
        int a = 555;

        boolean expectedResult1 = true;
        MoreOrLessZero7 moreOrLessZero = new MoreOrLessZero7();

        boolean actualResult = moreOrLessZero.isLessZero(a);

        Assert.assertEquals(expectedResult1, actualResult);

    }

    @Test
    public void zeroNumberTest(){
        int b = 0;

        boolean expectedResult = true;
        MoreOrLessZero7 moreOrLessZero = new MoreOrLessZero7();

        boolean actualResult = moreOrLessZero.isLessZero(b);

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void negativeNumber(){
        int c = -555;

        boolean expectedResult = false;

        MoreOrLessZero7 moreOrLessZero = new MoreOrLessZero7();
        boolean actualResult = moreOrLessZero.isLessZero(c);

        Assert.assertEquals(expectedResult, actualResult);
    }
}
