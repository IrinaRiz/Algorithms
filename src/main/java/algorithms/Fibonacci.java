package algorithms;

import java.util.Arrays;

public class Fibonacci {
    //определение числа Фибоначчи на n-позиции
    public static int fib(int n){
        if(n == 0){
            return 0;
        }
        if(n == 1){
            return 1;
        }
        else{
            return fib(n - 1) + fib(n - 2);
        }
    }

    public static int fibbonacci(int n){
        if (n == 0 || n == 1){
            return 1;
        }
        else{
            return fibbonacci( n - 1) + fibbonacci(n - 2);
        }
    }

    //нерекурсивный метод
    public static int fibb(int n){
        if(n == 0){
            return 0;
        }
        if( n == 1){
            return 1;
        }
        int a = 0;
        int b = 1;
        int sum =  a + b;
        while(n > 1){
            sum = a + b;
            a = b;
            b = sum;
            n--;
        }
        return sum;
    }

    // построить массив с числами Фибоначчи
    public static int[] fibonacciArray(int n){
        int[] arr = new int[n];
        arr[0] = 0;
        arr[1] = 1;
        for (int i = 2; i < arr.length; i++){
            arr[i] = arr[i - 1] + arr[ i - 2];
        }
        return arr;

    }


    public static void main(String[] args) {
        System.out.println(fib(7));
        System.out.println(fibbonacci(7));
        System.out.println(fibb(7));
        System.out.println(Arrays.toString(fibonacciArray(9)));
    }
}
