package day8;
import java.io.*;
public class Oldies 
{
	public static void main(String[] args) throws Exception
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the Employee Id");
		int empid=Integer.parseInt(br.readLine());
		System.out.println("Enter the Employee Name");
		String name=br.readLine();
		System.out.println("Enter the Employee Salary");
		float sal=Float.parseFloat(br.readLine());
		System.out.println("Employee Id:"+empid);
		System.out.println("Employee Name:"+name);
		System.out.println("Employee Salary:"+sal);
	}

}
