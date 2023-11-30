import java.util.Comparator;

public class ClassA implements Comparator{

    @Override
    public int compare(Object o1, Object o2) {
        // Integer i1= (Integer) o1;
        // Integer i2 = (Integer) o2;

        //return i1.compareTo(i2); //Assending order 

        // return i2.compareTo(i1);  //Desending Order

        // return 1;  //Default Comparing
        // return -1;  //Default Comparing reverse

        String ss= (String) o1;
        String sk= (String) o2;

        // return ss.compareTo(sk); //Alphabetical Order
        //return sk.compareTo(ss); //Reverse alphabatical Order
         //Same as Integer

         return 1;


    }
    
}
