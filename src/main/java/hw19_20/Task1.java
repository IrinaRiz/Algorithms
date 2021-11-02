package hw19_20;

import com.google.gson.internal.bind.util.ISO8601Utils;

public class Task1 {
//    Напишите метод, который выводит строковый параметр  n раз и показывает количество символов в новой строке.
//    Test Data:
//    "QA for Everyone"

    public static String multipleString(String str, int a){
        String str2 = str.repeat(a);
        return str2.concat(" ").concat(String.valueOf(str2.length()));

    }

    public static void main(String[] args) {
        System.out.println(multipleString("QA for Everyone", 3));
    }
}
