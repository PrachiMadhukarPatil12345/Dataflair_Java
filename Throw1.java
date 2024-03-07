import java.util.*; 
public class Throw1
{
	public static void main(String args[]) throws Exception
	{
		int a,b,c;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 2 Numbers");
		a=sc.nextInt();
		b=sc.nextInt();
		c=a/b;
		
		System.out.println("Result is" + " " +c);
		
		int arr[]={ 10,20,30,40};
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
		
	}

}