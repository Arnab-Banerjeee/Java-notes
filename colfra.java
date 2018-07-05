package day6;
import java.util.*;
public class colfra 
{
	public static void main(String[] args)
	{
		TreeSet ts=new TreeSet();
		ts.add(60);
		ts.add(40);
		ts.add(50);
		ts.add(20);
		ts.add(10);
		ts.add(30);
		System.out.println(ts);
		for(Object x:ts)
			System.out.println(x);
		System.out.println("*********************");
		Iterator ii=ts.iterator();
		while(ii.hasNext())
		{
			System.out.println(ii.next());
			ii.remove();
		}
		System.out.println(ts);
	}

}
