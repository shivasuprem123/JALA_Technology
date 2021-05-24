import java.io.*;
import java.util.*;
class Main
{
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
         String str1="shiva_";
         String str=sc.nextLine();
         System.out.println("first string="+str+"\nSecond string "+str1);
         String s=str1+str;
         System.out.println("concatination of two string = "+s);
         String str3="helloworld";
         int length=str3.length();
         System.out.println("The length if string "+str3+" is "+length);
         String str4 = "Welcome to America";
         int l=length=str4.length();
         System.out.println(str4.substring(0,7));
         String s1="this is index of example";  
         int index1=s1.indexOf("is");  
         int index2=s1.indexOf("index");
         System.out.println(index1+"  "+index2);
          String Str7 = new String("Welcome to America");
         System.out.println(Str7.matches("(.*)geeks(.*)"));
         System.out.println(Str7.matches("America"));
         if(Str7.equals(str4))
         System.out.println(str4+" = "+Str7);
         

        
    }
}
