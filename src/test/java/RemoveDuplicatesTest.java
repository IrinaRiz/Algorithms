import hw15_16.RemoveDuplicates;
import org.junit.Assert;
import org.junit.Test;

public class RemoveDuplicatesTest {
    @Test
    public void checkDuplicate1() {
        int[] array = {3, 4, 2, 6, 4, 3, 3, 3, 2, 2};
        int[] expectedResult = {3, 4, 2, 6};

        RemoveDuplicates removeDuplicates = new RemoveDuplicates();
        int[] actualResult = removeDuplicates.newArray(array);

        Assert.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void checkDuplicate2(){
        int[] array = {0, 1, 2, 3, 4, 5, 4, 3, 2, 1, 0};
        int[] expectedResult = {0, 1, 2, 3, 4, 5};

        RemoveDuplicates removeDuplicates = new RemoveDuplicates();
        int[] actualResult = removeDuplicates.newArray(array);

        Assert.assertArrayEquals(expectedResult, actualResult);

    }
}



