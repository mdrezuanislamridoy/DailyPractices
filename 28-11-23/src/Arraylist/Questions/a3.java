//3. Change ArrayList Elements

package Arraylist.Questions;

import java.util.ArrayList;

public class a3 {

    public static void main(String[] args) {
        ArrayList<String> arr= new ArrayList<>();
        arr.add("Hola");
        arr.add("Vola");

        arr.set(0, "MOra");
        System.out.println(arr);
        //4. Remove ArrayList Elements

        arr.remove(0);
        System.out.println(arr);
    }

   


    
}