import java.util.TreeSet;

public class Treesets {

    public static void main(String[] args) {
        TreeSet<String> ts = new TreeSet<>();

        ts.add("Ridoy");
        ts.add("TTs");
        // ts.add(65); // Different Data type not allowed
        ts.add("Ridoy"); // Duplicates not allow
        ts.add("amr");
        // null not allowed
        // ts.add(null);
        System.out.println(ts);

        // TreeSet<Integer> trs = new TreeSet<>(); // Default shorted
        // trs.add(6);
        // trs.add(8);
        // trs.add(9);
        // trs.add(3);
        // System.out.println(trs);
        // System.out.println(trs.headSet(9));
        // System.out.println(trs.tailSet(8));

        // Without comparable interface other things wont work
        // ts.add(new StringBuffer("Hola"));

        Integer a = 8;
        Integer b = 4;
        System.out.println(a.compareTo(b));


        // Customised Shorting Order
        // Comparator

        TreeSet st = new TreeSet<>(new ClassA());
        // st.add(8);
        // st.add(0);
        // st.add(3);
        // System.out.println(st);

        st.add("RR");
        st.add("ar");
        st.add("Ar");
        st.add("rr");
        System.out.println(st);
        
        
        // Shorted Set
        TreeSet<Integer> trs = new TreeSet<>(); // Default shorted
        trs.add(6);
        trs.add(8);
        trs.add(9);
        trs.add(3);
        System.out.println(trs);
        System.out.println(trs.first());
        System.out.println(trs.last());
        System.out.println(trs.headSet(9));
        System.out.println(trs.tailSet(8));

        //Navigable Set

        System.out.println();
        System.out.println(trs.lower(8));
        System.out.println(trs.higher(8));
        System.out.println(trs.floor(10)); // <= 10
        System.out.println(trs.ceiling(6)); // >= 6
        System.out.println(trs.pollFirst()); // first element retrive and remove
        System.out.println(trs.pollLast()); // last element retrive and remove
        System.out.println(trs);
        System.out.println(trs.descendingSet()); //desending  order
    }
}
