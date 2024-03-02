import java.util.*;
class Book1
{
    String name;
    String author;
    int price;
    int pages;
    Book1()
    {
        this.name=name;
        this.author=author;
        this.price=price;
        this.pages=pages;
    }
    void getDetails()
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter name of book: ");
        name=s.nextLine();
        System.out.println("Enter name of author: ");
        author=s.nextLine();
        System.out.println("Enter price of book: ");
        price=s.nextInt();
        System.out.println("Enter no of pages in the book: ");
        pages=s.nextInt();
    }
    public String toString()
    {
        String a,b,c,d;
        a="Book name:"+this.name+"\n";
        b="Book author:"+this.author+"\n";
        c="Book price:"+this.price+"\n";
        d="Number of pages:"+this.pages+"\n";
        return a+b+c+d;
    }
}

class Book
{
    public static void main(String args[])
    {
        System.out.println("BHOOMIKA HEGDE \n1BM22CS342");
        int no_of_books;
        System.out.println("enter number of books: ");
        Scanner sc=new Scanner(System.in);
        no_of_books=sc.nextInt();
        Book1[] b=new Book1[no_of_books];
        for(int i=0;i<no_of_books;i++)
        {
            b[i]=new Book1();
            System.out.println("Enter details of book" +(i+1)+":");
            b[i].getDetails();
            System.out.println("BOOK DETAILS OF BOOK" +(i+1)+":");
            System.out.println(b[i]);
        }

    }
}