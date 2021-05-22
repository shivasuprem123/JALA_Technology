import java.io.*;
import java.util.*;
 class Name
{
    public void Display()
    {
          Scanner sc=new Scanner(System.in);
        System.out.println("enter your name ");
        String str=sc.nextLine();
        System.out.println("My name is "+str);
    }
}
public class Main
{
	public static void main(String[] args) 
	{
	  
		Name n=new Name();
		n.Display();
	}
}
