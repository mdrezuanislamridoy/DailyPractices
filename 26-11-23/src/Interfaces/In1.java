package Interfaces;

public interface In1 {
    // interface can't have non abstract method ,, Interfaces methods won't have body
    // interface can't have any other access modifiers without public
    // all variables and methods are public static final by default 

    int a = 10; // public static final
    int a();
    void b();

    // interface can have static and default method . static and default method can have body <it only can after java version 8>

    static void sb(){
        System.out.println("hello boss");
    }
    default void sk(){
        System.out.println("This is sk");
    }

}
