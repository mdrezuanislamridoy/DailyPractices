package sessions.checkedAndUncheckedException;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class throws_keyword {
    public static void main(String[] args)  {
        a();
    }

    //handling exception
    public static void a() {
        try {
            b();
        } catch (FileNotFoundException e) {
           
            e.printStackTrace();
        }
    }
    public static void b() throws FileNotFoundException{
        c();
    }
    public static void c() throws FileNotFoundException{
        FileReader ff = new FileReader(new File("D:\\Tutorial\\java\\code\\DailyPractices\\27-11-23\\src\\abc.txt"));
    }


    // ignoring exception

    // public static void a() throws FileNotFoundException{
    //     b();
    // }
    // public static void b() throws FileNotFoundException{
    //     c();
    // }
    // public static void c() throws FileNotFoundException{
    //     FileReader ff = new FileReader(new File("D:\\Tutorial\\java\\code\\DailyPractices\\27-11-23\\src\\abc.txt"));
    // }
}
