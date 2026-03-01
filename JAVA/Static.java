class Test
{
    static int count=0;
    int value;
    Test (int value)
    {
        this.value=value;
        count++;
    }
    void display( )
    {
        System.out.println(value +"count is"+count);
    }
}
public class static
{
    public static void main (String[ ] args)
    {
        Test t1 = new Test (1);
        t1.display( );
        Test t2 = new Test (2);
        t2.display( );
    }
}