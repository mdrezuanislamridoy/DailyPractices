public class App {
    public static void main(String[] args) throws Exception {
        try {
            if (10!=20) {
                System.out.println("10");
                throw new Exx("Wrong");
           
            }else{
                System.out.println("nothing");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            System.out.println("muri kha");
        }
    }
}
class Exx extends Exception{
    public Exx(String s){
        super(s);
    }
}
