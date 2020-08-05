/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex.pkg1;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class swap { public static void main(String[] args)
    {
        int a,b,temp;
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter a value:");
        a=obj.nextInt();
        System.out.println("Enter b value:");
        b=obj.nextInt();
        System.out.println("Before swapping value of a is:"+a);
        System.out.println("Before swapping value of b is:"+b);
        temp=a;
        a=b;
        b=temp;
         System.out.println("After swapping value of a is:"+a);
        System.out.println("After swapping value of b is:"+b);
        
        
        
    }
    
    
}
