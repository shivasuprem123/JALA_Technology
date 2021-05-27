import java.util.*;
import java.io.*;
class Demo
{
    public void Copy()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter array size:");
        int n=sc.nextInt();
        System.out.println("enter array elements:");
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(arr[j]==arr[i])
                {
                    System.out.print(arr[j]+" ");
                }
            }
        }
    }
}
public class Array10
{
	public static void main(String[] args) {
	 Demo d=new Demo();
	 d.Copy();
	}
}
