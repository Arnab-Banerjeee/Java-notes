package day6;
import java.util.*;
public class vec 
{
	public static void main(String[] args)
	{
		Vector vv=new Vector();
		vv.add(10);
		vv.add(40);
		vv.add(20);
		vv.add('A');
		vv.add(90);
		vv.add(50);
		Enumeration en=vv.elements();
		while(en.hasMoreElements())
			System.out.println(en.nextElement());
	}

}
