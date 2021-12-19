package hw17_18;

public class Task3 {
    //    Написать метод, который принимает строку и заменяет все цифры 0 на букву “o”.
//    Test Data:
//            “QAF0rEvery0ne” -> “QAForEveryone”
//            “Java less0ns are fun” -> “Java lessons are fun”
    public String correctString(String initialString, char digit) {
        if (initialString.isBlank()) {
            return initialString;
        } else {
            return  initialString.replace(digit, 'o');
        }
    }
}

//    public static String numberToLetter(String str) {
//        return str.length() == 0 ? str : str.replaceAll("o","0");
//    }


