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

    public static void printBottles99Song() {
        String bottles = " bottles of beer";
        String bottle = " bottle of beer";
        String wall = " on the wall";
        //String noMore1 = "no more";
        String noMoreN = "No more";
        String take = "Take one down and pass it around";
        String go = "Go to the store and buy some more";
        String commaSpace = ", ";
        String dot = ".";

        for (int i = 99; i >= 0; i--) {
            if (i == 2) {
                System.out.println(i + bottles + wall + commaSpace + i + bottles + dot);
                System.out.println(take + commaSpace + (i - 1) + bottle + wall + dot);
                System.out.println();
            } else if (i == 1) {
                System.out.println(i + bottle + wall + commaSpace + i + bottle + dot);
                System.out.println(take + commaSpace + noMoreN.toLowerCase() + bottles + wall + dot);
                System.out.println();
            } else if (i == 0) {
                System.out.println(noMoreN + bottles + wall + commaSpace + noMoreN.toLowerCase() + bottles + dot);
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

