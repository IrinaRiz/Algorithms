package hw15_16;

//Написать метод, который принимает на вход массив чисел 0 и 1,
// и возвращает самую длинную последовательность единиц из входящего массива

public class LongestArray {
    public String[] longArray(int[] array) {
        StringBuilder ones = new StringBuilder();

        int max_seq = 0;

        for (int i = 0 ,cur_seq = 0; i < array.length; i++) {
            if (array[i] == 1) {
                cur_seq ++;
            }
            if ( i == array.length - 1 || array[i] != 1) {
                if(cur_seq >= max_seq){
                    max_seq = cur_seq;
                    cur_seq = 0;
                }
            }
        }
            for (int i = 0; i < max_seq; i++) {
                ones = ones.append(1).append(",");
            }
            return ones.toString().split(",");
        }
}
