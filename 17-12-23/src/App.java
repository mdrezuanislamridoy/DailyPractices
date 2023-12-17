public class App {
    public static void main(String[] args) throws Exception {
        int aaa[]= {3,4,5,6,2,4,7};

        for (int i = 0; i < aaa.length/2; i++) {
            int temp= aaa[i];
            aaa[i] = aaa[aaa.length-i-1];
            aaa[aaa.length-i-1]= temp;
        }
        for (int i = 0; i < aaa.length; i++) {
            System.out.println(aaa[i]);
        }
    }
}
