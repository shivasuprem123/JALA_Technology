import java.util.*;
import java.io.*;
class Demo
{
    public void Copy()
    {
        Scanner sc=new Scanner(System.in);
        int i,j;
        System.out.print("enter array size: ");
        int n=sc.nextInt();
        int[] a=new int[n];
        System.out.print("enter array elements: ");
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();   
        }
        int temp=0;
        for(i=0;i<n/2;i++)
        {
                temp=a[i];
                a[i]=a[n-i-1];
                a[n-i-1]=temp;
            
        }
        System.out.print("reverse of a given array is: ");
        for(i=0;i<n;i++)
        {
        System.out.print(a[i]+" ");
        }
    }
}
public class Array9
{
	public static void main(String[] args) {
		Demo d=new Demo();
		d.Copy();
}
}
