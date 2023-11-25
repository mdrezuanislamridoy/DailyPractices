package constr.ques;

public class largestNumFromArr {
    public static void main(String[] args) {
        int[] a= {5,6,7,4,7,5};
        int max=0;
        for (int i = 0; i < a.length; i++) {
            if (max<a[i]) {
                max=a[i];
            } 
        }System.out.println(max);
    }
}
