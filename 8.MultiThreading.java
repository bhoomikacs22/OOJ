class Bms extends Thread
{
    public void run()
    {
        int i=0;
        while(i<5)
        {
            try
            {
                Thread.sleep(10000);
                System.out.println("BMS");
                i++;
            }
            catch(InterruptedException e)
            {
                System.out.println("Interrupted");
            }
        }
    }
}
class Cs extends Thread
{
    public void run()
    {
        int i=0;
        while(i<20)
        {
            try
            {
                Thread.sleep(2000);
                System.out.println("CSE");
                i++;
            }
            catch(InterruptedException e)
            {
                System.out.println("Interrupted");
            }
        }
    }
}

class MultiThreading
{
    public static void main(String args[])
    {
        System.out.println("BHOOMIKA HEGDE \n1BM22CS342 ");
        Bms b=new Bms();
        Cs c=new Cs();
        b.start();
        c.start();
    }
}
