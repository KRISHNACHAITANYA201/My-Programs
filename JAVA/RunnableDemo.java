import java.util.*;
class NumberPrinter implements Runnable
{
    public void run ( )
    {
        for(int i=1;i<=50;i++)
        {
            System.out.println(i);
        }
    }
}
public class RunnableDemo
{
    public static void main (Strin[ ] args)
    {
        Thread t1 = new Thread(new NumberPrinter( ));
        t1.start( ) ;
    }
}