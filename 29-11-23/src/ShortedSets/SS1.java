package ShortedSets;

import java.util.TreeSet;

public class SS1 {
    public static void main(String[] args) {

        //ShortedSet, NavigableSet, TreeSet ... all stores in Tree set and by default they are shorted
        // Heterogeneous objects are not allowed (For Sorting needs)
        // Object Classes should be implementing Comparable Interface (StringBuffer is not supported)
        //  null insertion is not allowed (Exception)

        TreeSet ts= new TreeSet<>();

        ts.add(9);
        ts.add(44);
        System.out.println(ts);

        // Different data types not allowed

        // ts.add("st");

        // System.out.println(ts);

        ts.add(9); // Duplicates are not allowed
        System.out.println(ts);
         
    }
}
