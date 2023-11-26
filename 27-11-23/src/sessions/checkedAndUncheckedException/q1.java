package sessions.checkedAndUncheckedException;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class q1 {
    public static void main(String[] args) throws FileNotFoundException {
        // unchecked exception will give error while we compile code . but it is a run
        // time exception
        // ArithmaticException
        // ArrayIndexOutOfBoundException

        // checked exception can be idendify while compile time
        // Compiler will not give exception but it will warn for chance to getting
        // exception

        File abc = new File("D:\\Tutorial\\java\\code\\DailyPractices\\27-11-23\\src\\abc.txt");
        try {
            FileReader fr = new FileReader(abc);

        } catch (FileNotFoundException e) {

            System.out.println(e.getMessage());

        }
        System.out.println("its correct \n");

        File xyz = new File("D:\\Tutorial\\java\\code\\DailyPractices\\27-11-23\\src\\xyz.txt");
        try {
            FileReader fr = new FileReader(xyz);

        } catch (FileNotFoundException e) {

            System.out.println("Exception is " + e.getMessage());
        }
        System.out.println();

        // if path is proper then just works .. otherwise not work
        File yy = new File("D:\\Tutorial\\java\\code\\DailyPractices\\27-11-23\\src\\abc.txt");
        FileReader fr = new FileReader(yy);
        System.out.println(fr);

        System.out.println();
        // File zz = new
        // File("D:\\Tutorial\\java\\code\\DailyPractices\\27-11-23\\src\\yz.txt");
        // FileReader fk= new FileReader(zz);

        // System.out.println("hello");

        // we can also use it
        FileReader ff = new FileReader(new File("D:\\Tutorial\\java\\code\\DailyPractices\\27-11-23\\src\\abc.txt"));
        System.out.println(ff);

    }
}
