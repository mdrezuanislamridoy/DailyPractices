package ArrQue;
class Students{
    String name;
    int age;
    Students(String name, int age){
        this.name= name;
        this.age= age;
    }
}
public class Arry {
    public static void main(String[] args) {
        Students[] ss ={new Students("Ridoy ", 18), new Students("Babu ", 17)};
        for (int i = 0; i < ss.length; i++) {
            System.out.println(ss[i].name+ ss[i].age);
        }
        
    }
}
