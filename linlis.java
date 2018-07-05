package day6;
import java.util.*;
public class linlis 
{
	public static void main(String[] args)
	{
		LinkedList l=new LinkedList();
		LinkedList l1=new LinkedList();
		l1.add(100);
		l1.add(200);
		l1.add(300);
		l1.add(400);
		l.add(10);
		l.add(40);
		l.add(20);
		l.add(80);
		l.add(90);
		l.add(50);
		System.out.println(l1);
		System.out.println(l);
		l.addFirst(100);
		System.out.println(l);
		l.addLast(200);
		System.out.println(l);
		l.removeFirst();
		l.removeLast();
		System.out.println(l);
		System.out.println(l.getFirst());
		System.out.println(l.getLast());
		l.addAll(l1);
		System.out.println(l);
	}

}
