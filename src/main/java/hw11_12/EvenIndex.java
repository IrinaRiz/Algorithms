package hw11_12;

import java.util.Arrays;

public class EvenIndex {
    public static int[] arrayIndex(int[] array){
        int j = 0;
        int[] newArray = new int[array.length / 2];
        for(int i = 0; i < array.length ; i ++) {
            if (i % 2 != 0) {
                newArray[j] = array[i];
                j++;
            }
        }
        return newArray;
    }
}
