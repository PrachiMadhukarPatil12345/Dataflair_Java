public class ExceptionHandling1
{
	public static void main(String args[])
	{
		int x,y,z;
		try
		{
		x=8;
		y=2;
		z=x/y;
		System.out.println(" Z=" +z ); 
		//int arr[]={2,4,6}; 
			
			
		
			int arr[]=new int[4];
		    arr[0]=10;
			arr[1]=20;
			arr[2]=30;
			arr[3]=40;
			
		for (int i=0;i<=4;i++)
		{
			System.out.println("i =" + " " + arr[i]); 
		}
		
		
		} //try close
		
		catch(ArithmeticException e)
		{
			System.out.println(" U cannot divide by 0"  ); 
			e.printStackTrace();
		}
		
		
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Out of bound exception becoz  i is less than  equals to four"  ); 
			System.out.println("Max index is 4"  ); 
			
			e.printStackTrace();
		}
		
		
		catch(Exception e)  // It handles every type of exception
		{
			System.out.println(e); 
			
		}
		
		System.out.println("Finally block -------------------"); 
		finally
		{
			System.out.println("Finally block is always executed"); 
		}
		
		System.out.println("bye"); 
		
	}

}