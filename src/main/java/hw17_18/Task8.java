package hw17_18;

import java.util.ArrayList;
import java.util.List;

public class Task8 {
//    Написать метод, который все цифры из входящей строки вернет в виде List<Integer>.
//    Test Data:
//            “QA 4 Every1” -> [4, 1]
//            “45 тысяч 378” -> [4, 5, 3, 7, 8]

    public List<Integer> digitsList(String str) {
        List<Integer> list2 = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            if (String.valueOf(str.charAt(i)).equals("0") || String.valueOf(str.charAt(i)).equals("1") ||
                    String.valueOf(str.charAt(i)).equals("2") || String.valueOf(str.charAt(i)).equals("3") ||
                    String.valueOf(str.charAt(i)).equals("4") || String.valueOf(str.charAt(i)).equals("5") ||
                    String.valueOf(str.charAt(i)).equals("6") || String.valueOf(str.charAt(i)).equals("7") ||
                    String.valueOf(str.charAt(i)).equals("8") || String.valueOf(str.charAt(i)).equals("9")) {
                list2.add(Integer.valueOf(String.valueOf(str.charAt(i))));
            }
        }
        return list2;
    }
}










