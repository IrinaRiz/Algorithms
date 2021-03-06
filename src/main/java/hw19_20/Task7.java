package hw19_20;

public class Task7 {
//    Write a function to find the longest common prefix string amongst an array of strings.
//    If there is no common prefix, return an empty string "".
//    Example 1:
//    Input: String[] strs = {"flower","flow","flight"}
//    Output: "fl"
//    Example 2:
//    Input: String[] strs = {"dog","racecar","car"}
//    Output: ""
//    Explanation: There is no common prefix among the input strings
    public static String longestCommonPrefix (String[] strs){
        if(strs.length == 0){
            return "";
        }
        String prefix = strs[0];
        for(int i = 1; i < strs.length; i++){
            while(strs[i].indexOf(prefix) != 0){
                prefix = prefix.substring(0, prefix.length() -1);
            }
        }
        return prefix;
    }

    public static void main(String[] args) {
        System.out.println(longestCommonPrefix(new String[] {"flower","flow","flight"}));
        System.out.println(longestCommonPrefix(new String[] {"dog","racecar","car"}));
        System.out.println(longestCommonPrefix(new String[] {"table","tablet","tableron"}));
    }

}
