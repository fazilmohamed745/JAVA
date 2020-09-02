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
public class LabEx3counter {
    
    public static void main(String[] args)
    {
       counter1 obj=new counter1();
       System.out.println("After incrementing first time");
       obj.increment();
       System.out.println("After incrementing second time");
       counter1 obj1=new counter1();
       obj1.increment();
    }
    
}
class counter1
{
    static int i=10;
    int j=10;
    void increment()
    {
        i++;
        j++;
        System.out.println("i="+i);
        System.out.println("j="+j);
    }
    
}

