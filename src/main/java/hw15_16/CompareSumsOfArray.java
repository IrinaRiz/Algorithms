package hw15_16;

//Напишите метод, который принимает массив целых положительных чисел
// (в массиве четное количество элементов), и возвращает true,
// если сумма чисел в первой половине массива больше суммы чисел во второй половине массива. Иначе возвращается false

public class CompareSumsOfArray {

    public  boolean compareSums(int[] array){
        int sum1 = 0;
        int sum2 = 0;
        for(int i = 0; i < array.length; i ++){
            if(i < array.length/2){
                sum1 += array[i];
            }else{
                sum2 += array[i];
            }
        }
        return sum1 > sum2;
    }
}
