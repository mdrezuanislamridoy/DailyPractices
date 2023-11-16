//4. Write a Java program to create a class called Employee with methods called work() and getSalary(). Create a subclass called HRManager that overrides the work() method and adds a new method called addEmployee().

package OOPs_Again.Inheritance.Practice;

class Employee{
    int salary;
    void work(){
        System.out.println("working");
    }
    Employee(int salary) {
        this.salary = salary;
    }
    int getSalary(){
        return salary;
    }
}

class HRManager extends Employee{
    
    HRManager(int salary){
        super(salary);
    }
    void addEmploye(){
        System.out.println("adding employee");
    }
}
public class q4 {
    public static void main(String[] args) {
       HRManager m= new HRManager(766);
       m.work();
       System.out.println(m.getSalary()); 
       m.addEmploye();
    }
}
