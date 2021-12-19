package hw17_18;

public class CountSpaces {
//    Написать метод, который gitпринимает строку, и возвращает количество пробелов в этой строке
//    Test Data:
//            “QA For Everyone” -> 2
//            “Java lessons  are fun” -> 4

    public int space(String str) {
        int count = 0;
        if(str.isEmpty()){
            return -1;
        }else  {
            for (int i = 0; i < str.length(); i++) {
                if (String.valueOf(str.charAt(i)).isBlank()) {
                    count += 1;
                }
            }
        }
        return count;
    }
}


