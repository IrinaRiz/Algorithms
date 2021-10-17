import hw11_12.AscendingArray;
import org.junit.Assert;
import org.junit.Test;

public class AscendingArrayTest {
    @Test
    public void happyPathTest(){
        int a =  10;
        int b =  25;
        int n =  5;
        int[] expectedResult = {10, 15, 20, 25};

        Assert.assertArrayEquals(expectedResult, AscendingArray.ascendingOrder(a, b, n));
    }

    @Test
    public void negativeTest(){
        int a =  10;
        int b = -25;
        int n =  -5;

        int [] expectedResult = {-1};

        Assert.assertArrayEquals(expectedResult, AscendingArray.ascendingOrder(a, b , n));
    }

    @Test
    public void secondNegativeTest(){
        int a =  10;
        int b =  10;
        int n =   2;

        int [] expectedResult = {-1};

        Assert.assertArrayEquals(expectedResult, AscendingArray.ascendingOrder(a, b, n));



    }
}
