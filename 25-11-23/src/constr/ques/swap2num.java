package constr.ques;

public class swap2num {
    public static void main(String[] args) {
        int a=5,b=3,c;

        // c=a;a=b;b=c;
        // System.out.println(a);
        // System.out.println(b);



        //swap without third variable

        
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println(a);
        System.out.println(b);
    }
}
