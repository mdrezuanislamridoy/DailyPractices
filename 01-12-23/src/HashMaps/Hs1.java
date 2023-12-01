package HashMaps;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class Hs1 {
    public static void main(String[] args) {
        HashMap hs = new HashMap<>();
        hs.put(111, "Ami");
        hs.put(131, "Tumi");
        hs.put(132, "Se");

        System.out.println(hs);

        Set s = hs.entrySet();
        System.out.println(s);
        System.out.println();
        Iterator it = s.iterator();

        while (it.hasNext()) {
            Entry e = (Map.Entry) it.next();
            System.out.println(e.getKey());
            System.out.println(e.getValue());
            System.out.println("----------------");

            if (e.getKey().equals(111)) {
                e.setValue("Mora");
            }
        }
        System.out.println(hs);
    }
}
