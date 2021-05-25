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
		int[] brr=new int[n];
		System.out.print("enter array elements: ");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
			brr[i]=arr[i];
		}
		System.out.print("elements after copying into array: ");
		for(int i=0;i<n;i++)
		{
			System.out.print(brr[i]+" ");
		}
	}
}
			
			
		
public class Array6
{
	public static void main(String[] args)
	{ 
		Demo d=new Demo();
		d.Copy();
	}
}		
	
