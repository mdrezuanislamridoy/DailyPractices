//Assign and print the roll number, phone number and address of two students having names "Sam" and "John" respectively by creating two objects of class 'Student'.

package questions;

class Std {
    String name;
    int roll_no;
    long phone;
    String address;

    void det(String name, int roll_no, long phone,String address) {
        this.name = name;
        this.phone = phone;
        this.roll_no = roll_no;
        this.address= address;
    }

    void see() {
        System.out.println("name " + name);
        System.out.println("Phone is "+ phone);
        System.out.println("roll no " + roll_no);
        System.out.println("Address is "+ address);
    }
}

public class q3 {
    public static void main(String[] args) {
        Std s1= new Std();
        s1.name =" sam";
        s1.roll_no= 1;
        s1.phone = 1726374445L;
        s1.address ="Kurigram";
        s1.see();
        
        System.out.println();

        Std s2= new Std();
        s2.name =" john";
        s2.roll_no= 2;
        s2.phone = 1726374445L;
        s2.address ="Rangpur";
        s2.see();

    }
}
