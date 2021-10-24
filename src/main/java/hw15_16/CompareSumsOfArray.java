package hw15_16;
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
