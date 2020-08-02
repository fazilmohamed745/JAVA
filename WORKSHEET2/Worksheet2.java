/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package worksheet.pkg2;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Worksheet2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
  
Scanner obj=new Scanner(System.in);
        int a,b;
        arth obj1=new arth();
        System.out.println("enter two numbers");
        a=obj.nextInt();
        b=obj.nextInt();
        System.out.println("enter the symbol of the operation to be performed");
        char c=obj.next().charAt(0);
        switch(c)
        {
            case '+':
                System.out.println("Sum ="+(obj1.addition(a,b)));
                break;
            case '-':
                System.out.println("difference ="+(obj1.subtraction(a,b)));
                break;
            case '*': 
                System.out.println("product ="+(obj1.multiply(a, b)));
                break;
            case '/':
                System.out.println("quorient ="+(obj1.division(a, b)));
                break;
            default:
                System.out.println("invalid choice");
        } 
  
    }
}
class arth
{
    int addition(int x,int y)
    {
        return x+y;
    }
    int subtraction(int x,int y)
    {
        return x-y;
    }
    int multiply(int x,int y)
    {
        return x*y;
    }
    int division(int x,int y)
    {
        return x/y;
    }
}
