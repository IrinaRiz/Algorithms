package hw15_16;

import java.util.Arrays;

public class Longest {
    public static String[] arrLong (int[] array){
        StringBuilder longArray = new StringBuilder();

        int max_len = 0;

        for(int i =0, cur_len = 0;  i < array.length; i ++){
            if(array[i] == 1){
                cur_len ++;
            }
            if(i == array.length-1 || array[i] != 1){
                if(cur_len >= max_len){
                    max_len = cur_len;
                    cur_len = 0;
                }
            }
        }
        for(int i = 0; i < max_len; i ++){
            longArray = longArray.append(1).append(",");
        }
        return longArray.toString().split(",");

    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(arrLong(new int[]{1, 1, 1, 0, 0, 0, 1, 1})));

//        Test Data:
//        Input = {1, 1, 1, 0, 0, 0, 1, 1}
//        Expected Result = {1, 1, 1}
//
//        Input = {1, 0, 1, 1, 0, 1}
//        Expected Result = {1, 1}

    }
}
