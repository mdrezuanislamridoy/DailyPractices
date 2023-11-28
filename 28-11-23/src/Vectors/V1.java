package Vectors;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class V1 {
    public static void main(String[] args) {
        Vector<Object> v = new Vector<>();
        v.addElement("44");
        v.addElement("Hola");
        v.addElement(55);

        System.out.println(v);

        v.removeElement("44");
        System.out.println(v);
        v.removeElementAt(1);
        System.out.println(v);

        v.addElement("gola");

        // v.removeAllElements();
        // System.out.println();

        System.out.println(v.firstElement());
        System.out.println(v.lastElement());
        System.out.println(v.size());

        // Iterator<Object> i = v.iterator(); // vector have elements for iterate

        Iterator<Object> h = v.iterator();
        while (h.hasNext()) {
            System.out.println(h.next());
        }

        Enumeration<Object> i = v.elements();

        while (i.hasMoreElements()) {
            System.out.println(i.nextElement());
        }
    }
}
