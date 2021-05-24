public class loop8
{
	public static void main(String[] args) 
	{
	int c=0,a,temp;  
    int n=548834;
    int length = String.valueOf(n).length();
    temp=n;  
    int p=1;
    while(n>0)  
    {  
        p=1;
    a=n%10;  
    n=n/10;
     for(int i=0;i<length;i++)
     {
          p=p*a;
     }
     c=c+p;
    }

    if(temp==c)  
    System.out.println("armstrong number");   
    else  
        System.out.println("Not armstrong number");   
   }  
}  

