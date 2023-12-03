package ArrQue;

public class ReverseStr {
    public static void main(String[] args) {
        String[] arr= {"Ridoy","Babu","Kola", "Khabu"};

        for (int i = 0; i < arr.length/2; i++) {
            String temp = arr[i];
            arr[i] = arr[arr.length-1-i];
            arr[arr.length-1-i]= temp;
            
        }
        for (String string : arr) {
            System.out.println(string);
        }
    }
}
