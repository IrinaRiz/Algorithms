package hw11_12;
public class MaxMinAverage5 {
//    Написать алгоритм, который принимает массив чисел int[] и возвращает массив,
//    который содержит максимальное число, минимальное число и среднее.
    public static int[] newArray(int[] array){
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int sum = 0;
        int[] arr = new int[3];
        for(int i = 0; i < array.length; i ++){
            if(max < array[i]){
                max = array[i];
            }
            if(min > array[i]){
                min = array[i];
            }
            sum += array[i];
        }
        return new int[]{max, min, sum / array.length};
    }
}
