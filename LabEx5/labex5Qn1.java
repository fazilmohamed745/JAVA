/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labex2;
import java.util.Scanner;
/**
 *
 * @author ADMIN
 */
public class labex5Qn1 {
    public static void main(String[] args) {
        // TODO code application logic here
        result obj=new result();
        
        obj.calculate();
        obj.show();
        obj.print();
        obj.display();
        
    }
    
}
class student1
{
    String name,rollno;
    Scanner obj=new Scanner(System.in);
    public void read()
    {
        System.out.println("Enter Student Name:");
        name=obj.next();
        System.out.println("Enter Student Roll no:");
        rollno=obj.next();
        
    }
    public void show()
    {
        System.out.println("***STUDENT DETAILS***");
        System.out.println("Student Name:"+name);
        System.out.println("Student RollNo:"+rollno);
    }
}
class mark extends student1
{
    double m1,m2,m3;
    public void read()
    {
        super.read();
        System.out.println("Enter Mark1");
        m1=obj.nextDouble();
        System.out.println("Enter Mark2");
        m2=obj.nextDouble();
        System.out.println("Enter Mark3");
        m3=obj.nextDouble();
    }
    public void print()
    {
        //super.display();
         System.out.println("Mark1:"+m1);
          System.out.println("Mark2:"+m2);
           System.out.println("Mark3:"+m3);
    }
}
class result extends mark
{
    double total,avg;
    public void calculate()
    {
        super.read();
        total=m1+m2+m3;
        avg=total/3;
    }
    public void display()
    {
        //super.display();
         System.out.println("Total:"+total);
          System.out.println("Average:"+avg);
    }
    
}
