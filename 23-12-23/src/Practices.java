//Write a program to count the number of vowels in a string.

public class Practices {
    


    /* 
    public static void main(String[] args) throws Exception {
        vowel("Its me the vowel");
        
    }

    static void vowel(String vs){
        String vo= "aeiouAEIOU";
        int count=0;
        for (int i = 0; i < vs.length(); i++) {
            char ca= vs.charAt(i);
            if (vo.contains(String.valueOf(ca))) {
                count++;
            }
        }
        System.out.println(count);

    }

    */

    //Create a program to remove duplicate characters from a string.

    public static void main(String[] args) {
        dup("Hello World");
    }
    static void dup(String s){
         String c="";
        for (int i = 0; i < s.length(); i++) {
            char a= s.charAt(i);
           

            if (c.contains(String.valueOf(a))) {
                continue;
            }else{
                c=c+a;
            }
            
        }
        System.out.println(c);
    }
}
