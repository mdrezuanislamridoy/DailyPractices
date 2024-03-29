////7. Write a Java program to create a class known as Person with methods called getFirstName() and getLastName(). Create a subclass called Employee that adds a new method named getEmployeeId() and overrides the getLastName() method to include the employee's job title.

package OOPs_Again.Inheritance.Practice;

class Person {
    private String fname;
    private String lname;

    public Person(String fname, String lname) {
        this.fname = fname;
        this.lname = lname;
    }

    public String getFirstName() {
        return fname;
    }

    public String getLastName() {
        return lname;
    }
}

class Emmployee extends Person {
    private int id;
    private String title;

    public Emmployee(String fname, String lname, int id, String title) {
        super(fname, lname);
        this.id = id;
        this.title = title;
    }

    public int getEmployeeId() {
        return id;
    }

    @Override
    public String getLastName() {
        return super.getLastName() + " " + title;
    }
}

public class q6 {
    public static void main(String[] args) {
        Emmployee e = new Emmployee("Ridoy ", "Babu", 1818, "programmer");
        System.out.print(e.getFirstName());
        System.out.println(e.getLastName());
        System.out.println(e.getEmployeeId());
    }
}
