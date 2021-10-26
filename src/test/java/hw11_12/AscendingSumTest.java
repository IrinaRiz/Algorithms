package hw11_12;

import hw11_12.AscendingSum4;
import org.junit.Assert;
import org.junit.Test;
public class AscendingSumTest {

    @Test
    public void addSum(){
        int n = 222;

        int expectedResult = 24753;

        AscendingSum4 ascendingSum = new AscendingSum4();
        int actualResult = ascendingSum.countSum(n);

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void checkSum(){
        int n = -10;

        int expectedResult = 56;

        AscendingSum4 ascendingSum = new AscendingSum4();
        int actualResult = ascendingSum.countSum(n);

        Assert.assertEquals(expectedResult, actualResult);
    }
}
