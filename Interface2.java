/*public class interface2
{
	int i;
	public static void main(String args[])
	{
		interface2 i1=new interface2();
		interface2.B obj1=obj1.new B();
		obj1.show();
		
		
		i1.i=108;
		System.out.println(" I is  " +i1.i);
	}
	
	class B //member inner class
	{
		public void show()
		{
		System.out.println(" hii from nested class");
		}
	}
}*/

interface Abc
{
	void show(); //by default public abstract
}

public class Interface2
{
	public static void main(String args[])
	{
		Interface2 obj1=new Interface2()
		{
			public void show()
			{
				System.out.println(" hii from nested class");
			}
		};
		obj1.show();
	}
	
}



