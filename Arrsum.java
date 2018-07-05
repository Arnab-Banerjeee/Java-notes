package day4;
import java.util.*;
public class Arrsum 
{
	public static void main(String[] args)
	{
		int a[]=new int[10];
		int sum=0;
		Scanner ob=new Scanner(System.in);
		System.out.println("Enter 10 numbers");
		for(int i=0;i<10;i++)
		{
			a[i]=ob.nextInt();
		}
		
		for(int i=0;i<10;i++)
		{
			sum=sum+a[i];
		}
		System.out.println("The sum is "+sum);
	}

}
