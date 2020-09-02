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
public class labEx2EB {
    
     public static void main(String[] args)
     {
       Scanner obj=new Scanner(System.in);  
       System.out.println("Enter consumer number:");
       int number=obj.nextInt();
       System.out.println("Enter consumer name:");
       String name=obj.next();
       System.out.println("Enter previous month reading:");
       double prevmon=obj.nextDouble();
       System.out.println("Enter current month reading:");
       double curmon=obj.nextDouble();
       System.out.println("Enter type of connection(Domestic/commercial)");
       String connection=obj.next();
       consumer obj1=new consumer(number,name,prevmon);
       obj1.consumername();
       obj1.consumernumber();
       obj1.prevread();
       obj1.currentread(curmon);
       obj1.eb(connection,curmon);
       obj1.display();
       
       }
     }

class consumer
{
    int num;
    String name;
    double prevread,curread;
    String connection;
    double totalread,amount;
    consumer(int i,String s,double c)
    {
        num=i;
        name=s;
        prevread=c;
    }
    String consumername()
    {
        return name;
    }
    int consumernumber()
    {
        return num;
    }
    double prevread()
    {
        return prevread;
    }
    double currentread(double j)
    {
        curread=j;
        return curread;
    }
    void eb(String s,double t)
    {
        connection=s;
        curread=t;
        totalread=curread-prevread;
        switch(connection)
        {
            case "domestic":
                if(totalread<=100)
                {
                    amount=totalread*1.50;
                    
                    break;
                }
                else if(totalread>=101 && totalread<=200)
                {
                    amount=(100*1.50)+(totalread-100)*3;
                    
                    break;
                }
                else if(totalread>=201 && totalread<=500)
                {
                    amount=(100*1.50)+(100*3)+(totalread-200)*4.50;
                    
                    break;
                }
                else
                {
                    amount=(100*1.50)+(100*3)+(300*4.50)+(totalread-500)*7;
                    //System.out.println("The electric bill is:"+((100*1.50)+(100*3)+(300*4.50)+(totalread-500)*7));
                    break;
                }
            case "commercial":
                if(totalread<=100)
                {
                    amount=totalread*2.50;
                    
                    break;
                }
                else if(totalread>=101 && totalread<=200)
                {
                    amount=(100*2.50)+(totalread-100)*5;
                    
                    break;
                }
                else if(totalread>=201 && totalread<=500)
                {
                    amount=(100*2.50)+(100*5)+(totalread-200)*6.50;
                   
                    
                    break;
                }
                else
                {
                    amount=(100*2.50)+(100*5)+(300*6.50)+(totalread-500)*9;
                    
                    break;
                }
                    
        }
    }
    void display()
    {
        System.out.println("*****Electricity Bill Details*****");  
        System.out.println("Consumer Number:"+num);
        System.out.println("Consumer Name:"+name);
        System.out.println("Previous Month Reading:"+prevread);
        System.out.println("Current Month Reading:"+curread);
        System.out.println("Total Units Consumed:"+totalread);
        System.out.println("Type of Connection:"+connection);
        System.out.println("The Electricity bill is Rs:"+amount);
    }
    
 
    
}



