interface Atm
{
	public void show();
	public void display();
	
	/*public void display()
	{
		System.out.println("Hiii from interface");  // Interfaces Are 100 % ABSTRACT because interface methods cannot have body
	}*/
}

class InterfaceDemo implements Atm
{
	public void display()
	{
		System.out.println(" display from child");  //If I doe not provide implementtion of method dislay in child clsss it gives erroer
	}                                            // InterfaceDemo is not abstract and does not override abstract method display() in Atm
                                                     //class InterfaceDemo
	
	public void show()
	{
		System.out.println("Hiii from derived class");
	}
	
	public void childmethod()
	{
		System.out.println("Hiii from childmethod");
	}
	
	
	
	public static void main(String args[])
	{
		//InterfaceDemo i1=new InterfaceDemo(); reference creatuin && object creation
		Atm a1=new InterfaceDemo();
		InterfaceDemo b1=new InterfaceDemo();
		
		a1.show();
		a1.display();
		b1.childmethod();
	}
}