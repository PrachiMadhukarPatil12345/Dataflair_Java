public class Add
{
public static void main(String[] args)
	{
		Addition obj1=new Addition();
		obj1.display(40,20);
		obj1.result();
		obj1.result2();
	}
}

class Addition
{
	int num1; // instance variable
	int num2; // i v
	public void display(int num1,int num2) // local variable
	{
		this.num1=num1;  //Whenever U have to access instance variable ,use this keyword
		this.num2=num2;
		//System.out.println(obj1.getName());
	}
	public void result()
	{
		int result1=num1+num2;
		System.out.println(result1 +" ");
	}
	
	public void result2()
	{
		int result3=num1-num2;
		System.out.println(result3 +" ");
	}
	
	
}

/* class Addition
{
	int num1; // instance variable
	int num2; // i v
	public void display(int num1,int num2) // local variable
	{
		this.num1=num1;  //Whenever U have to access instance variable ,use this keyword
		this.num2=num2;
		//System.out.println(obj1.getName());
	}
	public void result()
	{
		int result1=num1+num2;
		System.out.println(result1 +" ");
	}
	
	public void result2()
	{
		int result3=num1-num2;
		System.out.println(result3 +" ");
	}
	
	

public static void main(String[] args)
	{
		Add obj1=new Add();
		obj1.display(10,20);
		obj1.result();
	}
} */
	
	
	