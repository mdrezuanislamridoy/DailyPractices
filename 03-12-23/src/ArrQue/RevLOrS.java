package ArrQue;


import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;



public class RevLOrS {
    public static void main(String[] args) {
        LinkedList<Integer> ls= new LinkedList<>();
        ls.add(6);
        ls.add(7);
        ls.add(2);
        ls.add(9);

        Iterator<Integer> ite = ls.iterator();

        Collections.reverse(ls);

        for (Integer integer : ls) {
            System.out.print(integer+" ");
        }
    }
}
