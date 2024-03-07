public class switchcase
{
	public static void main(String[] args)
	{
		int a=10;
		System.out.println("Hiiii Guys" + a);
		
		for(int i=1;i<=a;i++)
		{ 
	      if(i==2)
		  {
			  continue;
		  }
			System.out.println("For Loop" + i );
			//if(i==5)
		//break;
		 }
		System.out.println(" Out Of Loop" + "----------------------Hiiii Guys!!! Now Switch to Switch Case Program--------------------------------------------------------");
		
		int day=5;
		switch(day)
		{
			case 1:
			System.out.println("Hii !! Its monday");
			break;
		
		case 2:
		System.out.println("Hii !! Its Tuesday");
		break;
		
		case 3:
		System.out.println("Hii !! Its Wednessday");
		break;
		
		case 4:
		System.out.println("Hii !! Its Thursday");
		break;
		
		case 5:
		System.out.println("Hii !! Its Friday");
		break;
		
		case 6:
		System.out.println("Hii !! Its Saturday");
		break;
		
		case 7:
		System.out.println("Hii !! Its Sunday");
		break;
		
		default:
		System.out.println("Hii !! Its Default case");
		break;
		}
	}
}