package hw15_16;

//Написать алгоритм SmallestDifference, который принимает на вход массив целых чисел
// и возвращает ту пару чисел, абсолютная разница между которыми наименьшая

public class SmallestDifference {
    public static int[] minDifference(int[] array){
        int[] minArray = new int[2];
        int minResult = Integer.MAX_VALUE;
        for (int i = 0; i < array.length -1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (Math.abs(array[i] - array[j]) < minResult) {
                    minResult = Math.abs(array[i] - array[j]);
                    minArray[0] = array[i];
                    minArray[1] = array[j];
                }
            }
        }
        return minArray;
    }
}
