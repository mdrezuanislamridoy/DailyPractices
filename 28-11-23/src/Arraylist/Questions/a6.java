//Searching for elements in an ArrayList

package Arraylist.Questions;

import java.util.ArrayList;

public class a6 {
    public static void main(String[] args) {
       
        ArrayList<String> ari= new ArrayList<>();
        ari.add("djf");
        ari.add("ujriue");
        ari.add("rejtr");

        
        System.out.println(ari);

        System.out.println(ari.indexOf("rejtr"));
        System.out.println(ari.indexOf("rejtn"));
    }
}
