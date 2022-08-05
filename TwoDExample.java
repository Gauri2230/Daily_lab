import java.util.*;
class TwoDExample
{
	public static void main(String[] args)
	{
		int row=3;
		int col=2;
		int count=1;
		int sum=0;
		int a[][]=new int[row][col];
		Scanner sc= new Scanner(System.in);
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				System.out.println("Enter the marks"+(count++));
				a[i][j]=sc.nextInt();
			}
		}	
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				System.out.print(a[i][j]+"  ");	
			}
			System.out.println();
		}
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				sum+=a[i][j];
			}
		}
		System.out.println(sum);
	}	
}