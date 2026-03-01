import java.util.*;
class Even extends Thread
{
    public void run ( )
    {
        for (int i=2;i<=100;i=i+2)
        {
            System.out.println("Even :"+i);
        }
    }
}
class Odd extends Thread
{
    public void run ( )
    {
        for(int i=1;i<=100;i=i+2)
        {
            System.out.println("Odd :"+i);
        }
    }
}
public class MultiThreading
{
    public static void main (String[ ] args)
    {
        Thread t1 = new Thread (new Even( ));
        Thread t2 = new Thread (new Odd( ));
        t1.start( );
        t2.start( );
    }
}