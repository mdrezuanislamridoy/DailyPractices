public class PatternProblem {
    public static void main(String[] args) {
        // Problem 1

        for (int i = 0; i < 5; i++) {
        for (int j = 0; j < 5; j++) {
        System.out.print("* ");
        }
        System.out.println();
        }


        //Problem 2

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (i == 0 || i == 3 || j == 0 || j ==3) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
                
            }
            System.out.println();
        }

        //Problem 3
        for (int i = 1; i < 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        //Problem 4
        for (int i = 4; i >0 ; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }System.out.println();
        }

        // Problem 5;
        for (int i = 1; i < 5; i++) {
            for (int j = 0; j < 4-i; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }

        //Problem 6;
        for (int i = 1; i < 6; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }System.out.println();
        }

        //Problem 7
        for (int i = 5; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print(j);
            }System.out.println();
        }

        // Problem 8
        int n= 1;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                
                System.out.print((n++) + " ");
            }System.out.println();
        }

        //Problem 9
        int num= 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                if (num%2==0) {
                    System.out.print(1);
                }else{
                    System.out.print(0);
                }
                num++;
            }
            System.out.println();
        }

        //Problem 10;
        for (int i = 0; i <= 5; i++) {
            for (int j = (5-i); j > 0; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= 5; j++) {
                System.out.print("x");
            }System.out.println();
        }

        //Problem 11;
        for (int i = 0; i <= 5; i++) {
            for (int j = 5-i; j > 0; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print(i+ " ");
            }
            System.out.println();
        }

        // Problem 12
        for (int i = 0; i < 6; i++) {
            for (int j = 5-i; j > 0; j--) {
                System.out.print(" ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            for (int j = 2; j <=i ; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

        // Problem 13
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            for (int j = 0; j < (2*(5-i)); j++) {
                System.out.print("  ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();

        }
        for (int i = 5; i >0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            for (int j = 0; j < (2*(5-i)); j++) {
                System.out.print("  ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();

        }
        
    }
}
