package day6;
import java.util.*;
public class LinHaS 
{
	public static void main(String[] args)
	{
		LinkedList ts=new LinkedList();
		ts.add(60);
		ts.add(40);
		ts.add(50);
		ts.add(20);
		ts.add(10);
		ts.add(30);
		System.out.println(ts);
		for(Object x:ts)
			System.out.println(x);
		//System.out.println("*********************");
		ListIterator ii=ts.listIterator();
		System.out.println("Forward Direction");
		while(ii.hasNext())
		{
			System.out.println(ii.next());
			//ii.remove();
		}
		System.out.println("Backward Direction");
		while(ii.hasPrevious())
		{
			System.out.println(ii.previous());
			//ii.remove();
		}
		
		//System.out.println(ts);
	}

}
