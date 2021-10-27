package hw15_16;

//Написать алгоритм TwoSum, который принимает на вход массив целых чисел,
// и возвращает массив из двух ИНДЕКСОВ значений, сумма которых равна таргетному числу.

public class TwoSum {
    public int[] returnIndex (int[] array, int target) {
        int[] indexArray = new int[2];
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] + array[j] == target) {
                    indexArray[0] = i;
                    indexArray[1] = j;
                }
            }
        }
        return indexArray;
    }
}
