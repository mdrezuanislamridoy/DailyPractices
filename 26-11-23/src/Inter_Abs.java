import abstractions.*;
import Interfaces.*;

public class Inter_Abs extends A1 implements In1,In2{  // normal class can enxends single method and multiple Interfaces

    @Override
    public int a() {
        return 1;
    }

    @Override
    public void hola() {
        System.out.println("Its Hola");
    }

    @Override
    public void b() {
        System.out.println("Good night");
    }
    
}
