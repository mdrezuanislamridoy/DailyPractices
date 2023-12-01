package qs;

public class HandleEx {

    public static void main(String[] args) {
        try {
            String str= "Thnk fr tt";
            Excep(str);
            System.out.println("Vowel Found");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void Excep(String val) throws NoVowelException{
        boolean fi= false;
        String ss= "aeiouAEIOU";
        for (int i = 0; i < val.length(); i++) {
            char ch= ss.charAt(i);
            if (val.contains(String.valueOf(ch))) {
                fi= true;
                break;
            }
        }
        if (!fi) {
            throw new NoVowelException("No vowel here");
        }
    }
}