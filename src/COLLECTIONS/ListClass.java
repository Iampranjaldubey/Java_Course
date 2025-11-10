package COLLECTIONS;

import java.util.ArrayList;
import java.util.List;

public class ListClass {
    public static void main(String[] args) {
        List<String> list=new ArrayList<String>();
        list.add("Ram");
        list.add("Shyam");
        list.add("Rahman");
        list.add("pranjal");
        list.add("shivang");

        for(int i=0; i<list.size(); i++){
            System.out.print(list.get(i) + " ");
        }


    }
}
