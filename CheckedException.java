import java.util.*; 
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CheckedException
{
	public static void main(String args[])
	{
		int a,b,c;
		System.out.println(" Simple Input Taking Demo");
		Scanner sc=new Scanner(System.in);
		System.out.println(" Enter Two digit");
		a=sc.nextInt();
		b=sc.nextInt();
		c=a+b;
		System.out.println(" Simple Input Taking" + " " +c);
		System.out.println(" ---------------------------------------------------------");
		
		
		
		try{
		int i,j,k;
		System.out.println(" Enter Two numbers");
		//InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in);
		i=Integer.parseInt(br.readLine());
		j=Integer.parseInt(br.readLine());
		
		k= i*j;
		System.out.println(" Multiplication is" +" " +k);
		} //try close
		
		catch(IOException e)
		{
			System.out.println(e);
		}
		
		
	}
}
