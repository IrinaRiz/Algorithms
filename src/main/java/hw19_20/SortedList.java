package hw19_20;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortedList {
    public static void sortNames() {
        List<String> names = new ArrayList<>();
        names.add("Yigal");
        names.add("Anna");
        names.add("Liz");
        names.add("Bob");

        System.out.println(names);

        Collections.sort(names);
        System.out.println(names);
    }

    public static void main(String[] args) {
        sortNames();
    }
}
