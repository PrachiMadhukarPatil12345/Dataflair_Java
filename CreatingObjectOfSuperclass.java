public class CreatingObjectOfSuperclass
{
	public CreatingObjectOfSuperclass()
	{
		super();
		System.out.println("In Superclass constructor");
	}
	/*public void show()
	{
		System.out.println("In Superclass show");
	}*/
	
	public CreatingObjectOfSuperclass(int i)
	{
		System.out.println("In Superclass Para constructor");
	}
	
	public static void main(String args[])
	{
		//CreatingObjectOfSuperclass obj=new y ();
		//y obj =new y();
		//obj.show();
		y obj =new y(20);
		//super.i();
	}
}
class y extends CreatingObjectOfSuperclass
{
	public y()
	{
		System.out.println("In Subclass constructor");
	}
	public y(int i)
	{
		super(i);
		System.out.println("In Subclass Para constructor");
	}
}
