import java.util.*;
import java.io.*;
public class Array11
{
	public static void main(String[] args) {
	    Scanner c=new Scanner(System.in);
	    int i,j;
	    System.out.print("enter first array size:");
	    int n=c.nextInt();
	    System.out.println("enter first array elements:");
	    int[] a= new int[n];
	    for(i=0;i<n;i++)
	    {
	        a[i]=c.nextInt();
	    }
	    System.out.print("enter second array size:");
	    int m=c.nextInt();
	    System.out.println("enter second array elements:");
	    int[] b= new int[m];
	    for(i=0;i<m;i++)
	    {
	        b[i]=c.nextInt();
	    }
	    for(i=0;i<n;i++)
	    {
	        for(j=0;i<m;j++)
	        {
	            if(a[i]==a[j])
	            {
	                System.out.print(a[i]+" ");
	                break;
	                
	            }
	        }
	    }
	}
}
