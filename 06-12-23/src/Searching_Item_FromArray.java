import java.util.Arrays;

public class Searching_Item_FromArray {
    public static void main(String[] args) throws Exception {
        int arr[] ={1,3,4,8,6,4,3,3};
        
        // Arrays.sort(arr);
        
        // System.out.println(Arrays.binarySearch(arr, 4));

        // //Linear search
        // int c= 0;
        // int item= 8;
        // for (int i = 0; i < arr.length; i++) {
        //     if (arr[i]==item) {
        //         c+= 1;
        //         System.out.println("Item found at " + i);
        //     }
        // }
        // if (c==0) {
        //     System.out.println("Not found");
        // }

        //Binary Search

        Arrays.sort(arr);

        
        int item= 6;
        int n= arr.length; 
        int r= n-1;
        int aa= bin(arr, 0, r, item);
        if (aa==-1) {
            System.out.println("not found");
        }else{
            System.out.println(aa);
        }
    }

    static int bin(int arr[], int l, int r, int x){
        l=0;
        
        while (l<=r) {
            int mid = r/2;
            if (arr[mid]==x) {
                return mid;
            }else if (arr[mid]>x) {
                r= mid-1;
            } else {
                l= mid+1;
            }
        }
        return -1;
    }
}
