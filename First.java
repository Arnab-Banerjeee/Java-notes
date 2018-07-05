package day2;

public class First 
{
	First()
	{
		System.out.println("This is default constructor");
	}
	First(int a,int b)
	{
		int c=a+b;
		System.out.println("The sum is "+c);
	}
	int sum(int a,int b)
	{
		return a+b;
	}
	float sum(float a,float b)
	{
		return a+b;
	}
	public static void main(String[] args)
	{
		First ob= new First();
		First ob1= new First(17,19);
		First ob2=new First(27,29);
		System.out.println("The sum is "+ob.sum(6,7));
		System.out.println("The sum is "+ob.sum(16.4f, 27.5f));
		System.out.println("The sum is "+ob.sum(16,17));
		System.out.println("The sum is "+ob.sum(26.4f, 37.5f));
	}

}
