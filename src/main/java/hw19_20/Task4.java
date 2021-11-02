package hw19_20;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Task4 {
//    Написать метод, который принимает на вход строку букв,
//    и  возвращает строку, в которой только уникальные буквы
//    Пример:
//    method(“abcaczdbdakcazdbaz”)
//    Вернуть
//“abcdkz"

    public static String unique (String str) {
        Set<Character> chars = new HashSet();
        for (int i = 0; i < str.length(); i++) {
            chars.add(str.charAt(i));
        }
        return String.valueOf(chars);
    }

    public static String newString(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            if(!result.contains(String.valueOf(str.charAt(i)))){
                result += str.charAt(i);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(unique("abcaczdbdakcazdbaz"));
        System.out.println(newString("abcaczdbdakcazdbaz"));
    }
}
