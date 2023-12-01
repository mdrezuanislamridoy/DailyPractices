//6. Write a Java program that reads a list of integers from the user and throws an exception if any numbers are duplicates.



package qs;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;


public class ExcUsingCollection {
    public static void main(String[] args) {
        try {
            List ls= lk();
            Hs(ls);
            System.out.println("Duplicate not found");
            
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }

    }
    public static List lk(){
        List<Integer> ls= new ArrayList<>();
        ls.add(77);
        ls.add(32);
        ls.add(98);
        ls.add(12);
        ls.add(12);
        

        return ls;
    }
    public static void Hs(List ll) throws DuplicateContantFoundException{
        HashSet ha= new HashSet<>();
        for (Object object : ll) {
            if (ha.contains(object)) {
                throw new DuplicateContantFoundException("Duplicate found "+ object);
            }
            ha.add(object);
        }
    }
}

