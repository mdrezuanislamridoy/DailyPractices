public class app {
    public static void main(String[] args) {
        int a= 4,b=4,c=1;
        double d= (b*b)-(4*a*c);

        if (d>0) {
            double x1= (-b + Math.sqrt(d))/(2*a); 
            double x2= (-b - Math.sqrt(d))/(2*a);
            System.out.println(x1); 
            System.out.println(x2); 
        }
        else if(d==0){
            double x= -b/(2*a);
            System.out.println(x);
        }
        else{
            System.out.println("invalid");
        }
        
    }
}
