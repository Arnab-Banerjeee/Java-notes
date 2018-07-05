package day3;

interface first
{
	int number=10;
	void method1();
}
interface second extends first
{
	void method2();
}
interface third extends second
{
	void method3();
}
class Intex implements third
{
	public void method2()
	{
		System.out.println("Method2");
	}
	public void method1()
	{
		System.out.println("Method1");
	}
	public void method3()
	{
		System.out.println("Method3");
	}
	public static void main(String[] args)
	{
		Intex ob=new Intex();
		ob.method1();
		ob.method2();
		ob.method3();
		System.out.println("Number is "+number);
	}
}
