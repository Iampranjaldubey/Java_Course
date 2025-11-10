package COLLECTIONS;

import java.util.*;

public class Hashset {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {5, 4, 3, 2, 1};

        boolean result = haveSameSet(arr1, arr2);
        System.out.println("Do both arrays have the same set of numbers? " + result);
    }

    public static boolean haveSameSet(int[] arr1, int[] arr2) {
        // Convert arrays to sets (removes duplicates and ignores order)
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for (int num : arr1) set1.add(num);
        for (int num : arr2) set2.add(num);

        // Compare both sets
        return set1.equals(set2);
    }
}
