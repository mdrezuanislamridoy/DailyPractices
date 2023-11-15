public class labeldbreak {
    public static void main(String[] args) {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (i==2) {
                    break;  //unlabeled break
                }
                System.out.print("^");
            }
            System.out.println();
        }
        
        System.out.println("----------------");

        ridoy:for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (i==2) {
                    break ridoy;  //labeled break
                }
                System.out.print("^");
            }
            System.out.println();
        }
    }
}
