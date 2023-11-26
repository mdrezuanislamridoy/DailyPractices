package sessions.checkedAndUncheckedException;

public class throwAndThrows {
    public static void main(String[] args) throws InterruptedException {
        //throw
        //int a= 5;

        int a= 8;
        if (a<7) {
            try {

                //throw for creating exception
                throw new Exception("exception here");
            } catch (Exception e) {
                
                e.printStackTrace();
            }
        }

        System.out.println();
        if (a>7) {
            System.out.println("Hello world");
        }





        //throws ..... to ignore any checked exception

        Thread.sleep(2333);
    }
}
