package Object;

// using class 

class Cl{
    int sum;
    public int tot(int a,int b){
        sum = a+b;
        return sum;
    }
    void prin(){
        System.out.println(sum);
    }
}

public class Obj {
    public static void main(String[] args) {
        // without class 

        // int a,b;
        // a=4;b=5;
        // System.out.println(a+b);

        
        // using class 

        Cl cl = new Cl();    //Cl is a class and cl is reference variable Cl() is object
        cl.tot(3, 5);
        cl.prin();
    }
}
