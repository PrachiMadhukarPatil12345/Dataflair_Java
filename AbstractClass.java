abstract class AbstractClass
{
	public void show()
		{
			System.out.println("Hello from AbstractClass");
		}
	
	public abstract void magic(); //Abstract method is used when we dont now its imlementation right now
	
	public static void main (String args[])
	{
		//Abc A1=new Abc();
		AbstractClass A1=new Abc();
		A1.magic();
		A1.show();
	}
}
	class Abc extends AbstractClass 
	{
		public void magic()
		{
			System.out.println("Hello from child");
		}
		
		public void show()
		{
			System.out.println("Hello from derived Class");
		}
	}
