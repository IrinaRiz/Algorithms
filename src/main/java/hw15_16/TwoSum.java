package hw15_16;

//Написать алгоритм TwoSum, который принимает на вход массив целых чисел,
// и возвращает массив из двух ИНДЕКСОВ значений, сумма которых равна таргетному числу.

public class TwoSum {
    public int[] returnIndex (int[] array, int target) {

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] + array[j] == target) {
                    return new int[] {i, j};
                }
            }
        }
        return new int[0];
    }
}
