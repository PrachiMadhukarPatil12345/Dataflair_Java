public class Pattern1
{
	public static void main(String args[])
	{
		for(int s=1; s<=5;s++)
		{
			for(int t=1; t<=5;t++)
			{
				System.out.print(" *" + " ");
			}
			System.out.println(" ");
		}
		System.out.println("----------------------------------------------------------------------------- ");
		for(int i=1; i<=4;i++)
		{
			for(int j=1; j<=4;j++)
			{
				if(i==1 || i==4 || j==1 || j==4)
					
					System.out.print(" *");
				else
					System.out.print("  ");
			 }
			 System.out.println(" ");
		 }
		 System.out.println("----------------------------------------------------------------------------- ");
		
		
		for(int a=1; a<=4;a++)
		{
			for(int b=1; b<=4;b++)
			{
				int k=a+b-1;
				if(k>4)
				{
					k=k-4;
				} System.out.print(k + " ");
			}
			 System.out.println(" ");
		 }
		  System.out.println("----------------------------------------------------------------------------- ");
		 for(int y=1; y<=4;y++)
		{
			for(int z=1; z<=4;z++)
			{ int x=y+z-1;
				System.out.print(x + " ");
			}
			 System.out.println(" ");
		 }
		  System.out.println("----------------------------------------------------------------------------- ");
		 for(int l=1; l<=4;l++)
		{
			for(int m=1; m<=4;m++)
			{
				System.out.print(m + " ");
		    }
		         System.out.println(" ");
		 }
   }
		
}
 
	
	
