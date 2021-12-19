package hw17_18;

import org.junit.Assert;
import org.junit.Test;

public class Task7Test {
    @Test
    public void testVowel1(){
        String input = "QA For Everyone";
        int expectedResult = 6;

        CountVowels task7 = new CountVowels();
        int actualResult = task7.countLetters(input);

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testVowel2(){
        String input = "Java lessons are fun";
        int expectedResult = 7;

        CountVowels task7 = new CountVowels();
        int actualResult = task7.countLetters(input);

        Assert.assertEquals(expectedResult, actualResult);
    }





}
