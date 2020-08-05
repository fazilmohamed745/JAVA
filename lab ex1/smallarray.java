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
public class smallarray { public static void main(String[] args)
    {
        int a[]=new int[5];
        Scanner obj=new Scanner(System.in);
        int i,small,large;
        System.out.println("Enter 5 elements of the array:");
        for(i=0;i<5;i++)
        {
            a[i]=obj.nextInt();
        }
        small=a[0];
        large=a[0];
        for(i=0;i<5;i++)
        {
            if(small>a[i])
            {
                small=a[i];
            }
        }
        System.out.println("The smallest element in the array:"+small);
        for(i=0;i<5;i++)
        {
            if(large<a[i])
            {
                large=a[i];
            }
        }
        System.out.println("The largest element in the array:"+large);        
    }
    
}
