package hw15_16;
//Написать алгоритм ZeroSum, который принимает на вход массив целых чисел
// и возвращает массив из двух чисел, сумма которых равна 0.

public class ZeroSum {
    public int[] shortArray(int[] array){
         for(int i = 0; i < array.length -1; i ++){
             for (int j = i + 1; j < array.length; j ++){
                 if(array[i] + array[j] == 0){
                     return  new int[] {array[i], array[j]};

                 }
             }
         }
         return new int[1];
    }
}
