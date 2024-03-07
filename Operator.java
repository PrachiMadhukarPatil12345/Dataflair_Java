public class Operator
{
	public static void main (String args[])
	{
	int i=0;
	
	int j=i++ ; //0
	//j=i;
	j=i; // 1
	System.out.println(i+"-"+j);
	System.out.println("-----------------");
	
	int k=5;
	System.out.println(k++ );
	int m=6;
	System.out.println(++m + m++);
	
	System.out.println("-----------------");
	
	int x=10;
	int y=90;
	if (x>y)
	{
		System.out.println(" X is larger");
	}
	else{
		System.out.println("Y is Larger");
	}
	
	System.out.println("-----------------");
	int l=5;
	int n=9;
	int d=15;
	int e=l&n;
	System.out.println(e);
	boolean c= d>n;
	System.out.println(c);	System.out.println(l<n);

	System.out.println("Addition is :" +(l+n));
	System.out.println("Addition is :" +l+n);
	
	/*System.out.println("Hello");
			System.out.println("WELCOME");
			System.out.println("TO ");
			System.out.println("JAVA");
	System.out.println("COURSE");
	
	System.out.println(" While ----------------------------------------Loop");
	System.out.println(" " );*/
	}
}