//5. Write a Java program to create a class known as "BankAccount" with methods called deposit() and withdraw(). Create a subclass called SavingsAccount that overrides the withdraw() method to prevent withdrawals if the account balance falls below one hundred.

package OOPs_Again.Inheritance.Practice;

class BankAccount{
    int PresentAm;
    BankAccount(int PresentAm){
        this.PresentAm= PresentAm;
    }
    int deposit(int dip){
        return PresentAm = PresentAm+dip;
    }
    void withdraw(double amount) {
        if (PresentAm >= amount) {
            PresentAm -= amount;
        } else {
            System.out.println("Insufficient balance");
        }

        }
        double getBalance() {
        return PresentAm;
    }
}
class SavingsAccount extends BankAccount{

    SavingsAccount(int PresentAm) {
        super(PresentAm);
    }
    public void withdraw(double amount) {
        if (getBalance() - amount < 100) {
            System.out.println("Minimum balance of $100 required!");
        } else {
            super.withdraw(amount);
        }
    }
    
}
public class q5 {
    public static void main(String[] args) {
        SavingsAccount sAccount= new SavingsAccount(333);
        sAccount.withdraw(33);
        System.out.println(sAccount.getBalance());   
    }
}
