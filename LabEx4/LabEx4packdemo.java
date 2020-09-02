/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labex2;
import labex2.packagedemo.packdemo1;
import labex2.packagedemo.packdemo2;
import labex2.packagedemo.subpack1.subpack1;
import java.util.Scanner;
import labex2.packagedemo.subpack2.Subpack2;
/**
 *
 * @author ADMIN
 */
public class LabEx4packdemo {
   public static void main(String[] args)
    {
    Scanner obj=new Scanner(System.in);
    packdemo1 pk=new packdemo1();
    //System.out.println("Enter value of n to calculate the factorial:");
    //int n=obj.nextInt();
    pk.fact(6);
    packdemo2 obj2=new packdemo2();
    System.out.println("Enter the values of a and b:");
    int a=obj.nextInt();
    int b=obj.nextInt();
    System.out.println("Addition of "+a+" and "+b+" is:"+obj2.add(a, b));
     System.out.println("Enter number to check odd or even:");
     int n=obj.nextInt();
    subpack1 obj3=new subpack1();
    obj3.oddeven(n);
    Subpack2 obj4=new Subpack2();
     System.out.println("Enter a number to check positive or negative or zero");
     int num=obj.nextInt();
     obj4.pnz(num);
    
    
    }    
}  
    

