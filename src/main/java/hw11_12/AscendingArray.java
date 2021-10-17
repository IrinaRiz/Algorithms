package hw11_12;

import java.util.Arrays;

public class AscendingArray {

    //task 2   Написать алгоритм AscendingSequence, который строит возрастающую последовательность чисел от a до b с шагом n.

    //    a =  10
//    b =  -25
//    n =  -5
//    Expected result = {-1}
//
//    a =  10
//    b =  10
//    n =  2
//    Expected result = {-1}
    public static int[] ascendingOrder(int a, int b, int n) {
        if (b > a) {
            int[] array = new int[(b - a) / n + 1];
            array[0] = a;
            for (int i = 1; i < array.length; i++) {
                array[i] = array[i - 1] + 5;
            }
            return array;
        }else {
            int[] array = {-1};
            return array;
        }
    }


    public static void main(String[] args) {
        System.out.println(Arrays.toString(ascendingOrder(10, 10, 2)));
    }
}




