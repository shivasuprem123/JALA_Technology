import java.io.*;
import java.util.*;
public class loop11
{
	public static void main(String[] args) 
	{
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    switch(n%2)
	    {
	        case 0:System.out.print("even");
	        break;
	        case 1:System.out.print("odd");
	        break;
	    }
	}
}
