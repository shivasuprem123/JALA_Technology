import java.io.*;
import java.util.*;

public class loop10
{
	public static void main(String[] args) 
	{
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    int temp=n;
	    int m;
	    int revnum=0;
	    while(temp>0)
	    {
	        m=temp%10;
	        revnum=revnum*10+m;
	        temp=temp/10;
	    }
         if(revnum==n)
	    {
	        System.out.println("Palindrome");
	    }
	    else
	    {
	        System.out.print("Not a palindrome");
	    }
	    }
}
	    
