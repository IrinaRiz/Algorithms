package hw17_18;

public class Task6 {
//    Написать метод, который переведет строку в upper case и уберет все ЛИШНИЕ пробелы
//
//    Test Data:
//            “QA For  Everyone ” -> “QA FOR EVERYONE”
//            “ Java lessons  are fun” -> “JAVA LESSONS ARE FUN”

    public String upperCaseString(String str){
        return str.toUpperCase().replaceAll(" +", " ").trim();
    }
}
