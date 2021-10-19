package hw11_12;

public class CompareTwoInt8 {
//    Напишите метод, который принимает на вход 2 любых int числа, и возвращает
//0, если числа равны
//-1, если первое число меньше второго
//1, если первое число больше второго
    public static int compareNumbers(int a, int b){
        return a == b ? 0 : a < b ? -1 : 1;
    }
}
