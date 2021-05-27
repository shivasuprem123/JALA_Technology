
import java.util.*;
import java.io.*;
public class Array16
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
	        for(int j=i+1;j<n;j++)
	        {
	            if(a[j]<a[i])
	            {
	                int temp=a[i];
	                a[i]=a[j];
	                a[j]=a[i];
	            }
	        }
	    }
	    int diff=a[n-1]-a[0];
	    System.out.println("diff between first and last element is: "+diff);
	}
}
