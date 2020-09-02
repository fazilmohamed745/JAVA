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
public class LabEx2Areaofcircle {
   
    public static void main(String[] args)
    {
       Scanner obj=new Scanner(System.in);
        //circle obj1=new circle();
        System.out.println("Enter Radius:");
        double rad=obj.nextDouble();
        circle obj1=new circle(rad);
        System.out.println("Entered radius of the circle is:"+rad);
        System.out.println("The radius of the circle is"+obj1.getarea());
     }
}
    class circle
    {
        private double radius=1.0;
        private String color="red";
    
    circle()
    {
      System.out.println("Default Constructor");  
    }
    circle(double r)
    {
        radius=r;
    }
    double getradius()
    {
        return radius;
    }
    double getarea()
    {
        return 3.1415*radius*radius;
    }
    }  
    

