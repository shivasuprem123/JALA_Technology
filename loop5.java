public class loop5
{
	public static void main(String[] args) 
	{
	    int i=0,j;
	    int[] arr= {20,10,30};
	    int max=arr[0];
	    for(i=1;i<3;i++)
	    {
	        if(max<arr[i])
	        {
	            max=arr[i];
	        }
	    }
	    System.out.println("max of three numbers is: "+max);
	    
	}
}
