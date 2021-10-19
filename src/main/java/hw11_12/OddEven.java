package hw11_12;

public class OddEven {


//task1 Создать алгоритм OddEven, который примет на вход число,
// вернет “Odd”,  если число нечетное, и “Even”, если число четное. Во всех остальных случаях результат будет “Undefined”.
//
//    Test Data:
//            -345 -> “Odd”
//            0 -> “Even”
//            222222 -> “Even”
//            2147483647 + 1 -> “Undefined”

    public static String typeNumber(long a) {
        String type = "";
        if (a > Integer.MAX_VALUE || a < Integer.MIN_VALUE) {
            type = "Undefined";
        }else if (a % 2 != 0) {
            type = "Odd";
        }else{
            type = "Even";
        }
        return type;
    }
}






