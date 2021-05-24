import java .io.*;
import java.util.*;
class Main
{
    public static void main(String args[])
    {
       Scanner sc=new Scanner(System.in);
       
       int temp=0;
       
        char c = sc.next().charAt(0);   
       if(c=='m'||c=='M')
       temp=1;
       else if(c=='f'||c=='F')
       temp=2;
       
       switch(temp)
       {
           case 1:System.out.println("Male");
           break;
            case 2:System.out.println("Female");
           break;
           default:System.out.println("Enter correct gender");
       }
    }
}
       
       
