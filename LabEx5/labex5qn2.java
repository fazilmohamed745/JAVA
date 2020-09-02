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
public class labex5qn2 {
  
    public static void main(String[] args)
    {
      degree obj=new degree();
      undergraduate obj1=new undergraduate();
      postgraduate obj2=new postgraduate();
      obj.getdegree();
      obj1.getdegree();
      obj2.getdegree();
    }
    
}
class degree
{
    void getdegree()
    {
        System.out.println("I got a Degree");
    }
}
class undergraduate extends degree
{
    void getdegree()
    {
        //super.getdegree();
         System.out.println("I am an Undergraduate");
    }
}
class postgraduate extends degree
{
    void getdegree()
    {
        //super.getdegree();
         System.out.println("I am a postgraduate");
    }
}
    

