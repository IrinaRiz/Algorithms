package hw15_16;

public class ZeroSum {
    public int[] shortArray(int[] array){
         int[] arr = new int[2];
         for(int i = 0; i < array.length; i ++){
             for (int j = i + 1; j < array.length; j ++){
                 if(array[i] + array[j] == 0){
                     arr[0] = array[i];
                     arr[1] = array[j];
                 }
             }
         }
         return arr;
    }
}
