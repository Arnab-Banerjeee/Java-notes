package day3;

public class My_class 
{
	static class Nested_demo
	{
		public void My_method()
		{
			System.out.println("This is my nested class");
		}
	}
	public static void main(String[] args)
	{
		My_class.Nested_demo nested=new My_class.Nested_demo();
		nested.My_method();
	}

}
