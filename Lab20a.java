import java.io.*;
import java.util.Scanner;
class myexception extends Exception 
{
 myexception()
{
	super("odd number exception");
}
}
class Lab20a
{
  public static void main(String[] args)
        {
            int num;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a number");
        num=sc.nextInt();
        try
	{
  	if(num%2!=0)
 		throw(new myexception());
	else
	  System.out.println(""+num+"is even number");
	}
	catch(myexception ex)
	{
	 System.out.println("\n Error:"+ex.getMessage());
	}
	
}
}


OUTPUT:
Z:\mca16.java>javac Lab20a.java

Z:\mca16.java>java Lab20a
enter a number
2
2is even number

Z:\mca16.java>java Lab20

        Enter any number : 3

        Error : Odd number exception
