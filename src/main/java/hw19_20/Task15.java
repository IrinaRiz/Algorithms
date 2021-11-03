package hw19_20;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.RandomUtils;

import java.nio.charset.Charset;
import java.util.Random;

public class Task15 {
    // Напсиать метод, который генерирует строку слов случайной длины, состоящую из случайных букв английского алфавита.
    public static String random() {

        byte[] array = new byte[256];
        new Random().nextBytes(array);

        String randomString = new String(array);

        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < randomString.length(); i++) {
            char ch = randomString.charAt(i);
            if ((ch >= 65 && ch <= 90) || (ch >= 97 && ch <= 122)){
                stringBuilder.append(ch);
            }
        }
        return stringBuilder.toString();
    }


    public static void main(String[] args) {
        System.out.println(random());
    }
}
