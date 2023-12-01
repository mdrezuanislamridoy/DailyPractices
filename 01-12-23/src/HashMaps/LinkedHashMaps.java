package HashMaps;

import java.util.LinkedHashMap;

public class LinkedHashMaps {
    public static void main(String[] args) {
        // Insertion is preserved
        LinkedHashMap lhm=  new LinkedHashMap<>();
        lhm.put(111, "Ridoy");
        lhm.put(112, "Babu");
        lhm.put(113, "King");
        System.out.println(lhm);
    }
}
