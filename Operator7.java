import java.util.*;
import java.io.*;
class Operator7
{
    public static void main(String args[])
    {
        Scanner c=new Scanner(System.in);
        int a=c.nextInt();
        int b=c.nextInt();
        int d=c.nextInt();
        if(a<b && a<d)
        System.out.println(a);
        else if (b<d)
        System.out.println(b);
        else 
        System.out.println(d);
        if(a>b && a>d)
        System.out.println(a);
        else if (b>d)
        System.out.println(b);
        else
        System.out.println(d);
    }
}
