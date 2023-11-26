package customExc;


class MyException extends Exception{

    public MyException(String string){
        super(string);
    }
}
public class os {
    public static void main(String[] args) {
        int i=0,j=0;

        try {
            j=4/1;
            if (i==0) {
                throw new MyException("Hello World");
            }
        } catch (MyException e) {
            System.out.println("Hello "+e.getMessage());
        }
    }
}
