import java.util.*;
import java.io.*;
class Demo
{
	public void Copy()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("enter size of  an array: ");
		int temp;
		int n=sc.nextInt();
		int[] arr=new int[n];
		System.out.print("enter array elements: ");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
		    for(int j=i+1;j<n;j++)
		    {
		        if(arr[j]<arr[i])
		        {
		            temp=arr[i];
		            arr[i]=arr[j];
		            arr[j]=temp;
		        }
		    }
		   
		}
		 System.out.println("minimum element is: "+arr[0]);
		 System.out.print("maximum element is: "+arr[n-1]);
	}
}
public class Array8
{
	public static void main(String[] args)
	{ 
		Demo d=new Demo();
		d.Copy();
	}
}		
	
