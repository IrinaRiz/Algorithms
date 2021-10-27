package hw15_16;

//Написать  алгоритм RemoveDuplicates, который принимает на вход массив чисел, и возвращает массив уникальных чисел.
import java.util.Arrays;
public class RemoveDuplicates {

    public  int[] newArray (int[] array)
    {
        return Arrays.stream(array).distinct().toArray();
    }
}
