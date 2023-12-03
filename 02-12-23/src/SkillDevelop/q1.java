package SkillDevelop;
abstract class A
{
    {
        System.out.println("Interface A");
    }
     
    static
    {
        System.out.println("Interface A");
    }
}
public class q1 {
    public static void main(String[] args) {
        A a= new A(){
            
        };
        
    }
}
