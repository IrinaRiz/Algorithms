package hw15_16;

import java.util.Arrays;

public class TwoSum {
    public int[] returnIndex (int[] array, int target) {
        int[] indexArray = new int[2];
        for (int i = 0; i < array.length - 1; i++) {
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
