package ArrQue;

class ARA {

    String name;
    int roll;
    ARA(String name,int roll){
        this.name= name;
        this.roll = roll;
    }
}
public class Q2 {
    public static void main(String[] args) {
        ARA[] arr;
        arr = new ARA[5];
        arr[0]= new ARA("Ridoy ", 611760);
        arr[1]= new ARA("Babu ", 611660);
        arr[2]= new ARA("Ok ", 611667);
        arr[3]= new ARA("Good ", 631667);
        arr[4]= new ARA("Boy ", 656667);
        for (int i = 0; i < arr.length; i++) {
            System.out.println( arr[i].name+arr[i].roll);
        }
    }
}
