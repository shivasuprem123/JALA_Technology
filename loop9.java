public class loop9
{
	public static void main(String[] args) 
	{
	int i=2,n=37,count=0;
	for(i=2;i<=n;i++)
	{
	    if(n%i==0)
	    {
	        count++;
	    }
	}
	if(count<3)
	{
	  System.out.print("prime number");
	}
	else
	{
	    System.out.print("not a prime number");
	}
	}
}
