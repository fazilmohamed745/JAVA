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
public class LabEx3Sigmoid {
    
    public static void main(String[] args)
    {
     Scanner obj=new Scanner(System.in);   
     formula obj1=new formula();
     System.out.println("enter x value");
     double x=obj.nextDouble();
     double answer=formula.sigmoid(x);
     System.out.println("The answer is:"+answer);
    }
          
    
}
class formula
{
    static double x;
    static double ans;
    static double sigmoid(double y)
    {
        x=y;
        ans=1/(1-Math.exp(-x));
        return ans;
    }
}
    

