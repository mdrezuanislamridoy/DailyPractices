import java.awt.*;
public class ff {
    public static void main(String[] args) {
        // Palindrome

        int a=121,b,c=0,temp=a;
        while(a>0){
            b=a%10;
            c= c*10+b;
            a=a/10;
        }
        if (c==temp) {
            System.out.println("Palindrome");
        }else{
            System.out.println("Not a palindrome");
        }



        int d=153,e,f=0,tem=d;
        while(a>0){
            e=d%10;
            f= f+(e*e*e);
            d=d/10;
        }
        if (f==tem) {
            System.out.println("Armstrong");
        }else{
            System.out.println("Not a Armstrong");
        }
    }
}
