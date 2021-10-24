package hw15_16;

import java.util.Arrays;

import static java.lang.StrictMath.abs;

public class SmallestDifference {
//    Написать алгоритм SmallestDifference, который принимает на вход массив целых чисел
//    и возвращает ту пару чисел, абсолютная разница между которыми наименьшая

//    Test Data:
//    Input = {8, 5, 2, 0, 9, 12, 8}
//    Expected Result =  {8, 8}
//
//    Input = {8, -55, 2, -54, -12}
//    Expected Result =  {-55, -54}
    public static int[] minDifference(int[] array){
        int[] minArray = new int[2];
        int minResult = Integer.MAX_VALUE;
        for(int i = 0; i < array.length -1; i ++){
            for(int j = i + 1; j < array.length; j ++){
                int dif = Math.abs(array[i] - array[j]);
                if(dif < minResult ) {
                    minResult = dif;
                    minArray[0] = array[i];
                    minArray[1] = array[j];
                    System.out.println(dif);
                }
            }
        }
        return minArray;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new int[] {8, 5, 2, 0, 9, 12, 8} ));
    }

}
