package hw19_20;

public class Task5 {
//    Написать метод, который проверяет строку на уникальность символов в ней.
    public static boolean isUnique (String input){
        boolean flag = true;
        for(int i = 0; i < input.length() - 1; i++){
            for(int j = i +1; j <input.length(); j++){
                if (input.charAt(i) == input.charAt(j)) {
                    return false;
                }
            }
        }
        return flag;
    }

    public static void main(String[] args) {
        System.out.println(isUnique("a@bcdefj!?>"));
    }
}
