import java.util.*;
import java.io.*;
import java.util.*;
class Matrix
{
    public void  add()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of an array");
        int n=sc.nextInt();
        int[] arr=new int[100];
        System.out.println("Enter array elements: "");
        int sum=0;
        for(int i=0;i<n;i++)
        {
            int a=sc.nextInt();
            arr[i]=a;
            sum=sum+arr[i];
        }
        System.out.println("sumof array elements"+sum);

    }
}
class Array1
{
    public static void main(String args[])
    {
    Matrix m=new Matrix();
    m.add();
    }
       
   
}
