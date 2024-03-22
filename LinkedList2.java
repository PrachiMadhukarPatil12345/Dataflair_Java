import java.util.LinkedList;

public class Linkedlist2
{
	public static void main(String args[])
	{
		LinkedList <Integer> values = new LinkedList<>();
		
		values.add(2);
		values.add(4);
		values.add(6);
		values.add(8);
		values.add(10);
		values.add(12);
		
		values.add(2,16);
		for(int i: values)
		{
			System.out.println(i);
		}
	}
}