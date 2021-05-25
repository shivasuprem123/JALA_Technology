import java.util.*;
import java.io.*;
public class Array4
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
		System.out.println("enter any element to check with array elements");
		int b=c.nextInt();
		int count=0;
		for(int i=0;i<n;i++)
		{
		    if(b==d[i])
		    {
		        count++;
		        System.out.println("array contains the given element");
		    }
		}
		if(count==0)
		System.out.println("element is not present in array");
	}
}
