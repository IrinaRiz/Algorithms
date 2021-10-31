package hw17_18;

public class Task5 {
//    Написать метод, который удалит все пробелы из входящей строки, и заменит все большие буквы на маленькие.
//    Test Data:
//            “QA For  Everyone ” -> “qaforeveryone”
//            “ Java lessons  are fun” -> “javalessonsarefun”
    public String updatedString(String str){
        String newString = "";
        if(str.isBlank()) {
            return null;
        }else{
            newString = str.replaceAll(" ", "").toLowerCase();
        }
        return newString;
    }
}
