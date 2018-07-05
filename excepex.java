package day5;
import java.util.*;
public class excepex 
{
	public static void main(String[] args) throws Exception
	{
		Scanner ob=new Scanner(System.in);
		System.out.println("Enter a Mark ");
	int a=ob.nextInt();
		if(a>0)
			
			System.out.println("ok");
		else
			throw new Exception("Marks should be greater than zero");
	}

}
