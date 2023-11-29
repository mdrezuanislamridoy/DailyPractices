package SetInterfaces;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;



public class Si1 {
    public static void main(String[] args) {
        // set don't have his own methods, It will get them from Collection Interface
        // Set don't have no interface
        // duplicates are not allowed
        // Insertion order is not preserved
        // Random order will Work in memory
        //No Indexing . Indexes Randomly
        
        HashSet<Object> sh= new HashSet<>();
        sh.add("hash");
        sh.add("setting");
        sh.add("better");
        sh.add("hash");

        System.out.println(sh.add("better")); // duplicate not allowed

        System.out.println(sh);
        
        for (Object object : sh) {
            System.out.println(object);
        }

        System.out.println();

        Iterator<Object> ite = sh.iterator();

        while (ite.hasNext()) {
            System.out.println(ite.next());
        }
    }
}
