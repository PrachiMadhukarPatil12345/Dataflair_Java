import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Collection3
{
	public static void main(String args[])throws Exception
	{
		List<String> c = new ArrayList <> ();    //<generics>
		
		System.out.println(c.size () );
		
		c.add("Prachi");
		c.add(" Patil");
		c.add("Sangli");
	    c.add("BTech");
	    c.add("Information ");
		c.add("Technology");
		
		System.out.println("Size of the collection is " + " " + c.size()  );
		
		Collections.sort(c);
		
		System.out.println("Element At index 5 =" + " " + c.get(5)   );
		
		System.out.println(" Strings in Ascending order " );
		
		for (String i : c)   // it is of type Integer // print elements i in list c
		{
			System.out.println( i );
		}
		
	}
}