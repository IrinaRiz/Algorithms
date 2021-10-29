package hw17_18;

//   Написать метод, который принимает на вход строку
//    и печатает все буквы “q”, “o” и “r” из этой строки:
//    Test Data
//“QAForEveryone”
// “Java lessons are fun”

public class Task1 {
    public  boolean doIneedToPrint;

    public  String printLetters(String str) {
        String newStr = "";
        doIneedToPrint = true;
        if (str == null || str.length() == 0) {
            newStr = "Nothing to print, string is empty";
            doIneedToPrint = true;
        } else {
            for (int i = 0; i < str.length(); i++) {
                if (str.toLowerCase().charAt(i) == 'q' || str.toLowerCase().charAt(i) == 'o'
                        || str.toLowerCase().charAt(i) == 'r') {
                    newStr += str.toLowerCase().charAt(i);
                    doIneedToPrint = true;
                }else{
                    doIneedToPrint = false;
                }
            }
        }
        return newStr;
    }

    public void printSomething(){
        if(doIneedToPrint == false){
            System.out.println("No required letters in String");
        }


    }
}
























