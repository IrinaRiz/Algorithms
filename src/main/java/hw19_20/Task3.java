package hw19_20;

import java.util.Arrays;

public class Task3 {
//    Напишите метод, который в строке находит слова минимальной и максимальной длины,
//    и количество слов одинаковой длины (максимально одинаковой).
//            “What a wonderful day!” -> [“a”, “wonderful”, “0”]
//            “I love to learn Java!” -> [“I”, “learn”, “2”]

    public static String[] arrayString(String input){
        String maxLength = "";
        String minLength = " ";
        int count = 0;

        String [] inputString = input.replaceAll("!", "").split(" ");
        for(int i = 0; i < inputString.length; i++){
            if(inputString[i].length() > maxLength.length()){
                maxLength=  inputString[i];
            }
            if(inputString[i].length() == minLength.length()){
                minLength = inputString[i];
            }
        }
        for(int i = 0; i < inputString.length -1; i++){
            for(int j = i +1; j < inputString.length; j++)
                if(inputString[i].length() == inputString[j].length()){
                    count += 2;
                }
            }

        return new String []{minLength, maxLength, String.valueOf(count)};
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(arrayString("What a wonderful day!")));
        System.out.println(Arrays.toString(arrayString("I love to learn Java!!")));
    }

}
