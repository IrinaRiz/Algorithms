package hw17_18;

import org.junit.Assert;
import org.junit.Test;

public class Task4Test {
    @Test
    public void testCountSpace1(){
        String inputString = "QA For Everyone";
         int expectedResult = 2;

         Task4 task4 = new Task4();
         int actualResult = task4.space(inputString);

        Assert.assertEquals(expectedResult,actualResult);
    }

    @Test
    public void testCountSpace2(){
        String inputString = "Java lessons  are fun";
        int expectedResult = 4;

        Task4 task4 = new Task4();
        int actualResult = task4.space(inputString);

        Assert.assertEquals(expectedResult,actualResult);
    }

    @Test
    public void testCountSpace3(){
        String inputString = "";
        int expectedResult = 0;

        Task4 task4 = new Task4();
        int actualResult = task4.space(inputString);

        Assert.assertEquals(expectedResult,actualResult);
    }
}
