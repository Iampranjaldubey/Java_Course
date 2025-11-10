package COLLECTIONS;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortingClass {
    public static void main(String[] args) {
        List<String> colors = Arrays.asList("blue", "green", "red");

        Collections.sort(colors);

        System.out.println(colors);
    }
}
