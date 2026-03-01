import java.util.*;
class Employee
{
    String name;
    String id;
    Employee(String name,String id)
    {
        this.name=name;
        this.id=id;
    }
    void display( )
    {
        System.out.println("Name :"+name);
        System.out.println("ID :"+id);
    }
}
class Salary extends Employee
{
    double basicPay;
    double HRA,DA,grossPay;
    Salary(String name,String id,double basicPay)
    {
        super(name,id);
        this.basicPay=basicPay;
    }
    public double Calculate( )
    {
        DA=0.3 * basicPay;
        HRA=0.8 * basicPay;
        grossPay = HRA+DA+basicPay;
        return grossPay;
    }
    void display1( )
    {
        super.display( );
        System.out.println("The Total Gross Pay :"+Calculate( ));
    }
}
public class Employee
{
    public static void main (String[ ] args)
    {
        Salary s = new Salary("Krishna","ACC16",10000);
        s.display1( );
    }
}