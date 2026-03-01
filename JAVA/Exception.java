import java.util.*;
class Exception
{
    public static void main (String[ ] args)
    {
        int arr[ ]=new int[10];
        for (int i=0;i<10;i++)
        {
            arr[i]=1;
        }
        try{
            System.out.println(arr[11]);
        }catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println(e.getMessage( ));
        }
        try{
            int a=10/0;
        }catch(ArithmeticException e)
        {
            System.out.println(e.getMessage( ));
        }
        String b="abc";
        try{
            int c=Integer.parseInt(b);
        }catch(NumberFormatException e)
        {
            System.out.println(e.getMessage( ));
        }
    }
}