/*public class Overriding1
{
	public void display()
	{
		int x=10;
		int y=20;
		System.out.println("Overriding !! Parent Class");
	}
	public static void main(String args[])
	{
		B obj=new B();
		B.display();
		//Overriding.fun();
	}
}
/*public static void fun()
	{
		System.out.println("Overriding !! Child Class Static Method");
	}
class B extends Overriding1
{
	public void display()
	{
		//int Result =x+y;
		System.out.println("Overriding !! Child Class");
		
		System.out.println("Overridi **Child Class" + Result);
		
	}
}*/

public class Overriding1
{
	int i,j,k;
	public void setvalues(int a, int b)
	{
		i=a;
		j=b;
	}
	public void sum()
	{
		k=i+j;
	}
	public void Showresult()
	{
		System.out.println(" Parent Class ");
		System.out.println(k +" ");
	}


public static void main(String args[])
	{
		add1 obj1=new add1();
		obj1.setvalues(50,60);
		obj1.sum();
		obj1.Showresult();
		
		
	}
}
	
class add1 extends Overriding1
{ public void Showresult()
	{
		int m=i*j;
		//System.out.println(" Child Class ");
		System.out.println("child class" +" " +m );
		
	}
	
}


