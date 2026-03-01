import java.util.ArrayList;
import java.util.Scanner;
public class Student
{
    public static void main (String[ ] args)
    {
        ArrayList<String> s = new ArrayList< >( );
        scanner sc = new Scanner (System.in);
        int choice;
        do{
            System.out.println("1.Insert Student");
            System.out.println("2.Delete Student");
            System.out.println("3.Search Student");
            System.out.println("4.Display Students");
            System.out.println("5.Exit");
            System.out.print("Enter your choice :");
            choice = sc.nextInt ( );
            sc.nextLine( );
            switch(choice)
            {
                case 1:
                    System.out.print("Enter Student name to insert :");
                    String x = sc.nextLine( );
                    s.add(x);
                    System.out.println("Student added Successfully");
                    break;
                case 2:
                    System.out.print("Enter Student Name to delete :");
                    String y = sc.nextLine ( );
                    if (s.remove(y))
                    {
                        System.out.println("Student deleted Successfully!");
                    }
                    else
                    {
                        System.out.println("Student not Found.");
                    }
                    break;
                case 3:
                    System.out.println("Enter Name to search : ");
                    String name=sc.nextLine( );
                    if(s.contains(name))
                    {
                        int index=s.IndexOf(name);
                        System,out.println("Name is FOund at index : "+index);
                    }
                    else 
                    {
                        System.out.println("Name is Not Found");
                    }
                case 4:
                    Arrays.sort(s);
                    System.out.println("After Sorting the array is : "+Arrays.toString(s));  
            }
        }
    }
}