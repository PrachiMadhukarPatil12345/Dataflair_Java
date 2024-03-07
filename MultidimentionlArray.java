class MultidimentionlArray
{
	public static void main (String args[])
	{
		int arr[][]={{10,20,30},{40,50,60},{70,80,90}};
		//int ar[][]=new int[3][3];
		/*ar[0][0]=10;
		ar[0][1]=20;
		ar[0][2]=30;
		ar[1][0]=40;
		ar[1][1]=50;
		ar[1][2]=60;
		ar[2][0]=70;
		ar[2][1]=80;
		ar[2][2]=90;
		
		System.out.println(ar[0][2]);
		System.out.println(ar[1][2]);
		System.out.println(ar[2][2]);*/
		for(int i=0;i<3;i++)
		{
			for (int j=0;j<3;j++)
			{
				System.out.print(arr[i][j] +" ");
			}
			System.out.println(" ");
	}
	}
}