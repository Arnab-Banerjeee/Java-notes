package day1;
import java.util.*;
public class Third 
{
	public int roll_no, std;
	public String name;
	public void instu()
	{
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter Roll Number");
		roll_no= obj.nextInt();
		System.out.println("Enter Standard Number");
		std= obj.nextInt();
		System.out.println("Enter Student name");
		name= obj.next();
	}
	
	public void distu()
	{
		System.out.println("Roll No."+roll_no);
		System.out.println("Standard "+std);
		System.out.println("Name: "+name);
	}
	
	public static void main(String[] args)
	{
		Third obj1= new Third();
		obj1.instu();
		obj1.distu();
	}

}
