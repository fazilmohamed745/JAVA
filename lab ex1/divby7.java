/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex.pkg1;

/**
 *
 * @author ADMIN
 */
public class divby7 {public static void main(String[] args)
    {
        int i,sum=0;
        for(i=101;i>100&&i<200;i++)
        {
            if(i%7==0)
            {
               sum=sum+i; 
            }
        }
        System.out.println("Sum of numbers greater than 100 and less than 200 which are divisible by 7 are:");
        System.out.println(sum);
    }
    
}
