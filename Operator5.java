import java.util.*;
import java.io.*;
class Operator5
{
    public static void main(String args[])
    {
        Scanner c=new Scanner(System.in);
        int a=c.nextInt();
        int b=c.nextInt();
        int d=c.nextInt();
        if (a>b && a>d)
        System.out.println(a);
        if (b<a || b<d)
        System.out.println(b);
        if(d != b)
        System.out.println(d);
    }
}
