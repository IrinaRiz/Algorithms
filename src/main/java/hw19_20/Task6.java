package hw19_20;

public class Task6 {
//    Даны две строки. Определите, можно ли из некоторых символов первой строки составить вторую строку.
//
//    Пример:
//    method( “QAForEveryone”, “Verona”) -> true
//    method( “QAForEveryone”, “frog”) -> false
    public static boolean isPossibleBuildNewString( String input1, String input2){
        boolean flag = true;
            for(int i = 0; i < input2.length(); i ++)
            if (!input1.toLowerCase().contains(String.valueOf(input2.toLowerCase().charAt(i)))) {
                return false;
            }
        return flag;
    }

    public static void main(String[] args) {
        System.out.println(isPossibleBuildNewString("QAForEveryone", "Verona"));
        System.out.println(isPossibleBuildNewString("QAForEveryone", "frog"));
    }

}

