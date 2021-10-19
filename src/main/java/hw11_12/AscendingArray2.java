package hw11_12;

import java.util.Arrays;

public class AscendingArray2 {

    //task 2   Написать алгоритм AscendingSequence, который строит возрастающую последовательность чисел от a до b с шагом n.

    public static int[] ascendingOrder(int a, int b, int n) {
        if (b > a) {
            int[] array = new int[(b - a) / n + 1];
            array[0] = a;
            for (int i = 1; i < array.length; i++) {
                array[i] = array[i - 1] + 5;
            }
            return array;
        }else {
            return new int [] {-1};
        }
    }
}




