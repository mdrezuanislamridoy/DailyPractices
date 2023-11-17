//6. Write a Java program to create a class called Car with private instance variables company_name, model_name, year, and mileage. Provide public getter and setter methods to access and modify the company_name, model_name, and year variables. However, only provide a getter method for the mileage variable

package Encapsulation.Practice;

class Car{
    private String company_name;
    private String model_name;
    private int year;
    private int mileage;
    public String getCompany_name() {
        return company_name;
    }
    public void setCompany_name(String company_name) {
        this.company_name = company_name;
    }
    public String getModel_name() {
        return model_name;
    }
    public void setModel_name(String model_name) {
        this.model_name = model_name;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public int getMileage() {
        return mileage;
    }

    
}
public class q6 {
    public static void main(String[] args) {
        Car car= new Car();
        car.setCompany_name("RR_Kingdom");
        car.setModel_name("R1-234k");
        car.setYear(2023);
        
        System.out.println(car.getCompany_name());
        System.out.println(car.getModel_name());
        System.out.println(car.getYear());
        System.out.println(car.getMileage());
    }
}
