public class ExceptionHandling
{
	
	public static void main(String args[])
	{
		
	try{
		int i=8;
		int j=0;
	    int r=i/j; 
		
	System.out.println(" Excetion Handling" + " " + r);  }
	
	catch(Exception e)
	{
		System.out.println(e); 
	}
	
	
		System.out.println(" Bye"); 
	}
}