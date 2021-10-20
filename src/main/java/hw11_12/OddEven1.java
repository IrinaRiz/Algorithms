package hw11_12;

public class OddEven1 {

//task1 Создать алгоритм OddEven, который примет на вход число,
// вернет “Odd”,  если число нечетное, и “Even”, если число четное. Во всех остальных случаях результат будет “Undefined”.
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






