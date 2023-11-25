package constr;

public class const2 extends const1{
    
    const2(){
        
        
        System.out.println("bolo world");
    }
    const2(int b){
        super(7);
        System.out.println("bolo2");
    }

    void ssy(){
        System.out.println("hola");
    }
    const2 returnVal(){  // to return all variable from a class
        return this;
    }
}
