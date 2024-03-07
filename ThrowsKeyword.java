import java.io.BufferedReader;
import java.io.InputStreamReader;
public class ThrowsKeyword
{
	public static void main(String args[]) throws Exception
	{
		//try
		//{
		String s;
		System.out.println(" Enter a String");
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		s=br.readLine();
		System.out.println(s); 
		
		//} //try close
		
		/*catch(Exception e)
		{
			System.out.println(e);
			//br.close();
		}*/
		
	}
}