public class Mathematics {

//task1 Создать алгоритм OddEven, который примет на вход число,
// вернет “Odd”,  если число нечетное, и “Even”, если число четное. Во всех остальных случаях результат будет “Undefined”.
//
//    Test Data:
//            -345 -> “Odd”
//            0 -> “Even”
//            222222 -> “Even”
//            2147483647 + 1 -> “Undefined”

    public static String typeNumber(int a) {
        String type = "";
        if (a == Integer.MAX_VALUE || a == Integer.MIN_VALUE) {
            type = "Undefined";
        }
        if (a % 2 != 0) {
            type = "Odd";
        }
        if (a % 2 == 0) {
            type = "Even";
        }
        return type;
    }
  }


