
import java.util.*;
import java.io.*;
public class Array15
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int c=0,d=0;
	    System.out.print("enter size of an array: ");
	    int n=sc.nextInt();
	    System.out.print("enter array elements: ");
	    int[] a=new int[n];
	    for(int i=0;i<n;i++)
	    {
	        a[i]=sc.nextInt();
	    }
	    for(int i=0;i<n;i++)
	    {
	        if(a[i]%2==0)
	        {
	            c=c+1;
	        }
	        else
	        {
	            d=d+1;
	        }
	    }
	    System.out.println("number of even elements: "+c+"\nnumber of odd elements: "+d);
	}
}
