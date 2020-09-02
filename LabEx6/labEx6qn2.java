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
public class labEx6qn2 {
   
   
    public static void main(String[] args)
    {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter radius of the Circle:");
    double r=sc.nextDouble();
    perimeter obj=new circle1(r);
    obj.perimeterofobject();
    System.out.println("Enter length of the rectangle");
    double l=sc.nextDouble();
    System.out.println("Enter breadth of the rectangle:");
    double b=sc.nextDouble();
    perimeter obj1=new rectangle(l,b);
    obj1.perimeterofobject();
    }
    
}
interface perimeter
{
     void perimeterofobject();
    
}
class circle1 implements perimeter
{
    double r;
    circle1(double radius)
    {
        r=radius;
    }
   public void perimeterofobject()
   {
      double result;
      result=2*Math.PI*r;
      System.out.println("The Perimeter of Circle is: "+result);
   }

   
}
class rectangle implements perimeter
{
    double l,b;
    rectangle(double length,double breadth)
    {
       l=length;
       b=breadth;
    }
   public void perimeterofobject()
   {
      double result;
      result=2*(l+b);
      System.out.println("The Perimeter of Rectangle is: "+result);
   }

   
}