package hw15_16;

public class Bottles99 {
    //    10. Напишите метод, который распечатает песню
//    "99 Bottles of Beer" точно в таком виде,
//    в каком песня написана на странице
//    http://www.99-bottles-of-beer.net/lyrics.html
//    Вызовите этот метод в отдельном тесте
//    (тест не будет ничего проверять,
//    просто будет запускать метод и
//    выводить песню на консоль)

    public static String buildNewString(String string, int index, char letter){
        String result = "";
        for(int i = 0; i < string.length(); i++) {
            if(i != index && string.charAt(i) != letter){
                result += string.charAt(i);
            }
        }
        return result;
    }

    public static void printBottles99Song() {
        String bottles = " bottles of beer";
        String wall = " on the wall";
        String noMore = "No more";
        String take = "Take one down and pass it around";
        String go = "Go to the store and buy some more";
        String commaSpace = ", ";
        String dot = ".";


//        System.out.println(bottles.length());
//        for(int i = 0; i < bottles.length(); i++){
//            if(bottles.charAt(i) == 's'){
//                System.out.println(i);
//            }
//        }
//        String newResult = "";
//        for(int i = 0; i < bottles.length(); i++) {
//            if (i != 7) {
//                newResult = newResult + bottles.charAt(i);
//            }
//        }
//        System.out.println(newResult);

//        for(int i = 0; i < bottles.length(); i++) {
//            if ( bottles.charAt(i) != 's') {
//                newResult = newResult + bottles.charAt(i);
//            }
//        }
//        System.out.println(newResult);

        //System.out.println(bottle);

        for (int i = 99; i >= 0; i--) {
            if (i == 2) {
                System.out.println(i + bottles + wall + commaSpace + i + bottles + dot);
                System.out.println(take + commaSpace + (i - 1) + buildNewString(bottles,7,'s') + wall + dot);
                System.out.println();
            } else if (i == 1) {
                System.out.println(i + buildNewString(bottles,7,'s') + wall + commaSpace + i +
                        buildNewString(bottles,7,'s') + dot);
                System.out.println(take + commaSpace + noMore.toLowerCase() + bottles + wall + dot);
                System.out.println();
            } else if (i == 0) {
                System.out.println(noMore + bottles + wall + commaSpace + noMore.toLowerCase() + bottles + dot);
                System.out.println(go + commaSpace + 99 + bottles + wall + dot);
                System.out.println();
            } else {
                System.out.println(i + bottles + wall + commaSpace + i + bottles + dot);
                System.out.println(take + commaSpace + (i - 1) + bottles + wall + dot);
                System.out.println();
            }
        }
    }
    public static void main(String[] args) {
        printBottles99Song();
    }
}

