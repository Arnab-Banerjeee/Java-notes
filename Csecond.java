package day2;

 class Cfirst 
{
	int empno;
	String name,address;
	Cfirst(int emp,String na,String add)
	{
		empno=emp;
		name=na;
		address=add;
	}
	void display()
	{
		System.out.println("employee no is "+empno);
		System.out.println("Name is "+name);
		System.out.println("Address is "+address);
	}
}
	public class Csecond extends Cfirst
	{
		float sal;
		String design;
		Csecond(int emp, String na, String add, float sal, String design)
		{
			super(emp,na,add);//parent class executed first
			this.sal=sal;
			this.design=design;
		}
		void display()
		{
			super.display();
			System.out.println("The salary is" +sal+"The designation is "+design);
		}
		public static void main(String[] args)
		{
			Csecond ob= new Csecond(101,"sandip","Pune",450.23f,"officer");
			ob.display();
		}
	}


