import java.util.*;
import java.util.Scanner;
public class StringCount
{
    public static void main (String[ ] args)
    {
        Scanner sc = new Scanner(System.in);
        String x = sc.nextLine( );
        sc.close( );
        int vowels=0;
        int consonants=0;
        int digits=0;
        int specialChars=0;
        for(int i=0;i<x.length( );i++)
        {
            char ch = x.charAt(i);
            if(isLetter(ch))
            {
                char lower = Character.toLowerCase(ch);
                if(lower == 'a' || lower == 'e' || lower == 'i' || lower == 'o' || lower == 'u')
                {
                    vowels++;
                }
                else
                {
                    consonants++;
                }
            }
            else if(ch >= '0' && ch<= '9')
            {
                digits++;
            }
            else{
                specialChars++;
            }
        }
        System.out.println("vowels :"+vowels);
        System.out.println("consonants :"+consonants);
        System.out.println("Digits :"+digits);
        System.out.println("SpecialCharacters :"+specialChars);
    }
    public static boolean isLetter(char ch)
    {
        if (ch >= 'A' && ch <= 'Z' || ch >= 'a' && ch <= 'z')
        {
            return true;
        }
        return false;
    }
}