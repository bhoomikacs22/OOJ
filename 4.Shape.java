abstract class Figure 
{
    double dim1;
    double dim2;

    Figure(double a, double b) 
    {
        dim1 = a;
        dim2 = b;
    }

    abstract double area();
}

class Rectangle extends Figure 
{
    Rectangle(double a, double b) 
    {
        super(a, b);
    }

    double area() 
    {
        return dim1 * dim2;
    }
    }

class Triangle extends Figure 
{
    Triangle(double a, double b) 
    {
        super(a, b);
    }

    double area() 
    {
        return dim1 * dim2 / 2;
    }
}
class Circle extends Figure
{
    Circle(double a,double b)
    {
        super(a,b);
    }
    double area()
    {
        return 3.14*dim1*dim1;
    }
}

class AbstractClass
{
    public static void main(String args[]) 
    {
        System.out.println("BHOOMIKA HEGDE \n1BM22CS342 ");
        Rectangle r = new Rectangle(9, 5);
        Triangle t = new Triangle(10, 8);
        Circle c=new Circle(7,0);
        System.out.println("Area of rectangle: " + r.area());
        System.out.println("Area of triangle: " + t.area());
        System.out.println("Area of circle:  " + c.area());
    }
}