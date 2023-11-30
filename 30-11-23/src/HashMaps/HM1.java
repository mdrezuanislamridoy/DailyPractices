package HashMaps;

import java.util.HashMap;

public class HM1 {

    public static void main(String[] args) {
        HashMap hm= new HashMap<>();
        // hash map need key and value for store data 

        hm.put(55, "RRR");
        hm.put(84, "King");
        hm.put(11, "Boss");
        System.out.println(hm);

        hm.put(11, "Loss"); // Replace Value
        System.out.println(hm);

        System.out.println(hm.get(11));
        System.out.println(hm.get(84));
        System.out.println(hm.get(55));
    }
}
