public class Overloading
{
	public static void main(String args[])
	{
		Abc obj=new Abc();
		obj.Show(25, 25);
		
	}
}
class Abc
{
	public void Show(int a, int b)
	{
		int x=a;
		int y=b;
		int z= a+b;
		System.out.println("Overloading Method" +" " + z);
	}
	
	public void Show()
	{
		System.out.println(" In Default Show ");
	}
	
	public void Show(int a)
	{
		System.out.println(" In Para Show ");
	}
	
	public void Show(float b)
	{
		System.out.println(" In Para float Show ");
	}
	
	
	
}