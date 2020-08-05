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
public class greet { public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the mark of the student:");
        int a=obj.nextInt();
        switch(a)
        {
            case 0:
            case 1:
            case 2:
                System.out.println("very poor");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("poor");
                break;
            case 6:
            case 7:
                System.out.println("Good");
                break;
            case 8:
            case 9:
                System.out.println("very good");
                break;
            case 10:
                System.out.println("Excellent");
                break;
            default:
                System.out.println("Invalid mark!");
                break;
        }
        
                
                
        }
    
}
