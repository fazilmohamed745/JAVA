/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labex2.bookpackage;

/**
 *
 * @author ADMIN
 */
public class bookpack {
    
    public int bookid[]={101,102,103,104};
    public int ano[]={123,234,345,456};
    public int publication[]={1978,1987,1956,1967,1984};
    public  String bookname[]={"TimeMachine","Chitra","DivineComedy","Geetanjali"};
    public  String authorname[]={"H.G.Wells","R.N.Tagore","Dante","Rabindranath Tagore"};
    public void display(int i)
    {
        System.out.println("Book Name:"+bookname[i]+"\nAuthor:"+authorname[i]+"\nBook Id:"+bookid[i]+"\nAccession Number:"+ano[i]+"\nPublication:"+publication[i]);
  
    }
    
}
  

