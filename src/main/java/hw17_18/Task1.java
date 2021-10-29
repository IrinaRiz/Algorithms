package hw17_18;

public class Task1 {
    //    Написать метод, который принимает на вход строку
//    и печатает все буквы “q”, “o” и “r” из этой строки:
//    Test Data
//“QAForEveryone”
// “Java lessons are fun”
    public String printLetters(String str) {
        String newStr = "";
        if (str == null || str.length() == 0) {
            newStr = "Nothing to print, string is empty";
        } else {
            for (int i = 0; i < str.length(); i++) {
                if (str.toLowerCase().charAt(i) == 'q' || str.toLowerCase().charAt(i) == 'o'
                        || str.toLowerCase().charAt(i) == 'r') {
                    newStr += str.toLowerCase().charAt(i);
                }
            }
        }
        return newStr;
    }
}

















