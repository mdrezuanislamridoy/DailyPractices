//2. Write a Java program to create a class called BankAccount with private instance variables accountNumber and balance. Provide public getter and setter methods to access and modify these variables.


package Encapsulation.Practice;

class BankAccount{
    private long accountNumber;    
    private int balance;
    public long getAccountNumber() {
        return accountNumber;
    }
    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }
    public int getBalance() {
        return balance;
    }
    public void setBalance(int balance) {
        this.balance = balance;
    }    

    
}
public class q2 {
    public static void main(String[] args) {
        BankAccount ba= new BankAccount();

        ba.setAccountNumber(76876837532L);
        ba.setBalance(23434);

        System.out.println(ba.getAccountNumber());
        System.out.println(ba.getBalance());
    }
}
