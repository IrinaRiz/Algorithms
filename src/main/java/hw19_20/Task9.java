package hw19_20;

public class Task9 {
//    Write a method that will take one string as an argument and will return the reverse version of this string.
//
//   reverseStr("apple")  -> “elppa”

    public static String reversedString(String input){
        StringBuilder stringBuilder = new StringBuilder(input);
        return stringBuilder.reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(reversedString("apple"));
        System.out.println(reversedString("Java is fun"));
    }


}
