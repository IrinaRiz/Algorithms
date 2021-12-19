package hw17_18;

import org.junit.Assert;
import org.junit.Test;

public class CountSpacesTest {
    @Test
    public void testCountSpace1(){
        String inputString = "QA For Everyone";
         int expectedResult = 2;

         CountSpaces countSpaces = new CountSpaces();
         int actualResult = countSpaces.space(inputString);

        Assert.assertEquals(expectedResult,actualResult);
    }

    @Test
    public void testCountSpace2(){
        String inputString = "Java lessons  are fun";
        int expectedResult = 4;

        CountSpaces countSpaces = new CountSpaces();
        int actualResult = countSpaces.space(inputString);

        Assert.assertEquals(expectedResult,actualResult);
    }

    @Test
    public void testCountSpace3(){
        String inputString = "";
        int expectedResult = -1;

        CountSpaces countSpaces = new CountSpaces();
        int actualResult = countSpaces.space(inputString);

        Assert.assertEquals(expectedResult,actualResult);
    }
}
