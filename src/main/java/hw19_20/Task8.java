package hw19_20;

import java.util.HashSet;

public class Task8 {
//    Find the non-repeating length of the longest substring in a string
//    Example :  aabcb                     Output expected: 3
//    Example2: aaaaa        Output expected: 1

    public static int longestSubstring(String str){
        int first = 0;
        int second = 0;
        int max = 0;

        HashSet<Character> hashSet = new HashSet<>();
        while(second < str.length()){
            if(!hashSet.contains(str.charAt(second))){
                hashSet.add(str.charAt(second));
                max = Math.max(hashSet.size(), max);
                second++;
            } else{
                hashSet.remove(str.charAt(first));
                first++;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(longestSubstring("aabcb"));
        System.out.println(longestSubstring("aaaa"));
        System.out.println(longestSubstring("aabcdb"));

    }

}
