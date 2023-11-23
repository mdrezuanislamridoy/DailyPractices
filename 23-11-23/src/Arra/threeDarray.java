package Arra;


public class threeDarray {

    public static void main(String[] args) {
        int[][][] a = {{{1,3,4,5},{3,4,6,7}},{{4,5,6,7},{1,6,3,4}}};

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                for (int j2 = 0; j2 < a[0][0].length; j2++) {
                    System.out.print(a[i][j][j2]);
                }
                System.out.println();
            }
        }
        // for new line
        System.out.println();

        // for each to access 3d array
        for (int[][] is : a) {
            for (int[] is2 : is) {
                for (int is3 : is2) {
                    System.out.print(is3);
                }
                System.out.println();
            }
        }
    }
}