package Arra;

public class objArr {
    public static void main(String[] args) {
        // different things cannot assign in a single array
        // int[] a ={2.4,5,"hello",true};

        // object array can store it

        // Object class is the root/super_class of all class 

        Object[] a = { 5, 66, 7.4, "ami", "asi" };

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
