package day3;

public class statex 
{
	static int a=10;
	static int b=20;
	static void add()
	{
		int c= a+b;
		System.out.println("The sum is "+c);
	}
	static
	{
		System.out.println("This is static block");
	}
	public static void main(String[] args)
	{
		add();
		System.out.println("The value of a is "+a+"Value of b is "+b);
	}

}
