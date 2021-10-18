import hw11_12.EvenIndex;
import org.junit.Assert;
import org.junit.Test;

public class EvenIndexTest {
    @Test
    public void indexTest(){
        int[] array = {-45, 590, 234, 985, 12, 68};
        int[] expectedResult = {590, 985, 68};

        Assert.assertArrayEquals(expectedResult,EvenIndex.arrayIndex(array));
    }
}
