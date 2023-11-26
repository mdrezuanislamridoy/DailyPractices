package projects;

import java.util.Scanner;

public class mark {

    static int[] roll = { 1122, 2233, 4455, 4433, 5432 };
    static int[] reg = { 2223334, 3232325, 4433221, 5544554, 6655443 };
    static double[] result = { 4.55, 5.00, 4.99, 3.44, 5.00 };
    static int a, b;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String c;
        do {
            System.out.print("enter roll ");
            a = sc.nextInt();
            System.out.print("enter registration ");
            b = sc.nextInt();
            printR(a, b);
            
            System.out.println("do you want more select y for yes and any key for no");
            c = sc.next();
        } while (c.equals("y"));

    }

    public static void printR(int n, int y) {

        boolean found = false;

        for (int i = 0; i < roll.length; i++) {
            if (n == roll[i] && y == reg[i]) {
                System.out.println(result[i]);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("wrong input");
        }
    }
}
