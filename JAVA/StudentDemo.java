import java.util.*;
import java.io.*;
class Main
{
    public static void main (String[ ] args)
    {
        double avg;
        Student s[ ] = new Student[3];
        s[0] = new Student ("Krishna","ACC001",90,99,89);
        s[1] = new Student ("Chaitanya","ACC002",91,94,90);
        s[2] = new Student ("Karthik","ACC003",95,85,80);
        avg = s[0].Average(90,99,89);
        s[0].details(avg);
        avg = s[1].Average(91,94,90);
        s[1].details(avg);
        avg = s[2].Average(95,85,80);
        s[2].details(avg);
    }
}
class Student 
{
    String name;
    String rollNumber;
    int math,che,phy;
    Student (String name,String rollNumber,int math,int che,int phy)
    {
        this.name=name;
        this.rollNumber=rollNumber;
        this.math=math;
        this.che=che;
        this.phy=phy;
    }
    double Average(int math,int che,int phy)
    {
        double avg;
        avg = (math + che + phy) / 3.0;
        return avg;
    } 
    void details(double avg)
    {
        System.out.println("Name :"+name);
        System.out.println("RollNumber :"+rollNumber);
        System.out.printf("Marks : %d,%d,%d\n",math,che,phy);
        System.out.println("Average Marks :"+avg);
        System.out.println( );
    }
}