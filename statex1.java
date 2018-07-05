package day3;

public class statex1 
{
	static int a=1;
	void counter()
	{
		a++;
		System.out.println(a);
	}
	public static void main(String[] args)
	{
		statex1 ob=new statex1();
		statex1 ob1=new statex1();
		statex1 ob2=new statex1();
		ob.counter();
		ob1.counter();
		ob2.counter();
	}

}
