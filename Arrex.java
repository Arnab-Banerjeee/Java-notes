package day4;
import java.util.*;
public class Arrex 
{
	public static void main(String[] args)
	{
		int a[][]=new int[3][3];
		int b[][]=new int[3][3];
		Scanner ob=new Scanner(System.in);
		System.out.println("Enter 3*3 matrix");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				a[i][j]=ob.nextInt();
			}
		}
		System.out.println("Enter second 3*3 matrix");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				b[i][j]=ob.nextInt();
			}
		}
		
		System.out.println("3*3 Matrix is below");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print((a[i][j]+b[i][j])+"  ");
			}
			System.out.println();
		}
	}

}
