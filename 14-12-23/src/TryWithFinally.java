import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TryWithFinally {
    public static void main(String[] args) throws IOException {

        // try with finally uses for closing anything


        // BufferedReader bf= null;
        // try{
        //     bf= new BufferedReader(new InputStreamReader(System.in)); // input using BufferdReader and InputStream in single line
        //     int s=Integer.parseInt( bf.readLine());
        //     System.out.println(s);
        // }finally{
        //     bf.close();
        // }


        /** Instead of using this one we can use try only */

        try(BufferedReader bff= new BufferedReader(new InputStreamReader(System.in))){
            int br= Integer.parseInt(bff.readLine());
            System.out.println(br);

        }
    }
}
