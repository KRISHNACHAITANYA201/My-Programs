import java.util.*;
public class MainBank
{
    public static void main(String[ ] args)
    {
        BankAccount b1 = new BankAccount("Krishna",1000);
        b1.deposit(500);
        b1.withdraw(1000);
        b1.withdraw(1000);
        b1.display( );
    }
}
class BankAccount 
{
    String name;
    double balance;
    BankAccount(String name,double balance)
    {
        this.name=name;
        this.balance=balance;
    }
    void deposit(int amount)
    {
        balance += amount;
        System.out.println("deposited :"+amount);
    }
    void withdraw(int amount)
    {
        if(amount>balance)
        {
            System.out.println("Insufficient BAlance!");
        }
        else
        {
            balance -= amount;
            System.out.println("Withdraw :"+amount);
        }
    }
    void display( )
    {
        System.out.println("Total balance in account : "+balance);
    }
}