import java.util.Scanner;
class Palondrome
{
    public static void main (String[ ] args)
    {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter a String :");
        String x = sc.nextLine( );
        sc.close( );
        if(isPalindrome(x))
        {
            System.out.println("Given String "+ x +" is Palindrome");
        }
        else 
        {
            System.out.println("Given String "+ x +" is Not a Palindrome");

        }
    }
    public class boolean isPalindrome(String x)
    {
        int left=0;
        int right=x.length( ) - 1;
        while(left < right)
        {
            if(x.charAt(left)!=x.charAt(right))
            {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}