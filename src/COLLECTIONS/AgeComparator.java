package COLLECTIONS;

import OOPs.Constructor.C;

import java.util.Comparator;

public class AgeComparator implements Comparator<Students> {
    public int compare(Students s1, Students s2){
        return Double.compare(s1.getAge(), s2.getAge());
    }
}
