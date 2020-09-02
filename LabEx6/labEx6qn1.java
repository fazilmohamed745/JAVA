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
public class labEx6qn1 {
   
    public static void main(String[] args)
    {
      Scanner obj=new Scanner(System.in);
       System.out.println("Enter 3 subject mark of Student A:");
       double m1=obj.nextDouble();
       double m2=obj.nextDouble();
       double m3=obj.nextDouble();
       mark1 obj1=new A(m1,m2,m3);
       obj1.getpercentage();
       System.out.println("Enter 4 subject mark of Student B:");
       double mk1=obj.nextDouble();
       double mk2=obj.nextDouble();
       double mk3=obj.nextDouble();
       double mk4=obj.nextDouble();
       mark1 obj2=new B(mk1,mk2,mk3,mk4);
       obj2.getpercentage();
    }
    
}
abstract class mark1
{
    abstract void getpercentage();
}
class A extends mark1
{
    double m1,m2,m3;
    A(double mark1,double mark2,double mark3)
    {
       m1=mark1;
       m2=mark2;
       m3=mark3;
    }
    void getpercentage()
    {
        double percentage=(m1+m2+m3)/3;
        System.out.println("The percentage of Student A is :"+percentage+"%");
      
    }
}
class B extends mark1
{
    double m1,m2,m3,m4;
    B(double mark1,double mark2,double mark3,double mark4)
    {
       m1=mark1;
       m2=mark2;
       m3=mark3;
       m4=mark4;
    }
    void getpercentage()
    {
        double percentage=(m1+m2+m3+m4)/4;
        System.out.println("The percentage of Student B is :"+percentage+"%");
    }
}
    

