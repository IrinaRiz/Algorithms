package hw19_20;

public class PalindromeNumber {

    public static  boolean isPalindrome( int x){
        if(x == 0){
            return true;
        }
        if( x < 0 || x % 10 == 0){
            return false;
        }
        int reversed_int = 0;
        while (x > reversed_int){
            int y = x % 10;
            x = x / 10;
            reversed_int = reversed_int * 10 + y;
        }
        if(x == reversed_int || x == reversed_int / 10){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(12345));
        System.out.println(isPalindrome(121));

    }
}
