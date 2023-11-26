package sessions.checkedAndUncheckedException;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class finallyBlock {
    public static void main(String[] args) throws IOException {
        // Finaally uses with try catch block

        // if catch block exicutes or not . finally will always exicute

        

        try {
            int a= 10/0;
            System.out.println(a);
        } catch (Exception e) {
            System.out.println("inside catch block");
        }finally{
            System.out.println("it will always exicutes");
        }

        System.out.println();

        File fr= new File("D:\\Tutorial\\java\\code\\DailyPractices\\27-11-23\\src\\abc.txt");;
        FileReader ff= null;

        try {
            ff= new FileReader(fr);
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            if (ff!= null) {
                ff.close();
            }
        }
    }
}
