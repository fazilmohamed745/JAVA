/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labex2;
import java.util.Scanner;
import labex2.bookpackage.bookpack;
import labex2.bookpackage.journalpack.journalpack;
/**
 *
 * @author ADMIN
 */
public class LAbEx4Bookandjournals {
    public static void main(String[] args)
    {

        Scanner obj=new Scanner(System.in);
        System.out.println("*****Books and JOurnals Requested by the Student*****");
        System.out.println("Enter Book ID");
        int i=obj.nextInt();
        System.out.println("Enter Journal ID");
        int j=obj.nextInt();
        System.out.println("*****Books and JOurnals Requested by the Staff*****");
        System.out.println("Enter Book ID");
        int p=obj.nextInt();
        System.out.println("Enter Journal ID");
        int q=obj.nextInt();
        student obj1=new student(i,j);
        staff obj2=new staff(p,q);
        System.out.println("*****Details of Books and JOurnals Requested by the Student*****");
        obj1.getstudentinfo();
        System.out.println("*****Details of 1Books and JOurnals Requested by the Student*****");
        obj2.getstaffinfo();
    }
    
}
class student
{
    int bkid,jlid;
    bookpack obj=new bookpack();
    journalpack obj1=new journalpack();
    student(int b,int j)
    {
        bkid=b;
        jlid=j;
    }
    void getstudentinfo()
    {
        int flag=0;
        int flag1=0;
        for(int i=0;i<5;i++)
        {
            if(obj.bookid[i]==bkid)
            {
                flag=1;
                System.out.println("***Book Details for the Student***");
                obj.display(i);
            } 
        }
        if(flag==0)
        {
            System.out.println("Invalid Book ID!");
        }
        for(int i=0;i<5;i++)
        {
            
            if(obj1.journalid[i]==jlid)
            {
                flag1=1;
                System.out.println("***Journal Details for the Student***");
                obj1.display(i);
            } 
        }
        if(flag1==0)
        {
            System.out.println("Invalid Journal ID!");
        }
    }
}
class staff
{
    int bkid,jlid;
    bookpack obj2=new bookpack();
    journalpack obj3=new journalpack();
    staff(int b,int j)
    {
        bkid=b;
        jlid=j;
    }
    void getstaffinfo()
    {
        int flag=0;
        int flag1=0;
        for(int i=0;i<5;i++)
        {
            if(obj2.bookid[i]==bkid)
            {
                flag=1;
                System.out.println("***Book Details for the Staff***");
                obj2.display(i);
            } 
        }
        if(flag==0)
        {
            System.out.println("Invalid Book ID!");
        }
        for(int i=0;i<5;i++)
        {
            
            if(obj3.journalid[i]==jlid)
            {
                flag1=1;
                System.out.println("***Journal Details for the Staff");
                obj3.display(i);
            } 
        }
        if(flag1==0)
        {
            System.out.println("Invalid Journal ID!");
        }
    }
}    
    

