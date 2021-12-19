package hw17_18;

public class Task2 {
//    Написать метод, который принимает строку и возвращает строку,
//    которая состоит только из букв на нечетных индексах (для построения новой строки использовать метод concat() или просто +):
//    Test Data:
//            “QAForEveryone” -> “AoEeyn”
//            “JavaLessonsAreFun” -> “aaesnAeu”

    public  String oddIndexString(String str) {
        String oddLetters = "";
        if (str.isBlank()) {
            return null;
        } else {
            for (int i = 1; i < str.length(); i += 2) {
                oddLetters = oddLetters.concat(String.valueOf(str.charAt(i)));
            }
        }
        return oddLetters;
    }
}
