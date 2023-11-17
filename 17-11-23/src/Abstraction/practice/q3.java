//3. Write a Java program to create an abstract class BankAccount with abstract methods deposit() and withdraw(). Create subclasses: SavingsAccount and CurrentAccount that extend the BankAccount class and implement the respective methods to handle deposits and withdrawals for each account type.

package Abstraction;

abstract class BankAccount{
    abstract void deposit(int balance);
    abstract void withdraw(int amount);
}
class SavingsAccount extends BankAccount{

    private int balance;
    private int amount;


    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    void deposit(int bal) {
        balance+= bal;
        
    }

    @Override
    void withdraw(int amo) {
        if (balance-amo>=100) {
            balance -=amo;
        } else {
            System.out.println("in sufficiant found");
        }


    }
    void widBl(){
        System.out.println(balance);
    }

}
class mainAccount extends BankAccount{

    private int balance;
    private int amount;


    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    void deposit(int bal) {
        balance+= bal;
        
    }

    @Override
    void withdraw(int amo) {
        balance-=amo;


    }
    void widBl(){
        System.out.println(balance);
    }

}
public class q3 {
    public static void main(String[] args) {
        SavingsAccount savingsAccount= new SavingsAccount();
        savingsAccount.setBalance(52);
        savingsAccount.deposit(148);
        savingsAccount.withdraw(100);

        mainAccount mAccount= new mainAccount();
        
        mAccount.setBalance(354);
        mAccount.deposit(879);
        mAccount.withdraw(222);
        
        savingsAccount.widBl();
        mAccount.widBl();
    }
}
