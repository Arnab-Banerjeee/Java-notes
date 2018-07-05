package day1;
import java.util.*;
public class Fourth extends Third 
{
	float p,c,m;
	void in()
	{
		super.instu();
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter marks of Physics ");
		p=obj.nextFloat();
		System.out.println("Enter marks of Chemistry");
		c=obj.nextFloat();
		System.out.println("Enter marks of Maths");
		m=obj.nextFloat();
	}
	void add()
	{
		System.out.println("The total marks"+(p+c+m));
	}
	void avg()
	{
		System.out.println("The average marks is "+((p+c+m)/3));
	}
	void disp()
	{
		super.distu();	
	}
    public static void main(String[] args)
    {
    	Fourth obj= new Fourth();
    	obj.in();
		obj.add();
		obj.avg();
		obj.disp();
    }
}
