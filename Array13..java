import java.util.*;
import java.io.*;
public class Array13
{
	public static void main(String[] args)
	{
	    Scanner sc=new Scanner(System.in);
	    System.out.println("enter the array size");
	    int n=sc.nextInt();
	    System.out.println("enter the array elements");
	    int[] arr=new int[100];
	    for(int i=0;i<n;i++)
	    {
	        arr[i]=sc.nextInt();
	        
	    }
	    for(int i=0;i<n;i++)
	    {
	        for(int j=i+1;j<n;j++)
	        {
	            if(arr[i]>arr[j])
	            {
	                int temp=arr[i];
	                arr[i]=arr[j];
	                arr[j]=temp;
	            }
	        }
	    }
	    System.out.println("second largest element in the array is: "+arr[n-2]);
    }
}

