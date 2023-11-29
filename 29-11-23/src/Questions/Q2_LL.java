//Write a Java function to reverse a singly linked list.


package Questions;

import java.util.Collections;
import java.util.LinkedList;

public class Q2_LL {
    public static void main(String[] args) {
        LinkedList<String> ksjd= new LinkedList<>();
        ksjd.add("Ridoy");
        ksjd.add("Kodom");
        ksjd.add("Cola");
        
        Collections.reverse(ksjd);
        System.out.println(ksjd);
    }
}
