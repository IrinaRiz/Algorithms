package hw17_18;

public class Task7 {
//    Написать метод, который посчитает количество гласных букв в строке.
//    Для нахождения гласных букв использовать метод contains()
//(гласные буквы - “a”, “e”, “i”, “o”, “u”)
//    Test Data:
//            “QA For Everyone” -> 6
//            “Java lessons are fun” -> 7

    public  int countLetters(String input) {
        int count = 0;
        String[] array = input.toLowerCase().split("");
        for (int i = 0; i < array.length; i++) {
            if (array[i].contains("a") || array[i].contains("e") || array[i].contains("i")
                    || array[i].contains("o") || array[i].contains("u")) {
                count++;
            }
        }
        return count;
    }
}

//    public static int howManyVowelLetters(String str) {
//        char[] vowel = {'A', 'a', 'E', 'e', 'I', 'i', 'Y', 'y', 'U', 'u', 'O', 'o'};
//        int count = 0;
//        for (int i = 0; i < str.length(); i++) {
//            for (int j = 0; j < vowel.length; j++) {
//                if (str.charAt(i) == vowel[j]) {
//                    count++;
//                }
//            }
//        }
//        return count;
//    }
