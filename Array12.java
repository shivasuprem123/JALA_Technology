import java.util.*;
import java.io.*;
class ArrayELe
{
    public void Dup()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array size");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter array elements");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("array elements after removing duplicates");

        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(arr[i]==arr[j])
                {
                    arr[j]=0;
                }
            }
            if(arr[i]!=0)
            {
             System.out.println(arr[i]);
            }
        }
        
    }
}
class Array12
{
  public static void main (String args[])
  {
      ArrayELe a=new ArrayELe();
      a.Dup();
  }
}
