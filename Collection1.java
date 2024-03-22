import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Collection1
{
	public static void main(String args[])throws Exception
	{
		 //Collection c=new ArrayList();
		
		List c=new ArrayList();
		
		System.out.println(c.size()   );
		
		c.add(2);
		c.add(4);
		c.add(6);
	    c.add(8);
	    c.add(10);
		c.add(12);
		c.add(14);
		c.add(20);
		c.add("prachi");
		c.add("Patil");
		c.add("collection Accepts any type of data i.e int ,float ,string");
		
		System.out.println("Size of the collection is " + " " + c.size()  );
		
		System.out.println("Element At index 4 =" + " " + c.get(4)   );  // It is method of list
		
		for (Object i : c)   // it is of type object // print elements i in collection c
		{
			System.out.println( i );
		}
		
		/*for (Object i =0; i<c.size(); i++)
		{
			System.out.println( i );
		}*/
	}
	/* The root interface in the collection hierarchy. A collection represents a group 
	of objects, known as its elements. Some collections allow duplicate elements and
	others do not. Some are ordered, and others are unordered. Collections that have a 
	defined encounter order are generally subtypes of the SequencedCollection interface. 
	The JDK does not provide any direct implementations of this interface: it provides
	implementations of more specific subinterfaces like Set and List. This interface is 
	typically used to pass collections around and manipulate them where maximum generality is desired.*/
}

// 