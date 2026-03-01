import java.util.*;
public class GenericDemo
{
    public static void main (String[ ] args)
    {
        Test<String,Integer> p = new Test<String,Integer>("Krishna",1609);
        Test<Integer,String> p1 = new Test<Integer,String>(201,"chaitanya");
        p.display( );
        p1.display( );
    }
}
class Test<T,U>
{
    T item1;
    U item2;
    Test(T item1,U item2)
    {
        this.item1=item1;
        this.item2=item2;
    }
    public void display( )
    {
        System.out.println(item1);
        System.out.println(item1.getClass().getName());
        System.out.println(item2);
        System.out.println(item2.getClass().getName());
    }
}
