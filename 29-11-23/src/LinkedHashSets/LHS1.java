package LinkedHashSets;

import java.util.LinkedHashSet;

public class LHS1 {

    public static void main(String[] args) {
        LinkedHashSet<Object> lsh= new LinkedHashSet<>();

        // Linked Hash set is preserved....... Other things is similler to hashset
        lsh.add("Jf");
        lsh.add(3435);

        System.out.println(lsh);
    }
}

// Uses of linked hash set uses for working without duplicates and insertion order is preserved
