import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Collection2
{
	public static void main(String args[])throws Exception
	{
		List<Integer> c = new ArrayList <> ();    //<generics>
		
		System.out.println(c.size () );
		
		c.add(23);
		c.add(46);
		c.add(6);
	    c.add(87);
	    c.add(100);
		c.add(12);
		// c.add("Prachi");   // Error String cannot be converted to Integer
		
		
		System.out.println("Size of the collection is " + " " + c.size()  );
		
		Collections.sort(c);
		
		System.out.println("Element At index 5 =" + " " + c.get(5)   );
		
		System.out.println(" Elements in Ascending order " );
		
		for (Integer i : c)   // it is of type Integer // print elements i in list c
		{
			System.out.println( i );
		}
		
	}
}