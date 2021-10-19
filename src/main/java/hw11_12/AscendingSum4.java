package hw11_12;

import com.google.gson.internal.bind.util.ISO8601Utils;

public class AscendingSum4 {
    //    Написать алгоритм, который возвращает сумму всех чисел от 1 до n,
//    если последовательность чисел возрастающая; и возвращает разницу всех чисел, если последовательность чисел убывающая.
    public static int countSum(int n) {
        int sum = 0;
        if (n > 1) {
            for (int i = 1; i <= n; i++) {
                sum += i;
            }
        } else if (n < 1) {
            sum = 1;
            for (int i = 0; i >= n; i--) {
                sum -= i;
            }
        }
        return sum;
    }
}

