//Create a class named 'Student' with String variable 'name' and integer variable 'roll_no'. Assign the value of roll_no as '2' and that of name as "John" by creating an object of the class Student.

package questions;

class Student{
    String name;
    int roll_no;

    void details(String name , int roll_no){
        this.name= name;
        this.roll_no= roll_no;
    }
    void show(){
        System.out.println("name "+ name);
        System.out.println("roll no "+ roll_no);
    }
}
public class q2 {
    public static void main(String[] args) {
        Student s= new Student();
        s.details("John",2);
        s.show();
    }
}
