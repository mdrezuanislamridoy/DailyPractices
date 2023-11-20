package Array.learn;

public class _2dArray {
    public static void main(String[] args) {
        int a[][] = {
            {4,5,6,7},
            {4,3,2,1}
        };
        int b[][] = {  // jagged array,,,,,,,,, not fixed
            {4,5,6,7,8},
            {4,3,2,1}
        };

        for (int i = 0; i < 2; i++) {  // row
            for (int j = 0; j < 4; j++) {  //collumn
                System.out.print(a[i][j]);
            }
            System.out.println();
        }
        System.out.println();

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < b[i].length; j++) {
                System.out.print(b[i][j]);
            }
            System.out.println();
        }
    }
}
