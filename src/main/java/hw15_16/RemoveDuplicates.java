package hw15_16;
import java.util.Arrays;
public class RemoveDuplicates {

    public  int[] newArray (int[] array) {
        return Arrays.stream(array).distinct().toArray();
    }
}
