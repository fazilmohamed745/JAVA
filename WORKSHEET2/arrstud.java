/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package worsheet.pkg2;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class arrstud {
     public static void main(String[] args){
        student1 obj[]=new student1[2];
        int i;
        for(i=0;i<2;i++)
        {
            obj[i]=new student1();
            obj[i].getdata();
            obj[i].markcalc();
        }
        for(i=0;i<10;i++)
        {
            System.out.println("DETAOLS OF STUDENT"+(i+1));
            obj[i].display();
        }
    }
}
class student1
{
    String name,dept,status;
    double m1,m2,m3,avg;
    void getdata()
    {
       Scanner obj=new Scanner(System.in);
       System.out.println("Name :");
       name=obj.next();
       System.out.println("Dept :");
       dept=obj.next();
       System.out.println("marks in 3 subjects");
       m1=obj.nextInt();
       m2=obj.nextInt();
       m3=obj.nextInt();
    }
    void markcalc()
    {
        avg=(m1+m2+m3)/3;
        if(m1<50 || m2<50 || m3<50)
        {
            status="fail";
        }
        else
        {
            if(avg>=80)
                status="first class";
            if(avg>=70 && avg<=79)
                status="second class";
            if(avg>=50 && avg<=69)
                status="third class";
        }
    }
    void display()
    {
        System.out.println("Name: "+name+"\nDept: "+dept+"\n M1= "+m1+"\nM2= "+m2+"\nM3= "+m3);
        System.out.println("average= "+avg+"\nClass: "+status);
    }
}

