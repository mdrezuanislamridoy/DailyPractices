package ArrQue;

public class Q1 {
    public static void main(String[] args) {
        int arr[] = { 1, 3, 4, 5, 6, 2 };

        int start = 0, end = arr.length - 1;

        // while loop for reversing array
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;

        }
        // for printing array
        for (int i : arr) {
            System.out.println(i);
        }

    }
}
