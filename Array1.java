class Array1
{
	public static void main (String args[])
	{
		System.out.println("----------------------------               Data Type Demo                             -------------------------------------");
		int p=80;
		System.out.println(p);
		float f=4.8f;
		System.out.println(f);
		short s=4;
		System.out.println(s);
		long l=444555;
		System.out.println(l);
		char c='T';
		System.out.println(c);
		String d="Prachi";
		System.out.println(d);
		double e=2562.56453;
		System.out.println(e);
		System.out.println("---------------------------------------------------------------------------------------------");
		
		int ar[]=new int[4];
		ar[0]=10;
		ar[1]=20;
		ar[2]=30;
		ar[3]=40;
		for(int i=0;i<ar.length;i++)
		{
			System.out.println(ar[i]); //lenght is property of arry
		}
		System.out.println(" out of loop");
		System.out.println("       Declaration, Initialization, & instantiate                         ");
		
		int k[]= {2,4,6,8,10};
		for(int m=0;m<k.length;m++)
		{
			System.out.println(k[m]);
		}
		
		System.out.println("       for each loop                        ");
		
		int x[]={23,43,56,78};
		for(int y:x)
			System.out.println(y);
		System.out.println("       Finding Minimum                       ");
		
	int Arre[]={12,16,18,20};
	//min(Arre);
	int min=Arre[0];
	for(int g=0;g<Arre.length;g++)
	
	if(Arre[g]<min)
		min=Arre[g];
	{
		System.out.println("Minimum is out of" +min);
	}
	for(int z:Arre)
		System.out.println(z);
	
	}
}

