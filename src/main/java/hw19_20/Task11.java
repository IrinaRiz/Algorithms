package hw19_20;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Task11 {
//    Write a method, which checks if two given strings are Anagram of each other.
//    Two String is said to be an anagram of each other, if they contain exactly the same characters but in a different order.
//
//            Пример:
//    method("O, Draconian devil!", "!Leonardo Da Vinci,")  -> true
//    method("Oh, lame saint!", "The Mona Lisa,!") -> true

    public static boolean isAnagram ( String str1, String str2){
        if(str1.length() != str2.length()){
            return false;
        }else{
            int[] char_counts = new int[26];
            for(int i = 0; i < str1.length(); i++){
                char_counts[str1.toLowerCase().charAt(i) - 'a']++;
                char_counts[str2.toLowerCase().replaceAll(" ", "").charAt(i) - 'a']--;
            }
            for(int count : char_counts){
                if(count != 0){
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean isStringsAnagram(String input1, String input2) {

        if (input1.length() != input2.length()) {
            return false;
        }
        char[] str1 = input1.toLowerCase().toCharArray();
        char[] str2 = input2.toLowerCase().toCharArray();

        Arrays.sort(str1);
        Arrays.sort(str2);

        for (int i = 0; i < str1.length; i++) {
            if (str1[i] != str2[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isAnagram("aNagram", "nagAram"));
        System.out.println(isAnagram("car", "rat"));
        System.out.println(isStringsAnagram("O, Draconian devil!","!Leonardo Da Vinci," ));
        System.out.println(isStringsAnagram("Bad credit", "debit card"));
    }
}
