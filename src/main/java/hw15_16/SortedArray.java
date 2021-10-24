package hw15_16;

import java.util.Arrays;

public class SortedArray {
//    Написать алгоритм SortedArray, который принимает массив чисел int[], и возвращает отсортированный массив
//
//    Test Data:
//    {12, 2, 3, 4, 5} -> {2, 3, 4, 5, 12}
//    {-3, 0, 155, -39, 1003} -> {-39, -3, 0, 155, 1003}
    public int [] sortArray(int[] array) {
        Arrays.sort(array);
        return array;
    }
}
