package hw19_20;

public class Task10 {
    //    Write a method that will take a string as an argument. The method will return a palindrome.
//      A palindrome is a word, phrase, number, or sequence of words that reads the same backward as forward.
//
////Такие варианты редко дают на интервью
//            a)
//    method(“А роза упала на лапу Азора”) -> “арозА упал ан алапу азор А”      или  “а розА упала на лапу азорА”
//
////Этот вариант чаще дают на интервью
//    b) Написать метод, который проверяет, является ли слово палиндромом.
//
//    method(“Madam”) -> true    это палиндром
//    method(12321) -> true
    public static boolean isPalindrome(String str) {
        String result = "";
        for (char c : str.toCharArray()) {
            if (Character.isDigit(c) || Character.isLetter(c)) {
                result += c;
            }
        }
        result = result.toLowerCase();
        int first = 0;
        int last = result.length() - 1;

        while (first <= last) {
            if (result.charAt(first) != result.charAt(last)) {
                return false;
            } else {
                first++;
                last--;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("Madam"));
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
        System.out.println(isPalindrome("А роза упала на лапу Азора"));
        System.out.println(isPalindrome("12321"));
        System.out.println(isPalindrome(" care race"));
    }
}
