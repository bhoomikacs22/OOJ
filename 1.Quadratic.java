import java.util.*;
import java.math.*;
class Quad
{
    int a,b,c;
    double r1,r2,d;
    void input()
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the coefficients a,b,c:");
        a=s.nextInt();
        b=s.nextInt();
        c=s.nextInt();
    }

    void compute()
    {
        if(a==0)
        {
            System.out.println("Invalid input");
        }
        else
        {
            d=(double)((b*b)-(4*a*c));
            if(d==0)
            {
                r1=r2=(-b/(2*a));
                System.out.println("Roots are real and equal");
                System.out.println("Root 1 and 2 are :" +r1 +" "+ r2);
            }
            else if(d>0)
            {
                r1=(-b+(Math.sqrt(d))/(double)(2*a));
                r2=(-b-(Math.sqrt(d))/(double)(2*a));
                System.out.println("Roots are real and distinct \n");
                System.out.println("root 1:"+r1+"\n");
                System.out.println("root 2:"+r2+"\n");
            }
            else
            {
                r1=(-b/(double)(2*a));
                System.out.println("Roots are imaginary\n");
                System.out.println("root 1="+ r1+ "+"+ Math.sqrt(-d)/(double)(2*a)+ "i \n");
                System.out.println("root 2="+ r1+ "-"+ Math.sqrt(-d)/(double)(2*a)+ "i\n");

            }
        }
    }
}

class Quadratic
{
    public static void main(String args[])
    {
        System.out.println("BHOOMIKA HEGDE \n1BM22CS342 ");
        Quad q=new Quad();
        q.input();
        q.compute();

    }
}