package COLLECTIONS;

import java.util.Comparator;

public class RollnoComparator implements Comparator<Students> {
    public int compare(Students s1, Students s2){
        return Double.compare(s1.getRollno(), s2.getRollno());
    }

}
