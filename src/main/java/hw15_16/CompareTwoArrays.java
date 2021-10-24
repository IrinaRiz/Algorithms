package hw15_16;

public class CompareTwoArrays {

    public boolean isEqual(int[] array1, int[] array2) {
        boolean result = true;
        for (int i = 0; i < array1.length; i++) {
            result = array1[i] == array2[i];
        }
        return result;
    }
}
