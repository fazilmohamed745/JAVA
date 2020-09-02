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
public class LabEx3Triangle {
    
    public static void main(String[]  args)
    {
       Scanner obj=new Scanner(System.in);
        System.out.println("Enter 3 sides of a triangle");
        double side1,side2,side3,ans;
        side1=obj.nextDouble();
        side2=obj.nextDouble();
        side3=obj.nextDouble();
        ans=triangle1.aretriangle(side1, side2, side3);
        if(ans==1)
            System.out.println("Triangle can be formed");
        else
            System.out.println("Triangle cannot be formed");
    }
    
}
class triangle1
{
    static double s1,s2,s3;
    static int aretriangle(double side1,double side2,double side3)
    {
       s1=side1;
       s2=side2;
       s3=side3;
       if((s1+s2)>s3&&(s2+s3)>s1&&(s3+s1)>s2)
       {
           return 1;
       }
        return 0;
    }   
}
    

