import java.util.*;
class Student
{
    String usn;
    String name;
    int marks[]=new int[5];
    double perc;


    void input()
    {
        System.out.println("Enter usn: ");
        Scanner sc=new Scanner(System.in);
        usn=sc.nextLine();
        System.out.println("Enter name: ");
        name=sc.nextLine();
        System.out.println("Enter marks :");
        for(int i=0;i<5;i++)
        {
            marks[i]=sc.nextInt();
        }
    }

    public void percentage()
    {
        int total=0;
        for(int i=0;i<5;i++)
        {
            total=total+marks[i];
        }
        perc=(double)total/500*100;
    }

    void display()
    {
        System.out.println("STUDENT DETAILS:");
        System.out.println("USN: "+usn );
        System.out.println("NAME: "+name);
        System.out.println("MARKS OBTAINED: ");
        for(int i=0;i<5;i++)
        {
            System.out.println(marks[i]);
        }
        System.out.println("PERCENTAGE: " + perc);
    }
}

class Arr
{
    public static void main(String args[])
    {
        System.out.println("BHOOMIKA HEGDE \n1BM22CS342 ");
        Student s1=new Student();
        s1.input();
        s1.percentage();
        s1.display();
    }
        
}