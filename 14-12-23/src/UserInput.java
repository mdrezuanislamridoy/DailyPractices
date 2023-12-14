import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) throws IOException {
        System.out.println("Enter a number");
        // as well as we can print using Syster.out , there should be a method to read or in

        /*
        // we can try 
        // it returns int type value
        int s= System.in.read();  // This will return an asci value of the number
        System.out.println(s);
        System.out.println(s-48); we can manage it . but it is not the proper way

        */
/*

        // so what we can do now is

        // We can use InputStream && BufferdReader 
        InputStreamReader inn= new InputStreamReader(System.in);
        BufferedReader bf= new BufferedReader(inn);
        int num =Integer.parseInt(bf.readLine());
        System.out.println("Number is "+num);

        bf.close();  // closing is good practice


*/

        //Here is a alternative

        Scanner sc= new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("Number is "+ num);

    }
}
