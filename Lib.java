//4. Write a program in Java for Library management using Multilevel inheritance with at least 3 classes all classes must have two-member variable and two -member method.
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
class Book
{
    String bname;
    String edi;
    String auth;
    //boolean avail;
    Book(String bname,String edi,String auth)
    {
        this.bname=bname;
        this.edi=edi;
        this.auth=auth;
        //this.avail=true;
    }
}

class Student
{
    int id;
    String date;
    String rdate;
    String dept;
    Student(int id, String date,String rdate, String dept)
    {
        this.id = id;
        this.date = date;
        this.rdate=rdate;
        this.dept = dept;
    }

}

class Checkret
{
    static Student st;
    Checkret(Student st)
    {
        this.st = st;
        //this.<error> = <error>;
    }
    static void checkr()
    {
        if(st.rdate==null)
        {
            System.out.println("Book not returned; hence unavailable.");
        }
        else{
            System.out.println("Book returned and available for issue.");
        }

    }
}

class Manage
{
    Book b;
    Student st;
    //Availabality a;
    long day;
    Checkret c;
    Manage(Book b,Student st,Checkret c) {
        this.b = b;
        this.st=st;
        this.c=c;
    }
    long retdate()
    {
        String start=st.date;
        String end=st.rdate;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        // Parse the strings to LocalDate
        LocalDate startDate = LocalDate.parse(start, formatter);
        LocalDate endDate = LocalDate.parse(end, formatter);

        // Calculate days between
        long days = ChronoUnit.DAYS.between(startDate, endDate);
        //System.out.println("No of days Book1 has been issued:"+days);
        return days;
    }
    long fine()
    {
        long f=10;
        day=retdate();
        if (day>=20)
        {
            f=f*day;
        }
        return f;
    }
    void display()
    {
        if (day<20)
        {
        System.out.println("Book name:"+b.bname);
        System.out.println("Book edition:"+b.edi);
        System.out.println("Book author:"+b.auth);
        System.out.println("Student id:"+st.id);
        System.out.println("Student Department:"+st.dept);
        System.out.println("Date of issue:"+st.date);
        System.out.println("Return date:"+st.rdate);
        System.out.print("Availability: ");
        Checkret.checkr();
        System.out.println("Fine:"+fine());
        }
        else
        {
        System.out.println("Book name:"+b.bname);
        System.out.println("Book edition:"+b.edi);
        System.out.println("Book author:"+b.auth);
        System.out.println("Student id:"+st.id);
        System.out.println("Student Department:"+st.dept);
        System.out.println("Date of issue:"+st.date);
        System.out.println("Return date:"+st.rdate);
        System.out.print("Availability: ");
        Checkret.checkr();
        }
    }
}

public class Lib
{
    public static void main(String[] args)
    {
        Book b=new Book("Theory of everything","1st","Stephen Hawking");
        Student st=new Student(1, "2025-02-10", "2025-03-15","Physics");
        //Availabality a=new Availabality(false, st, b);
        Checkret c= new Checkret(st);
        Manage m=new Manage(b,st,c);
        m.display();
    }
}