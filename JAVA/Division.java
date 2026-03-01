import java.util.*;
class Division
{
    public static int divide(int a,int b) throws ArithmeticException 
    {
        return a/b;
    }
    public static void main(string[ ] args)
    {
        try{
            int result = divide(10,0);
            System.out.println("Result :"+result);
        }catch(ArithmeticException e)
        {
            System.out.println("Exception caught :",+e.getMessage( ));
        }
        finally{
            System.ot.println("Finally block exection -- program closing ...");
        }
    }
}