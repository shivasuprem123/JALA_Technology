import java.util.*;
import java.io.*;
public class Array5
{
	public static void main(String[] args)
	{
		Scanner c=new Scanner(System.in);
	    System.out.println("enter the size of an array");
		int n=c.nextInt();
		int d[]=new int[100];
		System.out.println("enter elements in array");
		for(int i=0;i<n;i++)
		{
		    d[i]=c.nextInt();
		}
		System.out.println("enter any element to remove from the array elements");
		int b=c.nextInt();
		for(int i=0;i<n;i++)
		{
		    if(b==d[i])
		    {
		        d[i]=-1;
		    }
		}
		for(int i=0;i<n;i++)
		{
		    if(d[i]>0)
		    System.out.print(" "+d[i]);
		}
	}
}
