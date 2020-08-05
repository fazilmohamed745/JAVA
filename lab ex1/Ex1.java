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
public class Ex1 { public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
        int n,rem,sum=0,temp;
        System.out.println("Enter a number to check armstrong");
        n=obj.nextInt();
        temp=n;
        while(n!=0)
        {
            rem=n%10;
            sum=sum+(rem*rem*rem);
            n=n/10;
            
        }
        n=temp;
        if(sum==n)
        {
            System.out.println(n+" is an armstrong number");
        }
        else
        {
            System.out.println(n+" is not an armstrong number");
        }
        
    }
    
}
