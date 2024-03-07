public class Single_Inheritance
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
		obj1.mul();
		
	}
}
	
class add1 extends Single_Inheritance
{ public void mul()
	{
		int m=i*j;
		//System.out.println(" Child Class ");
		System.out.println("child class" +" " +m );
		
	}
	
}



