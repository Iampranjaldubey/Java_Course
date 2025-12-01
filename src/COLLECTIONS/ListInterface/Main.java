package COLLECTIONS.ListInterface;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(1);

        System.out.println(list.get(2));
        System.out.println(list.size());
        System.out.println("using for loop fro printing");
        for (int i=0; i<list.size();i++){
            System.out.println(list.get(i));;
        }
        System.out.println("using for each loop for printing ");
        for(int x:list){
            System.out.println(x);
        }
        System.out.println(list.contains(2));
    }
}
