//2. Write a program in Java to calculate the area of different shapes using polymorphism and inheritance.
abstract class Shapes
{
    abstract double area();
}

class Circle extends Shapes
{
    double r;

    Circle(double r) 
    {
        this.r=r;
    }
    @Override
    double area()
    {
        System.out.println("Area of circle:");
        return 3.14*r*r;
    }
}

class Quadrileteral extends Shapes
{
    double s1;
    double s2;
    double s3;
    double s4;
    double h;
    Quadrileteral(double  s1, double  s2, double  s3, double  s4,double h) {
        this.s1 = s1;
        this.s2 = s2;
        this.s3 = s3;
        this.s4 = s4;
        this.h=h;
    }
    double square(String x)
    {
        System.out.println("Area of square:");
        return s1*s1;
    }
    double rect(String x)
    {
        System.out.println("Area of rectangle:");
        return s1*s2;
    }
    double trap(String x)
    {
        System.out.println("Area of trapezium:");
        return ((s1+s3)/2)*h;
    }
    @Override
    double area()
    {
        if(s1==s2)
        {
            return square("Sq");
        }
        else if((s1!=s2) && (s2!=s3) && (s3!=s4) &&(s4!=s1))
        {
            return trap("Tp");
        }
        else
        {
            return rect("Rec");
        }
    }
}

class Triangle extends Shapes
{
    int s1;
    int s2;
    int s3;
    int h;
    Triangle(int s1, int s2, int s3,int h) 
    {
        this.s1 = s1;
        this.s2 = s2;
        this.s3 = s3;
        this.h=h;
    }
    @Override
    double area()
    {
        System.out.println("area of the triangle is");
        return (s2*h)/2;
    }
}

public class Shape 
{
    public static void main(String[] args)
    {
        Circle c=new Circle(5);
        System.out.println(c.area());
        Quadrileteral q= new Quadrileteral(2, 02, 0, 0,0);
        System.out.println(q.area());
        Quadrileteral q1= new Quadrileteral(4, 02, 0, 0,0);
        System.out.println(q1.area());
        Quadrileteral q2= new Quadrileteral(4, 05, 6, 5,4);
        System.out.println(q2.area());
        Triangle t= new Triangle(3, 04, 05,5);
        System.out.println(t.area());
    }
}
