package hw15_16;

public class CompareTwoArrays {

//    {1, 2, 3, 4, 5}
//    {1, 2, 3, 4, 5}
//    Expected result: true
//
//    {1, 2, 3, 4, 6}
//    {1, 2, 3, 4, 5}
//    Expected result: false
    public boolean isEqual(int[] array1, int[] array2) {
        boolean result = true;
        for (int i = 0; i < array1.length; i++) {
            result = array1[i] == array2[i];
        }
        return result;
    }
}
