package hw17_18;

public class Task3 {
//    Написать метод, который принимает строку и заменяет все цифры 0 на букву “o”.
//    Test Data:
//            “QAF0rEvery0ne” -> “QAForEveryone”
//            “Java less0ns are fun” -> “Java lessons are fun”
    public String correctString( String initialString, char digit){
        String newStr = "";
        if(initialString.isBlank() || initialString.isEmpty()) {
            newStr = "Warning: String is empty or blank!";
        }else {
            for (int i = 0; i < initialString.length(); i++) {
                if (initialString.charAt(i) == digit) {
                    newStr = initialString.replace(digit, 'o');
                }
            }
        }
        return newStr;
    }
}
