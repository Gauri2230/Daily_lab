class DiamondPattern
{
	public static void main(String[] a)
	{ 
		int j;
		for(int row=0;row<5;row++)
		{
			for( j=0;j<5-row;j++)
			{
				System.out.print(" ");
			}
			for( j=0;j<2*row;j++)
			{

				System.out.print("*");
			}
			System.out.println();
		}
		for(int row=5;row>0;row--)
		{
			for( j=0;j<5-row;j++)
			{
				System.out.print(" ");
			}
			for( j=0;j<2*row;j++)
			{

				System.out.print("*");
			}
			System.out.println();
		}
	}
}