//Write a Java program to create a method that reads a file and throws an exception if the file is not found.

package sessions.questions;

import java.io.File;
import java.io.FileReader;

public class Q2 {
    public static void main(String[] args) {
        readFile();
    }

    public static void readFile(){
        File f= new File("D:\\Tutorial\\java\\code\\DailyPractices\\27-11-23\\src\\abc.txt");
        FileReader fr;

        try {
            fr= new FileReader(f);
            System.out.println("file is available");
        } catch (Exception e) {
            System.out.println("Exception is basic");
        }
    }
}




/*
or
 *
 * import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class File_Read {
  public static void main(String[] args) {
    try {
      readFile("test1.txt");
    } catch (FileNotFoundException e) {
      System.out.println("Error: " + e.getMessage());
    }
  }

  public static void readFile(String fileName) throws FileNotFoundException {
    File file = new File(fileName);
    Scanner scanner = new Scanner(file);

    // Read and process the contents of the file
    while (scanner.hasNextLine()) {
      String line = scanner.nextLine();
      System.out.println(line);
    }

    scanner.close();
  }
}
 
 * 
 */
