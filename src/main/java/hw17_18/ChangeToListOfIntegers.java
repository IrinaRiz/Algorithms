package hw17_18;

import java.util.ArrayList;
import java.util.List;

public class ChangeToListOfIntegers {
//    Написать метод, который все цифры из входящей строки вернет в виде List<Integer>.
//    Test Data:
//            “QA 4 Every1” -> [4, 1]
//            “45 тысяч 378” -> [4, 5, 3, 7, 8]

    public List<Integer> digitsList(String str) {
        List<Integer> list2 = new ArrayList<>();
        String string = "0123456789";
        for (int i = 0; i < str.length(); i++) {
            if (string.contains(String.valueOf(str.charAt(i)))) {
                list2.add(Integer.valueOf(String.valueOf(str.charAt(i))));
            }
        }
        return list2;
    }
}












