//Implement a Java function to detect if a linked list has a cycle.

package Questions;

import java.util.HashSet;
import java.util.LinkedList;

public class Q3 {

    public static boolean CkBool(LinkedList<Object> LLk) {
        HashSet<Object> ooh = new HashSet<>();
        for (Object object : LLk) {
            if (!ooh.add(object)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        LinkedList<Object> llk = new LinkedList<>();
        llk.add(5);
        llk.add(7);
        llk.add(70);
        llk.add(9);
        llk.add(5);

        boolean b = CkBool(llk);
        System.out.println(b);
    }

}
