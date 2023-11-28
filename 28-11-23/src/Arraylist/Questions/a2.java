//2. Access ArrayList Elements

package Arraylist.Questions;

import java.util.ArrayList;

public class a2 {
    public static void main(String[] args) {
        ArrayList<String> sb= new ArrayList<>();

        sb.add("Ridoy");
        sb.add("Moti");
        
        System.out.println(sb);

        sb.get(1);
        System.out.println(sb);
    }
}
