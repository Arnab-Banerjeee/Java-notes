package day6;
import java.util.*;
public class staex 
{
	public static void main(String args[])
	{
		Stack s=new Stack();
		s.push(10);
		s.push(20);
		s.push(30);
		s.push('A');
		s.push(50);
		s.push("Anmol");
		s.push(70);
		s.push(10);
		System.out.println(s);
		System.out.println(s.pop());
		System.out.println(s);
		System.out.println(s.peek());
		System.out.println(s);
		System.out.println(s.search(20));
		System.out.println(s.search("Anmol"));
	}

}
