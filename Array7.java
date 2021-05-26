import java.util.*;
import java.io.*;
class Demo
{
	public void Copy()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("enter size of  an array: ");
		int n=sc.nextInt();
		int[] arr=new int[n];
		System.out.print("enter array elements: ");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.print("enter an element to insert in the array: ");
		int m=sc.nextInt();
		System.out.print("enter the position to insert the element in the array: ");
		int p=sc.nextInt();
		for(int i=0;i<n;i++)
		{
		    if(p==i)
		    {
		        arr[i]=m;
		    }
		}
		for( int i=0;i<n;i++)
		{
		    System.out.print(arr[i]+" ");
		}
	}
}
public class Array7
{
	public static void main(String[] args)
	{ 
		Demo d=new Demo();
		d.Copy();
	}
}		
	
