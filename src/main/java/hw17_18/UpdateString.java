package hw17_18;

public class UpdateString {
//    Написать метод, который удалит все пробелы из входящей строки, и заменит все большие буквы на маленькие.
//    Test Data:
//            “QA For  Everyone ” -> “qaforeveryone”
//            “ Java lessons  are fun” -> “javalessonsarefun”
    public String updatedString(String str){
        if(str.isBlank()) {
            return str;
        }else{
            return str.replaceAll(" ", "").toLowerCase();
        }
    }
}
