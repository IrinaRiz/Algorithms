package hw15_16;

//Напишите метод, который принимает на вход 2 массива целых положительных чисел,
// git и возвращает true, если каждый элемент первого массива равен элементу второго массива с тем же индексом

public class CompareTwoArrays {

    public boolean isEqual(int[] array1, int[] array2) {
        boolean result = true;
        if (array1.length != array2.length) {
            return false;
        }else if (array1.length == array2.length) {
            for (int i = 0; i < array1.length; i++) {
                result = array1[i] == array2[i];
            }
        }
        return result;
    }
}
