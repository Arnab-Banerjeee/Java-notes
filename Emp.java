package day6;
import java.util.*;
public class Emp 
{
	private int empid;
	private String empname;
	private double Salary;
	Emp(int empid,String empname,double Salary)
	{
		this.empid=empid;
		this.empname=empname;
		this.Salary=Salary;
	}
	public String toString()
	{
		return empid+"\t"+empname+"\t\t"+Salary;
	}

}
