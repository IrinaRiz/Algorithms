package hw19_20;

public class Task2 {
//    Напишите метод, который принимает строковый параметр и возвращает слово,
//    которое состоит из последних трех и первых трех букв слова-параметра,
//    если длина строки больше 5. Иначе метод возвращает слово,
//    состоящее из средней/средних буквы/букв слова-параметра, повторенных столько раз, какова длина строки.
//
//            Пример:
//    method(“QAForEveryone”) -> “oneQAF”
//    method(“Java”) -> “avavavav”
//    method(“A”) -> “A”

    public static String returnedString(String str){
        String string = "";
        if(str.length() > 5){
            return str.substring(str.length()-3)
                    .concat(str.substring(0,3));
        }else if(str.length() == 4) {
            return str.substring(1, 3).repeat(4);
        }else if(str.length() == 3) {
            return str.substring(1, 2).repeat(3);
        }else if(str.length() == 2 || str.length() == 1) {
            return str;
        }
        return string;
    }

    public static void main(String[] args) {
        System.out.println(returnedString("QAForEveryone"));
        System.out.println(returnedString("Java"));
        System.out.println(returnedString("ABC"));
        System.out.println(returnedString("A"));
    }
}
