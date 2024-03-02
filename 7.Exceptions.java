class WrongAge extends Exception
{
    public WrongAge(String message)
    {
        super(message);
    }
}

class Father
{
    int fatherAge;
    public Father(int fatherAge) throws WrongAge
    {
        if(fatherAge<0)
        {
            throw new WrongAge("Age cannot be negative ");
        }
        this.fatherAge=fatherAge;
    }
}

class Son extends Father
{
    int sonAge;
    public Son(int fatherAge,int sonAge) throws WrongAge
    {
        super(fatherAge);
        if(sonAge>=fatherAge)
        {
            throw new WrongAge("Son's age cannot be greater than or equal to son's age");
        }
        this.sonAge=sonAge;
    }
    void display()
    {
        System.out.println("Son's and father's age= "+ sonAge +" "+ fatherAge);
    }
}

class Excep
{
    public static void main(String args[])
    {
        System.out.println("BHOOMIKA HEGDE \n1BM22CS342 ");
        try
        {
            Father f=new Father(-3);
        }
        catch(WrongAge e)
        {
            System.out.println("Wrong Age"+e);
        }
        try
        {
            Son s=new Son(45,56);
        }
        catch(WrongAge e)
        {
            System.out.println("Wrong Age"+e);
        }
        try
        {
            Son s1=new Son(45,19);
        }
        catch(WrongAge e)
        {
            System.out.println("Wrong Age"+e);
        }
        try
        {
            Son s2=new Son(45,19);
            s2.display();
        }
        catch(WrongAge e)
        {
            System.out.println("Wrong Age"+e);
        }
                
               
    }
}