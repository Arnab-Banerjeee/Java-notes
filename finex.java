package day3;

public class finex 
{
	final int a=10;
	final void display()
	{
		System.out.println("This is final and value of a is "+a);
	}
	public static void main(String[] args)
	{
		finex ob=new finex();
		ob.display();
	}
}
