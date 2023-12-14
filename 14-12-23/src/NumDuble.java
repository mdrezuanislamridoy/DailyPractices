//6. Write a Java program that reads a list of integers from the user and throws an exception if any numbers are duplicates.

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class NumDuble {
    public static void main(String[] args) {
        try {
            List<Integer> li= userInt();
            ck(li);
            System.out.println("No Matches");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    static List<Integer> userInt(){
        Scanner sc = new Scanner(System.in);

        List<Integer> ll= new ArrayList<Integer>();
        System.out.println("How many number do you want to check");

        int i = sc.nextInt();
        for (int j = 0; j < i; j++) {
            int num= sc.nextInt();
            ll.add(num);
        }
        return ll;
    }
    static void ck(List<Integer> number) throws UniqueException{
        Set<Integer> st= new HashSet<>();

        for (Integer integer : number) {
            if (st.contains(integer)) {
                throw new UniqueException("Duplicate Found");
            }
            st.add(integer);
        }
        System.out.println(st);
    }
}
class UniqueException extends Exception{
    UniqueException(String s){
        super(s);
    }
}
