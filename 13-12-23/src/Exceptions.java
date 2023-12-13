public class Exceptions {
    public static void main(String[] args)  {
        try {
            ee(4, 2);
        } catch (MyException e) {
            System.out.println("exception is: "+ e.getMessage());
        }
        
    }

    static void ee(int a , int b) throws MyException{
        if (a+b<11) {
            throw new MyException("Ghumao");
        } else {
            
        }
    }
}
class MyException extends Exception {
    MyException(String e) {
        super(e);
    }
}
