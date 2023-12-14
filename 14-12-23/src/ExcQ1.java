//7. Write a Java program to create a method that takes a string as input and throws an exception if the string does not contain vowels.
public class ExcQ1 {
    public static void main(String args[]) {
        try {
            ss();
        } catch (ValueNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }

    static void ss() throws ValueNotFoundException {
        String s = new String("This is a bolod");

        boolean b = false;
        String ch = new String("aeiouAEIOU");

        for (int i = 0; i < s.length(); i++) {
            char cc = s.charAt(i);
            if (ch.contains(String.valueOf(cc))) {
                b = true;
                break;
            }

        }
        if (!b) {
            throw new ValueNotFoundException("We Are Coming Exception");

        }
    }
}

class ValueNotFoundException extends Exception {
    ValueNotFoundException(String s) {
        super(s);
    }
}