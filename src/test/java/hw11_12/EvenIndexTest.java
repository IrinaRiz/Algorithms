package hw11_12;

import hw11_12.EvenIndex3;
import org.junit.Assert;
import org.junit.Test;

public class EvenIndexTest {
    @Test
    public void indexTest(){
        int[] array = {-45, 590, 234, 985, 12, 68};
        int[] expectedResult = {590, 985, 68};

        EvenIndex3 evenIndex3 = new EvenIndex3();
        int[] actualResult = evenIndex3.arrayIndex(array);

        Assert.assertArrayEquals(expectedResult, actualResult);
    }
}
