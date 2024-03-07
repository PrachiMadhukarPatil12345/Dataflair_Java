interface Atm
{
	void atm();
}

interface Credit
{
	void credit();
}

interface Debit
{
	void debit();
}

interface AtmCumDebit
{
	void atmcumdebit();
	
}


class MultipleInheritance implements Atm,Credit,Debit,AtmCumDebit
{
	public void atm()
	{
		System.out.println("Hiii from class Atm");
	}
	
	public void credit()
	{
		System.out.println("Hiii from class credit");
	}
	
	public void debit()
	{
		System.out.println("Hiii from class debit");
	}
	public void atmcumdebit()
	{
		System.out.println(" Atmdebit2");
	}
	
	public static void main(String args[])
	{
		/*MultipleInheritance m1=new MultipleInheritance();
		m1.atm();
		m1.credit();
		m1.debit();
		m1.atmdebit();*/
		
		Atm a1=new MultipleInheritance(); // If a person wants Only Atm Info It will be given atm a1 object, & thus it will access Atm info
		a1.atm();
		Credit c1=new MultipleInheritance();
		c1.credit();
		Debit d1=new MultipleInheritance();
		d1.debit();
		
		AtmCumDebit obj1=new MultipleInheritance();
		obj1.atmcumdebit();
		//obj1.debit();
	}
		
		// If a person wants Info of both Atm & Debit It will be given atmdebit object, & thus it will 
		                                             //access that info details
                                            
		
		
		
	
}