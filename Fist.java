package day6;
import java.util.*;
public class Fist 
{
	public static void main(String[] args)
	{
	LinkedList li=new LinkedList();
	Emp ob=new Emp(1,"amit",34000.60);
	Emp ob1=new Emp(2,"peter",3500.60);
	li.add(ob);
	li.add(ob1);
	Iterator it=li.iterator();
	while(it.hasNext())
	{
		System.out.println(it.next());
	}
	}
}
