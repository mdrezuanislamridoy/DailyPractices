//4. Write a Java program to create a class called Employee with private instance variables employee_id, employee_name, and employee_salary. Provide public getter and setter methods to access and modify the id and name variables, but provide a getter method for the salary variable that returns a formatted string.

package Encapsulation.Practice;

class Employee{
    private int employee_id;
    private String employee_name;
    private int employee_salary;
    public int getEmployee_id() {
        return employee_id;
    }
    public void setEmployee_id(int employee_id) {
        this.employee_id = employee_id;
    }
    public String getEmployee_name() {
        return employee_name;
    }
    public void setEmployee_name(String employee_name) {
        this.employee_name = employee_name;
    }
    public int getEmployee_salary() {
        return employee_salary;
    }

    
}
public class q4 {
    public static void main(String[] args) {
        Employee e = new Employee();
        e.setEmployee_id(7645478);
        e.setEmployee_name("Ridoy");

        System.out.println(e.getEmployee_id());
        System.out.println(e.getEmployee_name());
        System.out.println(e.getEmployee_salary());
    }
}
