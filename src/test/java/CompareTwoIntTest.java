import hw11_12.CompareTwoInt8;
import org.junit.Assert;
import org.junit.Test;

public class CompareTwoIntTest {
    @Test
    public void compareEqualTest() {
        int k = 89;
        int l = 89;

        int expectedResult = 0;

        CompareTwoInt8 compareTwoInt8 = new CompareTwoInt8();

        int actualResult = compareTwoInt8.compareNumbers(k, l);

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void compareDif(){
        int k = -89;
        int l = 89;

        int expectedResult = -1;

        CompareTwoInt8 compareTwoInt8 = new CompareTwoInt8();

        int actualResult = compareTwoInt8.compareNumbers(k, l);

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void compareDifferent(){
        int k = 89;
        int l = -89;

        int expectedResult = 1;

        CompareTwoInt8 compareTwoInt8 = new CompareTwoInt8();

        int actualResult = compareTwoInt8.compareNumbers(k, l);

        Assert.assertEquals(expectedResult, actualResult);
    }
}
