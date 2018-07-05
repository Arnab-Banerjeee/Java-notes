package day2;

abstract class abs1 
{
	abstract void display();
	void display1()
	{
		System.out.println("This is concrete method");
	}
}
class Second extends abs1
{
	
	void display()
	{
		System.out.println("This is an override method");
	}
	public static void main(String[] args)
	{
		Second ob=new Second();
		ob.display();
		ob.display1();
	}
	
	
}
