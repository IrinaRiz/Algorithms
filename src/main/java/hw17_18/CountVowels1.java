package hw17_18;

public class CountVowels1 {
//    Написать метод, который посчитает количество гласных букв в строке.
//    Для нахождения гласных букв использовать метод contains()
//(гласные буквы - “a”, “e”, “i”, “o”, “u”)
//    Test Data:
//            “QA For Everyone” -> 6
//            “Java lessons are fun” -> 7

    public static int value (String str){
        String vowel = "aeiou";
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (vowel.contains(String.valueOf(str.charAt(i)) .toLowerCase())) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(value("QA For Everyone"));
        System.out.println(value("Java lessons are fun"));
    }
}
