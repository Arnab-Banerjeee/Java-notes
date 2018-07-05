package day4;

public class Strex 
{
	int empno;
	String name,address;
	Strex(int empno,String name,String address)
	{
		this.empno=empno;
		this.name=name;
		this.address=address;
	}
	public String toString()
	{
		return empno+"  "+name+"  "+address;
	}
	public static void main(String[] args)
	{
		Strex ob=new Strex(101,"Sandip","Pune");
		System.out.println(ob);
	}

}
