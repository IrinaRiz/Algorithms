package hw19_20;

import java.util.Arrays;
import java.util.Comparator;

public class Task13 {
//    Строка состоит из слов, разделенных пробелами.
//    Переставьте слова a) по убыванию их длин
//    b) Отсортировать по алфавиту.

    public static String sortedString(String str){
        String[] array = str.split(" ");
        Arrays.sort(array, Comparator.comparing(String::length).reversed());
        return Arrays.toString(array);
    }

    public static String sortedAlphabeticalString(String str){
        String[] array = str.split(" ");
        return Arrays.toString(array);
    }

    public static void main(String[] args) {
        System.out.println(sortedString("My house is beautiful"));
        System.out.println(sortedString("QA for EveryOne"));
        System.out.println(sortedAlphabeticalString("My house is beautiful"));

    }
}
