//5. Write a Java program to create a class known as "BankAccount" with methods called deposit() and withdraw(). Create a subclass called SavingsAccount that overrides the withdraw() method to prevent withdrawals if the account balance falls below one hundred.

package OOPs_Again.Inheritance.Practice;

class BankAccount{
    int balance;
    BankAccount(int balance){
        this.balance=balance;
    }
    int deposit(int dep){
        return balance+=dep;
    }
    void withdraw(int amnt){
        if (balance>amnt) {
            balance-=amnt;
        } else {
            System.out.println("invalid amount");
        }
        
    }
    int getBalance(){
        return balance;
    }
}

class SavingsAccount extends BankAccount{

    SavingsAccount(int balance) {
        super(balance);
    }
    @Override
    void withdraw(int amnt) {
        if (getBalance()-amnt>100) {
            super.withdraw(amnt);
        } else {
            System.out.println("insuficiend fund");
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
