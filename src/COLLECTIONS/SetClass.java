package COLLECTIONS;

import java.util.HashSet;
import java.util.Set;

public class SetClass {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<Integer>();
        set.add(10);
        set.add(20);
        set.add(10);
//        System.out.println(set);
        for(int i: set){
            System.out.print(i + " ");
        }
    }

}
